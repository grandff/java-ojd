/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-05 14:04:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/board/../common/nav.jsp", Long.valueOf(1672925944849L));
    _jspx_dependants.put("/board/../common/footer.jsp", Long.valueOf(1672924913238L));
    _jspx_dependants.put("/board/../common/header.jsp", Long.valueOf(1672925152717L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>메인화면</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/common.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/bootstrap/bootstrap.min.js\"></script>    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/common.js\"></script>    \r\n");
      out.write("</head>");
      out.write('\r');
      out.write('\n');

    String totalCount = String.valueOf(session.getAttribute("totalCount")).replaceAll("null","0");
    int boardCount = Integer.parseInt(totalCount);
    int num = boardCount + 1;

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');

    String nowUrl = request.getRequestURL().toString();
    boolean mainFlag = nowUrl.indexOf("main.jsp") > -1 ? true : false;  // 현재 메인화면 여부
    boolean listFlag = nowUrl.indexOf("/board/") > -1 ? true : false;   // 게시판 여부

      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <h1 class=\"text-light ps-2\">JSP Sample</h1>\r\n");
      out.write("        <ul class=\"navbar-nav\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link ");
      out.print(mainFlag ? "active" : "");
      out.write("\" href=\"/web/main.jsp\">메인화면</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link ");
      out.print(listFlag ? "active" : "");
      out.write("\" href=\"/web/board/list.jsp\">게시판</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("    <div class=\"container mt-5\">\r\n");
      out.write("        <h2>게시판</h2>\r\n");
      out.write("        <p>게시글 등록</p>\r\n");
      out.write("        <form name=\"form\" id=\"form\" method=\"post\" action=\"/web/board/action.jsp\">\r\n");
      out.write("            <input type=\"hidden\" name=\"num\" id=\"num\" value=\"");
      out.print(num);
      out.write("\" />\r\n");
      out.write("            <div class=\"mb-3 mt-3\">\r\n");
      out.write("                <label for=\"title\" class=\"form-label\">제목</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"title\" placeholder=\"제목을 입력하세요\" name=\"title\" maxlength=\"100\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <label for=\"ctt\" class=\"form-label\">내용</label>\r\n");
      out.write("                <textarea class=\"form-control\" rows=\"5\" id=\"ctt\" name=\"ctt\"></textarea>         \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <label for=\"pwd\" class=\"form-label\">비밀번호</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"비밀번호를 입력하세요\" name=\"pwd\">\r\n");
      out.write("            </div>            \r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"d-flex justify-content-end\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" onclick=\"insertBoard();\">등록</button>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-danger ms-1\" onclick=\"\">취소</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button id=\"modalToggleBtn\" type=\"button\" class=\"invisible btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#myModal\">    \r\n");
      out.write("    </button>\r\n");
      out.write("    <!-- The Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal Header -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h4 class=\"modal-title\">등록 실패</h4>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal body -->\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                필수값을 확인해주세요.\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal footer -->\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mt-5 p-4 bg-dark text-white text-center\">\r\n");
      out.write("    <p>Copyright 2023. grandff All rights reserved.</p>\r\n");
      out.write("</div>");
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
