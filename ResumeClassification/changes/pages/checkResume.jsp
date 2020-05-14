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
String id = request.getParameter("id");
String data = request.getParameter("score");

String score = "Upload Resume to View Skills";
if(data != null){
	score = data;
}
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
                                    action="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=checkResume">
                                    <div class="row">
                                       
                                       <div class="card-header col-md-6">
                                          <!-- 													Designation: -->
                                         Upload Resume: <BR> <input class="btn btn-default "
                                             accept="application/pdf" required="required" type="file"
                                             name="file" id="file" class="form-control"
                                             style="width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a;">
                                          <br><br>
                                          <div style="width: 70%">
                                             <button type="submit"
                                                class="btn btn-default btn-submit">
                                             <i class="la la-cloud-upload" style="font-size: 20px"></i>
                                             Upload
                                             </button>
                                             
                                          </div>
                                          <br><br>
                                          <%if(score != null){ %>
                                          <div id="scoreDiv" >
                                          	<h5>Skills: <%=score%></h5>	
                                          </div>
                                          <%} %>
                                       </div>
                                       <div class="card-header col-md-6">
                                       <%if(id != null){ %>
                                       <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal">
												 <img data-toggle="tooltip" title="Displaying Pi chart For Uploaded Resume" class="rounded-circle mx-auto d-block" height="auto" width="100%" src="<%=request.getContextPath()%>/tiles/ajax.jsp?methodId=showImage&pid=<%=id%>" alt="Resultant Pi Chart image Displayed Here">
												</button>
                                       <%} %>
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
