<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../tiles/inc.jsp"></jsp:include>

</head>

<body >
	<div class="" align="center"
		style="margin-top: 100px; margin-bottom: 50px;">
		<h1 style="color: white; font-family: arial;">Resume
			Classification Portal</h1>
		<div class="col-md-4">
			<div class="card">
				<div class="card-header">
					<div class="card-title">Login</div>
				</div>
				<div class="card-body" >
					<form id="loginform" name="loginform"
						action="javascript:fnSubmit();">
						<div class="form-group has-success" align="left">
							<label for="successInput">Email</label><br> <br> <input
								type="text" id="email" name="email" placeholder="Email"
								class="form-control" required>
						</div>
						<div class="form-group has-success" align="left">
							<label for="successInput">Password</label><br> <br> <input
								type="password" id="password" name="password"
								placeholder="Password" class="form-control"  required>
						</div>

						<div class="card-action" align="left">
							<div class="row">
								<div class="col-sm-6">
									<button type="submit" class="btn btn-success">Login</button>
								</div>
							</div>
						</div>
					</form>
					<div class="col-sm-6">
						<div class="row">

							<a
								href="<%=request.getContextPath()%>/pages/registerRecruiter.jsp"
								class="">Register AS New<b class="ml-1">Recruiter</b></a>
						</div>

						<div class="row">
							<a
								href="<%=request.getContextPath()%>/pages/registerCandidate.jsp"
								class="">Register AS New <b class="ml-1">Candidate</b></a>
						</div>
					</div>
				</div>
			</div>


		</div>
	</div>

</body>
<script type="text/javascript">
function fnSubmit(){	
	var str = $("#loginform" ).serialize();
	//alert(str);
	$.post("<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=checkLogin",
						str, function(data) {		
		                    data = $.trim(data);
								if (data==1) {								
								window.location.href="<%=request.getContextPath()%>/pages/dashboard.jsp";
							} else {
								alert("Please Enter Valid Credentials");
							}
							$('#loginform')[0].reset();
						});
	}
</script>
<jsp:include page="../tiles/footerinc.jsp"></jsp:include>
</html>