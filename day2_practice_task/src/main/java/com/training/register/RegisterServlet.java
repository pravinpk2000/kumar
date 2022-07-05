package com.training.register;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.service.TravelService;
import com.training.details.RegisterDetails;
import com.training.repository.ConnectionFactory;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con = null;
	private TravelService service = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {

		super.init();
		try {
			con = ConnectionFactory.getPostgressConnection();
			service = new TravelService(con);

			System.out.println("Connection= " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String path = request.getServletPath();
		System.out.println(path);
		
		switch (path) {
		case "/":
			homePage(request,response);
			break;
			
		case "/validate":
			validatepage(request,response);

		default:
			break;
		}
		
		
	}
	private void validatepage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/validation.jsp");
		rd.forward(request, response);		
	}
	private void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getServletPath();
		System.out.println(path);
		
		switch (path) {
		case "/add":
			addDetails(request,response);
			break;
		default:
			break;
		}

	}
	private void addDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("UserName");
		String name = request.getParameter("Name");
		String phone = request.getParameter("Phone");
		String mailid = request.getParameter("Email");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("Age"));
		String gender = request.getParameter("Gender");
		String contact = request.getParameter("ContactNumber");
		
		RegisterDetails details= new RegisterDetails(username,name,phone,mailid,password,age,gender,contact);
		
		
		RegisterDetails entry = service.add(details);
		
		RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
		rd.forward(request, response);
	}
	

	}


