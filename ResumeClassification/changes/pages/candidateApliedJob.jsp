
<%@page import="com.database.ConnectionManager"%>
<%@page import="com.helper.JobModel"%>
<%@page import="com.helper.UserModel"%>
<%@page import="com.helper.StudentModel"%>
<%@page import="java.util.List"%>
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
	<%
		UserModel um = (UserModel) session.getAttribute("USER_MODEL");
		String userId = um.getUid();
		//	List applicantList = ConnectionManager.getAppliedCandidates(jid);
	%>
	<div class="wrapper">

		<jsp:include page="../tiles/header.jsp"></jsp:include>

		<jsp:include page="../tiles/menu.jsp"></jsp:include>
		<div class="main-panel">
			<div class="content">
				<div class="container-fluid">
					<h4 class="page-title">Applications</h4>
					<div class="row"></div>

					<div class="row row-card-no-pd">

						<div class="col-md-12">
							<div class="card card-tasks">

								<div class="card-body ">
									<table class="table table-striped table-striped-bg- mt-4"
										id="jobs">
										<thead>
											<tr>
												<th scope="col">Sr. No.</th>
												<th scope="col">Job Title</th>
												<th scope="col">Experience Required</th>
												<th scope="col">Packages</th>
												<th scope="col">Skills</th>
												<th scope="col">Notice Period</th>
												<th scope="col">Company</th>
												<th scope="col">Job Location</th>

											</tr>
										</thead>
										<tbody>
											<%
												List list = ConnectionManager.getCandidateAppliedJob(userId);

												int i = 0;
												for (i = 0; i < list.size(); i++) {
													JobModel jm = (JobModel) list.get(i);
													String jid = jm.getJid();
											%>
											<tr <%=i + 1%>>
												<td><%=i + 1%></td>
												<td><%=jm.getJobtitle()%></td>
												<td><%=jm.getExperiencerequired()%></td>
												<td><%=jm.getPackag()%></td>
												<td><%=jm.getSkillsrequired()%></td>
												<td><%=jm.getNoticeperiod()%></td>
												<td><%=jm.getCompaneyname()%></td>
												<td><%=jm.getLocation()%></td>



											</tr>
											<%
												}
											%>
										</tbody>
									</table>

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