/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2020-05-13 10:08:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.helper.UserModel;
import com.helper.StudentModel;
import java.util.List;
import com.database.ConnectionManager;

public final class searchCandidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.helper.StudentModel");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
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
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<div class=\"main-panel\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"page-title\">Search Candidates</h4>\r\n");
      out.write("\t\t\t\t\t<form class=\"navbar-left navbar-form nav-search mr-md-3\" action=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Search Candidates Skills Wise...\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"searchsSkills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group-append\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"la la-search search-icon\" onclick=\"skillSearch()\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row row-card-no-pd mt-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card card-tasks\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-sub\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"table table-striped table-striped-bg- mt-4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"skills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Sr. No.</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Candidate Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Skills</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Score</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Experience</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Action</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

// 												
                                               List list = ConnectionManager.getskills();
												int i = 0;
												for (i = 0; i < list.size(); i++) {
													StudentModel sm = (StudentModel) list.get(i);
													String data = sm.getScore();
													String uid=sm.getUid();
													UserModel um =null;
												
												 um= ConnectionManager.getUserDetails(uid);
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr ");
      out.print(i + 1);
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(i + 1);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(um.getFname());
      out.write(' ');
      out.print(um.getLname() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(sm.getSkills());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><span class=\"\">");
      out.print(sm.getScore());
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(sm.getExperience());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><button class=\"btn btn-sm btn-success btn-round\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/tiles/ajax.jsp?methodId=viewFile&uid=");
      out.print(uid);
      out.write("\"  target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"la la-cloud-download mr-1\"></i>Get Resume\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</button></a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

												}
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../tiles/footerinc.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t$(\"#searchsSkills\").on(\r\n");
      out.write("\t\t\t\t\t\t\"keyup\",\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tvar value = $(this).val().toLowerCase();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#skills tr\").filter(\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(this).toggle(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(this).text().toLowerCase()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.indexOf(value) > -1)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t$.fn.stars = function() {\r\n");
      out.write("\t\treturn $(this).each(function() {\r\n");
      out.write("\t\t\t// Get the value\r\n");
      out.write("\t\t\tvar val = parseFloat($(this).html());\r\n");
      out.write("\t\t\t// Make sure that the value is in 0 - 5 range, multiply to get width\r\n");
      out.write("\t\t\tvar size = Math.max(0, (Math.min(5, val))) * 16;\r\n");
      out.write("\t\t\t// Create stars holder\r\n");
      out.write("\t\t\tvar $span = $('<span />').width(size);\r\n");
      out.write("\t\t\t// Replace the numerical value with stars\r\n");
      out.write("\t\t\t$(this).html($span);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('span.stars').stars();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function fnShowValue(a,b){\t\r\n");
      out.write("// \talert(b);\r\n");
      out.write("\tdocument.getElementById('docid').value=a;\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.getElementById('docname').innerHTML='Document Name : '+b;\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#modalUpdate1\").modal(\"show\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function fnViewDoc(did){\t\r\n");
      out.write("// \talert(b);\r\n");
      out.write("// \tdocument.getElementById('docid').value=a;\r\n");
      out.write("\t\r\n");
      out.write("// \tdocument.getElementById('docname').innerHTML='Document Name : '+b;\r\n");
      out.write("\t//$(\"#\"+a).modal(\"show\");\r\n");
      out.write("\t\ts='';\r\n");
      out.write("params = 'scrollbars=no,resizable=no,status=no,location=no,toolbar=no,menubar=no,width=1000,height=700';\r\n");
      out.write("s2=\"");
      out.print(request.getContextPath());
      out.write("/tiles/ajax.jsp?methodId=viewFile&resumetitle=\"+did+\"&inline=1\";\r\n");
      out.write("\twindow.open(s2, 'My PDF', params);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
