<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="com.database.ConnectionManager"%>
<%@page import="com.helper.UserModel"%>
<link rel="stylesheet"
	href="http://www.jacklmoore.com/colorbox/example1/colorbox.css" />
<div class="sidebar">
	<div class="scrollbar-inner sidebar-wrapper">
		<%
			UserModel um = (UserModel) session.getAttribute("USER_MODEL");
			String user = um.getUid();
			System.out.println(um.getRole());
			if (um != null) {

				if (um.getRole().equalsIgnoreCase("1")) {
		%>

		<div class="user">
			<div class="photo">
				<img
					src="<%=request.getContextPath()%>/theme/assets/img/profile.png">
			</div>
			<div class="info">
				<a class=""> <span> <span
						class="user-level text-capitalize "><%=um.getFname()%> <%=um.getLname()%></span>
						<%=um.getEmail()%>
				</span>
				</a>
				<div class="clearfix"></div>
			</div>
		</div>
		<ul class="nav">
			<li class="nav-item update-pro">
			 <a type="button"
				href="<%=request.getContextPath()%>/pages/dashboard.jsp  "> <i
					class="la la-home"></i>
					<p>Home</p>
			</a>
			</li>
<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/checkResume.jsp"> <i
					class="
                  la la-cloud-upload"></i>
					<p>Upload Resume</p>
			</a></li>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/jobRecruite.jsp"> <i
					class="
                  la la-laptop"></i>
					<p>Post Job</p>
			</a></li>

			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/searchCandidates.jsp">
					<i class="
              la la-search search-icon"></i>
					<p>Find Candidates</p>
			</a></li>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/viewJobApplied.jsp"> <i
					class="
                  la la-laptop"></i>
					<p>Posted Jobs</p>
			</a></li>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/login.jsp"> <i
					class="
                  la la-sign-out"></i>
					<p>Sign Out</p>
			</a></li>
		</ul>
		<%
			} else {
		%>
		<ul class="nav">

			<div class="user">
				<div class="photo">
					<img
						src="<%=request.getContextPath()%>/theme/assets/img/profile.png">
				</div>
				<div class="info">
					<a class=""> <span> <span class="user-level"><%=um.getFname()%></span>
							<%=um.getEmail()%>
					</span>
					</a>
					<div class="clearfix"></div>
				</div>
			</div>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/dashboard.jsp  "> <i
					class="la la-home"></i>
					<p>Home</p>
			</a></li>

			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/uploadResume.jsp"> <i
					class="
                  la la-cloud-upload"></i>
					<p>Upload</p>
			</a></li>
			<%if(ConnectionManager.getCount(um.getUid())){%>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/jobs.jsp"> <i
					class="
                  la la-binoculars"></i>
					<p>Find Jobs</p>
			</a></li>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/viewResume.jsp"> <i
					class="
                 la la-file-pdf-o"></i>
					<p>My Resume</p>
			</a></li>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/candidateApliedJob.jsp">
					<i class="
               la la-filter"></i>
					<p>Applied Jobs</p>
			</a></li>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/jobRecommendation.jsp">
					<i class="
               la la-filter"></i>
					<p>Skills Recommendation</p>
			</a></li>
			<%} %>
			<li class="nav-item update-pro"><a type="button"
				href="<%=request.getContextPath()%>/pages/login.jsp"> <i
					class="
                  la la-sign-out"></i>
					<p>Sign Out</p>
			</a></li>
			
		</ul>

		<%
			}
			}
		%>


	</div>
</div>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://www.jacklmoore.com/colorbox/jquery.colorbox.js"></script>
