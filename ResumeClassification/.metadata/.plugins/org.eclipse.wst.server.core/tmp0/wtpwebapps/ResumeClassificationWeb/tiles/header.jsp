
<%@page import="java.util.List"%>

<%@page import="com.database.ConnectionManager"%>
<%@page import="com.helper.UserModel"%>
<div class="main-header">
	<div class="logo-header">
		<a href="index.html" class="logo">Resume Classification</a>
		<button class="navbar-toggler sidenav-toggler ml-auto" type="button"
			data-toggle="collapse" data-target="collapse" aria-controls="sidebar"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<button class="topbar-toggler more">
			<i class="la la-ellipsis-v"></i>
		</button>
	</div>
	<nav class="navbar navbar-expand-sm bg-primary navbar-project1">
		<div class="container-fluid">
			<%
				UserModel um = (UserModel) session.getAttribute("USER_MODEL");
				String user = "";
				if (um != null) {

					if (um.getRole().equalsIgnoreCase("1"))

						user = "Recruiter";
					else
						user = "Candidate";
			%>

			<ul class="navbar-nav topbar-nav ml-md-auto align-items-center">




				<li class="nav-item dropdown"><a
					class="dropdown-toggle profile-pic" data-toggle="dropdown" href="#"
					aria-expanded="false"> <img
						src="<%=request.getContextPath()%>/theme/assets/img/profile.png"
						alt="user-img" width="36" class="img-circle"><span><%=user%></span>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li>
							<div class="user-box">
								<!-- 								<div class="u-img"> -->
								<!-- 									<img -->
								<%-- 										src="<%=request.getContextPath()%>/theme/assets/img/profile.png" --%>
								<!-- 										alt="user"> -->
								<!-- 								</div> -->
								<div class="u-text">
									<h4><%=um.getEmail()%></h4>
								</div>
							</div>
						</li>
						<li>
							<%
								}
							%> <a class="dropdown-item"
							href="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=logout"><i
								class="la la-sign-out"></i> Logout</a>
						</li>
					</ul></li>
			</ul>
		</div>
	</nav>
</div>