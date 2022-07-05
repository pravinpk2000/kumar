<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div= "container-fluid">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-5">
				<h1 align="center" style="color: gray">PASSENGER DETAILS</h1>

			</div>
			<!--   <div class="col-md-3"> -->

			<!--   </div> -->
		</div>
		</div>
		<div class="row">
			<div class="col-md-4"></div>


			<form action="add" method="post">
				<div>
					<label for="">UserName</label><input style="margin-left: 19px"
						type="text" name="UserName" id="name">
				</div>
				<div>
					<label for="">Name</label><input style="margin-left: 50px"
						type="text" name="Name">
				</div>
				<div>
					<label for="">Phone</label><input style="margin-left: 46px"
						type="text" name="Phone">
				</div>
				<div>
					<label for="">Email</label><input style="margin-left: 55px"
						type="text" name="Email">
				</div>
				<div>
					<label for="">password</label><input style="margin-left: 25px"
						type="text" name="password">
				</div>
				<div>
					<label for="">Age</label><input style="margin-left: 65px"
						type="text" name="Age" id="age" required="required" />
				</div>
				<div>
					<label for="">Gender</label><select name="Gender">
						<option>Male</option>
						<option>Female</option>
						<option>others</option>
					</select>
				</div>
				<div>
					<label for="">ContactNumber</label><input style="margin-left: 10px"
						type="text" name="ContactNumber" id="contactnumber"
						pattern="[0-9]{10}" />
				</div>

				<div>
					<input type="submit" value="save" class="btn success-btn">

					<input type="reset" value="clear" class="btn danger-btn">
				</div>
		</div>
		</form>
</body>
</html>