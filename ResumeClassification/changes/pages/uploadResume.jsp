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
   <%
UserModel um = (UserModel) session.getAttribute("USER_MODEL");
String uid=um.getUid();
%>
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
                           <div class="card-title">Upload Resume</div>
                        </div>
                        <div class="card-body ">
                           <div class="table-full-width">
                              <div class="col-md-12">
                                 <form class="navbar-left navbar-form nav-search mr-md-3"
                                    method="post" enctype="multipart/form-data"
                                    action="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=uploadResume">
                                    <div class="row">
                                       <div class="card-header col-md-6">
                                       <input type="hidden" name="<%=uid%>" id="<%=uid%>">
                                          <!-- 													Qualification: -->
<!--                                           <input type="text" name="degree" -->
<!--                                              placeholder="Qualification" required="required" -->
<!--                                              class="form-control btn-default" -->
<!--                                              style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" required="required"> -->
                                         
                                         <select class="form-control " id="degree"
														name="degree" required="required"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
														<option>Select Qualification</option>
														<option value="BE / BTech">BE / BTech</option>
														<option value="ME / MTech">ME / MTech</option>
														<option value="BA / BCA / BSC / BCS">BA / BCA / BSC / BCS</option>
														<option value="MA / MCA / MSC / MCS">MA / MCA / MSC / MCS</option>
														<option value="Other">Other Education</option>
													</select>
                                          <!-- 													Experience: -->
<!--                                           <input type="text" name="exp" placeholder="Experience" -->
<!--                                              required="required" class="form-control btn-default" -->
<!--                                              style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" pattern="[0-9]{2}" -->
<!-- 					title="Accepted Digit Only" required="required" > -->
					
					<!-- 												Required Experience: -->
													<select class="form-control " id="exp"
														name="exp" required="required"
														style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
														<option>Select Experience Criteria</option>
														<option value="Fresher to 1 Year">Fresher to 1 year</option>
														<option value="1 Year To 3 Year">1 Year To 3 Year</option>
														<option value="3 Year To 5 Year">3 Year To 5 Year</option>
														<option value="5 Year To 10 Year">5 Year To 10 Year</option>
														<option value="10 Year above">10 Year above</option>
													</select>
					
                                          <!-- Project count: -->
                                          <input type="Number" name="projectcount"
                                             placeholder="Project Count" required="required"
                                             class="form-control btn-default"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px">
                                          <!-- Percentage: -->
                                          <input type="text" name="percentege"
                                             placeholder="Overall Aggregate Percentage %" required="required"
                                             class="form-control btn-default"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" pattern="[0-9]{2}"
					title="Accepted Digit Only" required="required">
                                          <!-- 												Prefered Location: -->
                                          <textarea type="text" name="location"
                                             placeholder="Prefered Location" required="required"
                                             class="form-control btn-default"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" required="required"></textarea>
                                          <BR>
                                          <!-- 													<button type="submit" class="form-control btn btn-default"> -->
                                          <!-- 														<i class="la la-cloud-upload" style="font-size: 20px"></i> -->
                                          <!-- 														Upload -->
                                          <!-- 													</button> -->
                                       </div>
                                       <div class="card-header col-md-6">
                                          <!-- 													Designation: -->
                                          <input type="text" name="designation"
                                             placeholder="Designation / Qualification Domain" required="required"
                                             class="form-control btn-default"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" required="required">
                                          <!-- Current CTC: -->
                                          <input type="text" name="cctc" placeholder="Current CTC"
                                             required="required" class="form-control btn-default"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" required="required">
                                          <!-- Expected  CTC: -->
                                          <input type="text" name="ectc" placeholder="Expected CTC"
                                             required="required" class="form-control btn-default"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px" required="required">
                                          Updated Resume: <BR> <input class="btn btn-default "
                                             accept="application/pdf" required="required" type="file"
                                             name="file" id="file" class="form-control"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a;">
                                          <br><br>
                                          <div style="width: 70%">
                                             <button type="submit"
                                                class="btn btn-default btn-submit float-right">
                                             <i class="la la-cloud-upload" style="font-size: 20px"></i>
                                             Upload
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
        <!-- Modal -->
      <jsp:include page="../tiles/footerinc.jsp"></jsp:include>
   </body>
   <script></script>
</html>
