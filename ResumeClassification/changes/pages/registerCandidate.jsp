<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../tiles/inc.jsp"></jsp:include>

</head>
<body style="background-color: #0261b0">

	<%-- 		<jsp:include page="../tiles/header.jsp"></jsp:include> --%>

	<%-- 		<jsp:include page="../tiles/menu.jsp"></jsp:include> --%>



	<div class="" align="center"
		style="margin-top: 50px; margin-bottom: 50px;">
		<h1 style="color: white; font-family: arial;">Resume
			Classification Portal</h1>
		<div class="col-md-4">
			<div class="card">
				<div class="card-header">
					<div class="card-title">Candidate Registration</div>
				</div>
				<div class="card-body">
					<form method="post" enctype="multipart/form-data"
					action="javascript:fnSubmit();" 
						name="myform" id="myform">

						<div class="form-group has-success" align="left">
							<label for="successInput">First Name</label><br> <br> <input
								type="text" id="fname" name="fname" placeholder="First Name"
								class="form-control" required="required">
						</div>
						<div class="form-group has-success" align="left">
							<label for="successInput">Last Name</label><br> <br> <input
								type="text" id="lname" name="lname" placeholder="Last Name"
								class="form-control" required="required">
						</div>
						<div class="form-group has-success" align="left">
							<label for="successInput">Mobile Number</label><br> <br>
							<input type="text" id="phone" name="phone"
								placeholder="Mobile Number" class="form-control" pattern="[0-9]{10}"
					title="Accepted 10 Digit Only" required="required">
						</div>
						<div class="form-group has-success" align="left">
							<label for="successInput">Register Email</label><br> <br>
							<input type="email" id="email" name="email"
								placeholder="Email Id" class="form-control" required="required">
						</div>
						<div class="form-group has-success" align="left">
							<label for="successInput">Password</label><br> <br> <input
								type="password" id="password" name="password"
								placeholder="Password" class="form-control" required="required">
						</div>
						<div class="form-group has-success" align="left">
							<label for="successInput">Confirm Password</label><br> <br>
							<input type="password" id="cpass" name="cpass"
								placeholder="Re-Enter Password" class="form-control" required="required">
						</div>



						<div class="card-action" align="left">
							<button type="submit" class="btn btn-submit btn-success">Register
								User</button>
							<button type="reset" class="btn btn-danger">Reset</button>
							<br> <br> <a
								href="<%=request.getContextPath()%>/pages/login.jsp">Already
								user login here..!!</a>
						</div>
					</form>
				</div>
			</div>

		</div>
</body>
<script type="text/javascript">
function fnSubmit(){	
	var str = $("#regform" ).serialize();
	var pass = $('#password').val();
	var cpass = $('#cpass').val();
	if(pass != cpass){
		alert('password and confirm password should match');
		$('#password').css({ "border": '#FF0000 1px solid'});
		$('#cpass').css({ "border": '#FF0000 1px solid'});
		return;		
	}

var str = $("#myform" ).serialize();
$.post("<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=registerCandidate",
						str, function(data) {
							data = $.trim(data);
							if (data==1) {
								window.location.href="<%=request.getContextPath()%>/pages/login.jsp";
							} else {
								alert("Error");
							}

							$('#myform')[0].reset();
						});

	}
</script>
<jsp:include page="../tiles/footerinc.jsp"></jsp:include>
</html>