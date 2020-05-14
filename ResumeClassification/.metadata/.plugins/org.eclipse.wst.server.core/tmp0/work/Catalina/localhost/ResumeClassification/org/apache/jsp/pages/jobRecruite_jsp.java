/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2020-05-13 10:08:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.constant.ServerConstants;
import java.util.List;
import com.helper.UserModel;
import com.database.ConnectionManager;

public final class jobRecruite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.helper.UserModel");
    _jspx_imports_classes.add("com.database.ConnectionManager");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=utf-8 />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/inc.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<div class=\"main-panel\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-title\">Job Post</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"table-full-width\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form class=\"navbar-left navbar-form nav-search mr-md-3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod=\"post\" enctype=\"multipart/form-data\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taction=\"javascript:fnSubmit();\" id=\"myform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-header col-md-6\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"uid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\tJob Title: -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"jobtitle\" placeholder=\"Job Title\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" class=\"form-control btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\tRequired Experience: -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control \" id=\"reuireexp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"reuireexp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Select Experience Criteria</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(int ex=0; ex<ServerConstants.Experience_Criteria.length; ex++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(ex);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(ServerConstants.Experience_Criteria[ex]);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- package: -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control \" id=\"package\" name=\"package\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Projected CTC </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"No Bars on Salary\">No Bars on Salary</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"00-3 LPA\">00-3 LPA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3-6 LPA\">3-6 LPA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"6-10 LPA\">6-10 LPA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"10 LPA and above\">10 LPA and above</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Skill Required: -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"skills\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Technical Skills\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<small>Ex. HTML, SQL, Android, JAVA, AWS</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Skill Required: -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label> &nbsp;&nbsp;&nbsp; Select Domain Of Technical Skill</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"s\" id=\"s\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Frontend,\" onclick=\"add_sub(this);\"><label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"bob\">Front_End</label><br> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"s1\" id=\"s1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"ML,\" onclick=\"add_sub(this);\"><label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"bob1\">Machine Learning</label><br> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"s2\" id=\"s2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Backend,\" onclick=\"add_sub(this);\"><label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"bob2\">Back_End</label><br> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"s5\" id=\"s5\" value=\"Devops\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"add_sub(this);\"><label for=\"bob2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDevops</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"s3\" id=\"s3\" value=\"Testing,\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"add_sub(this);\"><label for=\"bob\">Software Testing</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"s3\" id=\"s3\" value=\"Cloud,\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"add_sub(this);\"><label for=\"bob\">Cloud Computing</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"s4\" id=\"s4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Android,\" onclick=\"add_sub(this);\"><label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"bob1\">Android</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("<textarea name=\"skillsdomain\" rows=\"4\" cols=\"35\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" onclick=\"this.focus();this.select();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\r\n");
      out.write("</textarea>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<BR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"form-control btn btn-default\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"la la-cloud-upload\" style=\"font-size: 20px\"></i> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\tUpload -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t</button> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-header col-md-6\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\tNotice Period: -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control \" id=\"notice\" name=\"notice\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Select Notice Period</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Immediate\">Immediate</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"7 Days\">7 Days</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"15 Days\">15 Days</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1 Months\">1 Months</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Company Name: -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cname\" placeholder=\"Company Name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" class=\"form-control btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!--Job location: -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"jlocation\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Job Location\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 70%; background-color: #ffffff; border: 1px solid #8a8a8a; margin-bottom: 15px\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"width: 70%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-submit float-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"la la-plus\" style=\"font-size: 20px\"></i> Add\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tJob\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Modal -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/footerinc.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function add_sub(el){\r\n");
      out.write("if (el.checked)\r\n");
      out.write("el.form.elements['skillsdomain'].value+=el.value;\r\n");
      out.write("else{\r\n");
      out.write("var re=new RegExp('(.*)'+el.value+'(.*)$');\r\n");
      out.write("el.form.elements['skillsdomain'].value=el.form.elements['skillsdomain'].value.replace(re,'$1$2');\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function fnSubmit(){\t\r\n");
      out.write("var str = $(\"#myform\" ).serialize();\r\n");
      out.write("$.post(\"");
      out.print(request.getContextPath());
      out.write("/tiles/ajax.jsp?methodId=postJob\",\r\n");
      out.write("\t\t\t\t\t\tstr, function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tdata = $.trim(data);\r\n");
      out.write("\t\t\t\t\t\t\tif (data==1) {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"Job Post Successfully\");\r\n");
      out.write("\t\t\t\t\t\t\t\twindow.location.href=\"");
      out.print(request.getContextPath());
      out.write("/pages/jobRecruite.jsp\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"Error\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$('#myform')[0].reset();\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
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