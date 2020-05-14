
<%@page import="com.database.ConnectionManager"%>
<%@page import="com.helper.JobModel"%>
<%@page import="com.helper.UserModel"%>
<%@page import="com.helper.StudentModel"%>
<%@page import="java.util.List"%>
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

		<jsp:include page="../tiles/menu.jsp"></jsp:include>
		<div class="main-panel">
			<div class="content">
				<div class="container-fluid">
					<h4 class="page-title">Skills</h4>
					<div class="row"></div>

					<div class="row row-card-no-pd">

						<div class="col-md-12">
							<div class="card card-tasks">

								<div class="card-body ">
									<div class="card-sub">
										<b>Recommendation Of Skills Needs To Improve </b>
									</div>

									<%
										UserModel um = (UserModel) session.getAttribute("USER_MODEL");
										String userId = um.getUid();
										List list = ConnectionManager.getRecommendation(userId);
										int i = 0;
										for (i = 0; i < list.size(); i++) {
											JobModel sm = (JobModel) list.get(i);
											%>
											
											
											
											<div class="card-sub"><%=sm.getSkillsrequired()%></div>
											<%} %>
									
								

								</div>
							</div>
						</div>


					</div>

				</div>
			</div>

			<jsp:include page="../tiles/footer.jsp"></jsp:include>
		</div>
	</div>


	<jsp:include page="../tiles/footerinc.jsp"></jsp:include>

</body>

</html>