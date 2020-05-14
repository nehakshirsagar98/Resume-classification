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

	<div class="wrapper">

		<jsp:include page="../tiles/header.jsp"></jsp:include>

		<jsp:include page="../tiles/menu.jsp"></jsp:include>
		<div class="main-panel">
			<div class="content">
				<div class="container-fluid">
					<h4 class="page-title">Resume</h4>
					<div class="row"></div>

					<div class="row row-card-no-pd">

						<div class="col-md-12">
							<div class="card card-tasks">

								<div class="card">
									<div class="card-header">
										<div class="card-title">Resume Details</div>
									</div>
									<div class="card-body">
										<div class="card-sub"></div>



										<table class="table table-striped table-striped-bg- mt-4">
											<thead>
												<tr>
													<th scope="col">Sr. No.</th>
													<th scope="col">Degree</th>
													<th scope="col">Experience</th>
													<th scope="col">No. Of Project</th>
													<th scope="col">Designation</th>
													<th scope="col">Percentage </th>
													<th scope="col">Current CTC</th>
													<th scope="col">Expected CTC</th>
													<th scope="col">Prefered Location</th>													
													<th scope="col">Action</th>
													
												</tr>
											</thead>
											<tbody>
												<%
												     UserModel um = (UserModel) session.getAttribute("USER_MODEL");
											         String uId=um.getUid();
													 List list = ConnectionManager.getResumeDetails(uId);

													int i = 0;
													for (i = 0; i < list.size(); i++) {
														StudentModel sm = (StudentModel) list.get(i);
												%>
												<tr <%=i + 1%>>
													<td><%=i + 1%></td>
													<td><%=sm.getDegree()%></td>
													<td><%=sm.getExperience()%></td>													
													<td><%=sm.getProjectscount()%></td>
													<td><%=sm.getDesignation()%></td>
													<td><%=sm.getPercentage()%></td>
													<td><%=sm.getCurrentctc()%></td>
													<td><%=sm.getExpectedctc()%></td>
													<td><%=sm.getPreferedlocations()%></td>
												
													<td><button class="btn btn-info" onclick=""><a href="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=viewFile&uid=<%=uId%>"
																 target="_blank" type="application/pdf">
                                      <i class="la la-cloud-download"></i>
														Download</a></button></td>

												</tr>
												<%
													}
												%>
											</tbody>
										</table>
									</div>
									 <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal">
												 <img data-toggle="tooltip" title="Displaying Pi chart For Uploaded Resume" class="rounded-circle mx-auto d-block" height="auto" width="50%"
												 src="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=showImage&pid=<%=um.getUid()%>" 
												 alt="Resultant Pi Chart image Displayed Here">
												</button>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="../tiles/footer.jsp"></jsp:include>
		</div>
	</div>
		<!-- Modal -->

</body>

<jsp:include page="../tiles/footerinc.jsp"></jsp:include>

<script type="text/javascript">
function fnShowValue(a,b){	
// 	alert(b);
	document.getElementById('docid').value=a;
	
	document.getElementById('docname').innerHTML='Document Name : '+b;
	
	$("#modalUpdate1").modal("show");
}



function fnViewDoc(did){	
// 	alert(b);
// 	document.getElementById('docid').value=a;
	
// 	document.getElementById('docname').innerHTML='Document Name : '+b;
	//$("#"+a).modal("show");
		s='';
params = 'scrollbars=no,resizable=no,status=no,location=no,toolbar=no,menubar=no,width=1000,height=700';
s2="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=viewFile&resumetitle="+did+"&inline=1";
	window.open(s2, 'My PDF', params);
	
}
	
</script>
</html>