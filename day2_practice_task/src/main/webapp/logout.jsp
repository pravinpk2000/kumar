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
<div>
<p style="background-color: yellow;display: inline;">

<c:out value="${message}"></c:out>

</p>

<p style="color: green">

<c:out value="${message1}"></c:out>

</p>



</div>


<div class="container-fluid">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4" align="center">

				<img alt="" src="image/jc.jpg">

			</div>
			<div class="col-md-4"></div>




		</div>

		<div class="row">
			<div class="col-md-4"></div>

			<div class="col-md-4" align="center">
				<form>
					<div>
						<input type="submit" value="Logout" formaction="login.jsp">
						<input type="submit" value="Register" formaction="register.jsp">
					</div>
					
					


				</form>



			</div>
			<div class="col-md-4"></div>

		</div>





	</div>

</body>
</html>