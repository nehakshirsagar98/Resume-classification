/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2020-05-13 10:08:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.io.FilenameUtils;
import java.net.URLEncoder;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.constant.ServerConstants;
import java.util.List;
import java.util.HashMap;
import org.apache.commons.fileupload.FileItem;
import com.database.ConnectionManager;
import com.helper.DBUtils;
import com.helper.StringHelper;
import com.helper.UserModel;
import com.helper.HttpHelper;
import java.io.File;

public final class ajax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.helper.HttpHelper");
    _jspx_imports_classes.add("java.awt.image.BufferedImage");
    _jspx_imports_classes.add("org.apache.commons.fileupload.FileItem");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.helper.StringHelper");
    _jspx_imports_classes.add("com.helper.UserModel");
    _jspx_imports_classes.add("javax.imageio.ImageIO");
    _jspx_imports_classes.add("com.helper.DBUtils");
    _jspx_imports_classes.add("com.database.ConnectionManager");
    _jspx_imports_classes.add("org.apache.commons.io.FilenameUtils");
    _jspx_imports_classes.add("com.constant.ServerConstants");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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
		 UserModel um = (UserModel)	session.getAttribute("USER_MODEL");
		 parameters.put("uid", um.getUid());
		returnString = ConnectionManager.insertJob(parameters);
	}
	else if (sMethod.equalsIgnoreCase("applyJob")) {
		returnString = ConnectionManager.applyJob(parameters);
	}
	else if (sMethod.equalsIgnoreCase("deleteJob")) {
		String jid = StringHelper.n2s(parameters.get("jid"));
		returnString = ConnectionManager.deleteJob(jid);
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

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\twindow.location.href='");
      out.print(request.getContextPath());
      out.write("/pages/login.jsp';\r\n");
      out.write("</script>\r\n");

	}
	if (!bypasswrite) {
		out.println(returnString);
	}

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
