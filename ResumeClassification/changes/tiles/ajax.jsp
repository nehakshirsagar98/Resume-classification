
<%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="com.constant.ServerConstants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="com.database.ConnectionManager"%>
<%@page import="com.helper.DBUtils"%>
<%@page import="com.helper.StringHelper"%>
<%@page import="com.helper.UserModel"%>
<%@page import="com.helper.HttpHelper"%>
<%@page import="java.io.File"%>

<%
	String sMethod = StringHelper.n2s(request.getParameter("methodId"));
	String returnString = "";
	System.out.println("HELLO");
	boolean bypasswrite = false;

	HashMap parameters = StringHelper.displayRequest(request);

	if (sMethod.equalsIgnoreCase("registerNewRecruiter")) {
		returnString = ConnectionManager
				.registerNewRecruiter(parameters);
	} else if (sMethod.equalsIgnoreCase("registerCandidate")) {
		returnString = ConnectionManager.registerCandidate(parameters);
	}

	else if (sMethod.equalsIgnoreCase("checkLogin")) {
		UserModel um = ConnectionManager.checkLogin(parameters);
		if (um != null) {
			session.setAttribute("USER_MODEL", um);
			returnString = "1";

		} else {
			returnString = "2";
		}
	} else if (sMethod.equalsIgnoreCase("postJob")) {
		returnString = ConnectionManager.insertJob(parameters);
	}
	else if (sMethod.equalsIgnoreCase("applyJob")) {
		returnString = ConnectionManager.applyJob(parameters);
	}
	else if (sMethod.equalsIgnoreCase("sendEmail")) {
	 UserModel um = (UserModel)	session.getAttribute("USER_MODEL");
		returnString = ConnectionManager.sendEmail(parameters,um);   
	}
	else if (sMethod.equalsIgnoreCase("viewFile")) {
		UserModel um =	(UserModel)session.getAttribute("USER_MODEL");
		ConnectionManager.downloadFile(parameters, um, response,false);
 return;
	}

	else if (sMethod.equalsIgnoreCase("uploadResume")) {
		UserModel um = (UserModel) session.getAttribute("USER_MODEL");
		HashMap uploadMap = HttpHelper.parseMultipartRequest(request);
		uploadMap.putAll(parameters);
		System.out.println("uploadMapuploadMap: " + uploadMap);
		if (session.getAttribute("USER_MODEL") == null) {
			// request.getRequestDispatcher("../pages/login.jsp").forward(request, response);
		}

		FileItem fi = (FileItem) uploadMap.get("fileITEM");
	
		System.out.println("uploadmap: " + uploadMap);

	

		System.out.println("usermodel values:" + fi);  
		System.out.println(um.getUid() + ":" + um.getEmail() + ":"
				+ um.getRole());
	
		String message = ConnectionManager.uploadResumeNew(fi, um.getUid(), um.getRole(), um.getEmail(),
				uploadMap.get("degree").toString(),
				uploadMap.get("exp").toString(),
				uploadMap.get("projectcount").toString(), 
				uploadMap.get("percentege").toString(),
				uploadMap.get("location").toString(),
				uploadMap.get("designation").toString(),
				uploadMap.get("cctc").toString(),
				uploadMap.get("ectc").toString());

		response.sendRedirect(request.getContextPath()
				+ "/pages/viewResume.jsp");

	}
	else if (sMethod.equalsIgnoreCase("checkResume")) {
		UserModel um = (UserModel) session.getAttribute("USER_MODEL");
		HashMap uploadMap = HttpHelper.parseMultipartRequest(request);
		uploadMap.putAll(parameters);
		System.out.println("uploadMapuploadMap: " + uploadMap);
		if (session.getAttribute("USER_MODEL") == null) {
			// request.getRequestDispatcher("../pages/login.jsp").forward(request, response);
		}

		FileItem fi = (FileItem) uploadMap.get("fileITEM");
	
		System.out.println("uploadmap: " + uploadMap);

	

		String message = ConnectionManager.checkResume(fi);

		response.sendRedirect(request.getContextPath()
				+ "/pages/checkResume.jsp?score="+URLEncoder.encode(message)+"&id=temp");

	}
	else if (sMethod.equalsIgnoreCase("showImage")) {  
		  String pid = StringHelper.n2s(parameters.get("pid"));
		  String filePath=ServerConstants.TEMP_HOME+pid+".png" ;
		  File f=new File(filePath);
		  System.out.println(f.getAbsolutePath());
		  BufferedImage bi=ImageIO.read(f);
		  ImageIO.write(bi, "png", response.getOutputStream());
		  return;  
		    
		 }

	else if (sMethod.equalsIgnoreCase("logout")) {
		session.removeAttribute("USER_MODEL");
		bypasswrite = true;
%>
<script>
			window.location.href='<%=request.getContextPath()%>/pages/login.jsp';
</script>
<%
	}
	if (!bypasswrite) {
		out.println(returnString);
	}
%>