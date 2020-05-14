
<%@page import="com.helper.UserModel"%>
<%@page import="com.database.ConnectionManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=utf-8 />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../tiles/inc.jsp"></jsp:include>

</head>
<body>
	<div class="wrapper">

		<jsp:include page="../tiles/header.jsp"></jsp:include>
<%UserModel um = (UserModel ) session.getAttribute("USER_MODEL");
String name = "Guest";
String description = "";
String role = "";
if(um !=null){
	name = um.getFname() +" "+um.getLname();
	role = um.getRole().equalsIgnoreCase( "1") ? "Recruiter" :" Student";
	if(um.getRole().equalsIgnoreCase("1")){
		description = "You can Upload Job Details and search best Employee Accordingly";
	}else{
		description = "You can Upload Your Details and search best Job";
	}
}

%>
		<jsp:include page="../tiles/menu.jsp"></jsp:include>
		<div class="main-panel">
			<div class="content">
				<div class="container-fluid">
					<h4 class="page-title"> <%=role %> Dashboard</h4>
					<div class="row"></div>

					<div class="row row-card-no-pd">

						<div class="col-md-12">
							<div class="card card-tasks text-center">
									<%
									
									
									
									%>
									<h3> Welcome <%=name %></h3>
									<small><%=description %></small>
								<div class="card-body ">
								</div>
							</div>
						</div>
					
					
					</div>

				</div>
			</div>

			<jsp:include page="../tiles/footer.jsp"></jsp:include>
		</div>
	</div>
	</div>
	<!-- Modal -->

</body>

<jsp:include page="../tiles/footerinc.jsp"></jsp:include>
</html>