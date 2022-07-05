 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img alt="image" src="image/ami.jpg" width="1000px"height="700px">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4" align="center">

				

			</div>
			<div class="col-md-4"></div>




		</div>

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4" align="center">
				<form action="validate" method="get">

			<div class="col-md-4" style= "top:50%;left:50%;position: absolute"></div>
					<div>
						<label for="username" style="color:brown">UserName</label><input type="text"
							name="UserName" id="username" />
					</div>
					
						<div>
						<p style="color: red">

							<c:out value="${message2}"></c:out>

						</p>


					</div>
					<div>
						<label for="password" style="color:brown">Password</label><input type="text"
							name="password" id="password" />
					</div>
					
					<div>
						<p style="color: red">

							<c:out value="${message3}"></c:out>

						</p>


					</div>
					<input type="submit" value="log-in"> <input
						type="submit" value="Resgister" formaction="register.jsp">


				</form>



			</div>
			<div class="col-md-4"></div>

		</div>




	</div>
</head>
<body>

</body>
</html>