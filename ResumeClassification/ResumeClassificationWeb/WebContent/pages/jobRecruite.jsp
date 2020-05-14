
<%@page import="com.constant.ServerConstants"%>
<%@page import="java.util.List"%>
<%@page import="com.helper.UserModel"%>
<%@page import="com.database.ConnectionManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
					<div class="row"></div>

					<div class="col-md-12">
						<div class="card">
							<div class="card-header">
								<div class="card-title">Job Post</div>
							</div>
							<div class="card-body ">
								<div class="table-full-width">
									<div class="col-md-12">
										<form class="navbar-left navbar-form nav-search mr-md-3"
											method="post" enctype="multipart/form-data"
											action="javascript:fnSubmit();" id="myform">
											<div class="row">
												<div class="card-header col-md-6">


													<input type="hidden" name="uid">

													<!-- 											Job Title: -->
													<input type="text" name="jobtitle" placeholder="Job Title"
														required="required" class="form-control btn-default"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">

													<!-- 												Required Experience: -->
													<select class="form-control " id="reuireexp"
														name="reuireexp"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
														<option>Select Experience Criteria</option>
														<%for(int ex=0; ex<ServerConstants.Experience_Criteria.length; ex++){ %>
														<option value="<%=ex%>">
														<%=ServerConstants.Experience_Criteria[ex]%></option>
														<%} %>
													</select>

													<!-- package: -->
													<select class="form-control " id="package" name="package"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
														<option>Projected CTC </option>
														<option value="No Bars on Salary">No Bars on Salary</option>
														<option value="00-3 LPA">00-3 LPA</option>
														<option value="3-6 LPA">3-6 LPA</option>
														<option value="6-10 LPA">6-10 LPA</option>
														<option value="10 LPA and above">10 LPA and above</option>
														

													</select>
													<!-- Skill Required: -->

													<input type="text" name="skills"
														placeholder="Technical Skills" required="required"
														class="form-control btn-default"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
														<small>Ex. HTML, SQL, Android, JAVA, AWS</small>
													<!-- Skill Required: -->



													
													
													<div class="row">
													<div class="col-md-12">
													<br>
														<label> &nbsp;&nbsp;&nbsp; Select Domain Of Technical Skill</label>
													</div>
														<div class="col-md-6">
															
															<input type="checkbox" name="s" id="s"
																value="Frontend," onclick="add_sub(this);"><label
																for="bob">Front_End</label><br> <input
																type="checkbox" name="s1" id="s1"
																value="ML," onclick="add_sub(this);"><label
																for="bob1">Machine Learning</label><br> <input
																type="checkbox" name="s2" id="s2"
																value="Backend," onclick="add_sub(this);"><label
																for="bob2">Back_End</label><br> 
															<input
																type="checkbox" name="s5" id="s5" value="Devops"
																onclick="add_sub(this);"><label for="bob2">
																Devops</label>
														</div>
														<div class="col-md-6">
															<input type="checkbox" name="s3" id="s3" value="Testing,"
																onclick="add_sub(this);"><label for="bob">Software Testing</label><br>
															<input type="checkbox" name="s3" id="s3" value="Cloud,"
																onclick="add_sub(this);"><label for="bob">Cloud Computing</label><br>
															<input type="checkbox" name="s4" id="s4"
																value="Android," onclick="add_sub(this);"><label
																for="bob1">Android</label>
														</div>
													</div>
													<br>
<textarea name="skillsdomain" rows="4" cols="35"
														class="form-control" onclick="this.focus();this.select();"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">

</textarea>







													<BR>
													<!-- 													<button type="submit" class="form-control btn btn-default"> -->
													<!-- 														<i class="la la-cloud-upload" style="font-size: 20px"></i> -->
													<!-- 														Upload -->
													<!-- 													</button> -->

												</div>

												<div class="card-header col-md-6">


													<!-- 													Notice Period: -->
													<select class="form-control " id="notice" name="notice"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
														<option>Select Notice Period</option>
														<option value="Immediate">Immediate</option>
														<option value="7 Days">7 Days</option>
														<option value="15 Days">15 Days</option>
														<option value="1 Months">1 Months</option>
													</select>


													<!-- Company Name: -->
													<input type="text" name="cname" placeholder="Company Name"
														required="required" class="form-control btn-default"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">

													<!--Job location: -->
													<input type="text" name="jlocation"
														placeholder="Job Location" required="required"
														class="form-control btn-default"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">


													<br> <br>
													<div style="width: 70%">
														<button type="submit"
															class="btn btn-default btn-submit float-right">
															<i class="la la-plus" style="font-size: 20px"></i> Add
															Job
														</button>
													</div>

												</div>
											</div>
										</form>
									</div>
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
	<jsp:include page="../tiles/footerinc.jsp"></jsp:include>
</body>
<script type="text/javascript">
function add_sub(el){
if (el.checked)
el.form.elements['skillsdomain'].value+=el.value;
else{
var re=new RegExp('(.*)'+el.value+'(.*)$');
el.form.elements['skillsdomain'].value=el.form.elements['skillsdomain'].value.replace(re,'$1$2');
}
}
</script>
<script type="text/javascript">
function fnSubmit(){	
var str = $("#myform" ).serialize();
$.post("<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=postJob",
						str, function(data) {
							data = $.trim(data);
							if (data==1) {
								alert("Job Post Successfully");
								window.location.href="<%=request.getContextPath()%>/pages/jobRecruite.jsp";

							} else {
								alert("Error");
							}

							$('#myform')[0].reset();
						});

	}
</script>

</html>