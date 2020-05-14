
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
					<h4 class="page-title">Search Candidates</h4>
					<form class="navbar-left navbar-form nav-search mr-md-3" action="">
						<div class="col-md-6">
							<div class="input-group">
								<input type="text"
									placeholder="Search Candidates Skills Wise..."
									class="form-control" id="searchsSkills">
								<div class="input-group-append">
									<span class="input-group-text"> <i
										class="la la-search search-icon" onclick="skillSearch()"></i>
									</span>
								</div>
							</div>
						</div>
					</form>

					<div class="row row-card-no-pd mt-4">

						<div class="col-md-12">
							<div class="card card-tasks">

								<div class="card-body ">
									<div class="card-sub"></div>
									<table class="table table-striped table-striped-bg- mt-4"
										id="skills">
										<thead>
											<tr>
												<th scope="col">Sr. No.</th>
												<th scope="col">Candidate Name</th>
												<th scope="col">Skills</th>
												<th scope="col">Score</th>
												<th scope="col">Experience</th>
												<th scope="col">Action</th>

											</tr>
										</thead>
										<tbody>
											<%
// 												
                                               List list = ConnectionManager.getskills();
												int i = 0;
												for (i = 0; i < list.size(); i++) {
													StudentModel sm = (StudentModel) list.get(i);
													String data = sm.getScore();
													String uid=sm.getUid();
													UserModel um =null;
												
												 um= ConnectionManager.getUserDetails(uid);
											%>
											<tr <%=i + 1%>>
												<td><%=i + 1%></td>
												<td><%=um.getFname()%> <%=um.getLname() %></td>
												<td><%=sm.getSkills()%></td>
												<td><span class=""><%=sm.getScore()%></span></td>
												<td><%=sm.getExperience()%></td>
												<td><button class="btn btn-sm btn-success btn-round">
												<a href="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=viewFile&uid=<%=uid%>"  target="_blank">
														<i class="la la-cloud-download mr-1"></i>Get Resume
													</button></a></td>

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


	<jsp:include page="../tiles/footerinc.jsp"></jsp:include>
</body>

<script>
	$(document).ready(
			function() {
				$("#searchsSkills").on(
						"keyup",
						function() {
							var value = $(this).val().toLowerCase();
							$("#skills tr").filter(
									function() {
										$(this).toggle(
												$(this).text().toLowerCase()
														.indexOf(value) > -1)
									});
						});
			});
	$.fn.stars = function() {
		return $(this).each(function() {
			// Get the value
			var val = parseFloat($(this).html());
			// Make sure that the value is in 0 - 5 range, multiply to get width
			var size = Math.max(0, (Math.min(5, val))) * 16;
			// Create stars holder
			var $span = $('<span />').width(size);
			// Replace the numerical value with stars
			$(this).html($span);
		});
	}
	$(function() {
		$('span.stars').stars();
	});
</script>

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