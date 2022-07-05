<%@page import="com.training.repository.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="com.training.repository.ConnectionFactory"%>
    <%@ page import="java.lang.*" %>
    <%@ page import="java.sql.*" %>
    <%@ page session="true" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String password; %>
<%! String UserName; %>
<%! int status=0;  %>
<%
Connection con = null;
//PreparedStatement stmt=null;
Statement stmt=null;
ResultSet rs=null;
try{
	UserName = request.getParameter("UserName");
    password = request.getParameter("password");
    
 	//System.out.println("user_id = "+user+"\t"+"pass_word = "+pass_word);
	con=ConnectionFactory.getPostgressConnection();
	System.out.print(con);


String sql = "SELECT UserName,password FROM Register1 WHERE UserName='"+UserName+"' and password='"+password+"';";
System.out.println(sql);
//stmt= con.prepareStatement(sql);
/* stmt.setString(1, user);
stmt.setString(2, pass_word); */
stmt=con.createStatement();
rs=stmt.executeQuery(sql);
String userName=null;
String password=null;
if(rs.next())
{
	
	UserName=rs.getString("UserName");
	 password=rs.getString("password");
	
	 status=1;
	
}
if(status==1){
	if(UserName.equals(UserName) && password.equals(password))
	{
		System.out.println("valid user"+UserName);
		request.setAttribute("message", "Welcome :"+UserName);
		request.setAttribute("message1", "successfully logged In");
		RequestDispatcher dispatcher=request.getRequestDispatcher("logout.jsp");
		dispatcher.forward(request, response);
		
		
	}
		
}

if(status==0){
	System.out.println("Invalid user");
	request.setAttribute("message2", "invalid username"); 
	request.setAttribute("message3", "invalid password");
	RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
	dispatcher.forward(request, response);
}


}
catch(Exception e){
	
	e.printStackTrace();
}
 
%>
</body>
</html>