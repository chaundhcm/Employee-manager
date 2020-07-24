package org.apache.jsp.WEB_002dINF.jsp.admin.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ABC Group</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 style=\"padding: 10px; font-weight: bold\">QUẢN LÝ TÀI KHOẢN</h2>\n");
      out.write("        <p class=\"text-success\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("<!--database0-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header pb-0\">\n");
      out.write("                  <div class=\"form-row\">\n");
      out.write("                  <div class=\"form-group col-7\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal-lg\">\n");
      out.write("                  Tạo mới\n");
      out.write("                </button>\n");
      out.write("                      </div>\n");
      out.write("                  <div class=\"form-group col-3\">\n");
      out.write("                      <form action=\"admin/record/search.htm\" >\n");
      out.write("                    <div class=\"form-group col-12\">\n");
      out.write("                    <select id=\"scripts\" class=\"form-control\">\n");
      out.write("                        <option value=\"All\" label=\"All\" />\n");
      out.write("                        <option value=\"ADMIN\">ADMIN</option>\n");
      out.write("                        <option value=\"Nhân Viên\">Nhân Viên</option>\n");
      out.write("                    </select>\n");
      out.write("                  </div>    \n");
      out.write("                  </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group col-2\">\n");
      out.write("                <div class=\"card-tools\">\n");
      out.write("                  <div class=\"input-group input-group-sm\" style=\"width: 150px;\">\n");
      out.write("                    <input type=\"text\" name=\"table_search\" class=\"form-control float-right\" placeholder=\"Search\" id=\"myInput\" >\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-default\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                      </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body table-responsive p-0\" style=\"height: 300px;\">\n");
      out.write("                  <table class=\"table table-head-fixed text-nowrap\">\n");
      out.write("                  <thead>\n");
      out.write("                    <tr style=\"text-align: center\">\n");
      out.write("                      <th>Username</th>\n");
      out.write("                      <th>Password</th>\n");
      out.write("                      <th>Fullname</th>\n");
      out.write("                      <th>Role</th>\n");
      out.write("                      <th></th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tbody id=\"myTable\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  </tbody>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("<!-- Modal -->\n");
      out.write("      <div class=\"modal fade\" id=\"modal-lg\">\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <h4 class=\"modal-title\">Thêm mới user</h4>\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <!----- -->\n");
      out.write("                    <form action=\"admin/user/insert.htm\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label>Username:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Nhập username\" name=\"username\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label>Password:</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" placeholder=\"Nhập password\" name=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label>Họ và Tên:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Nhập họ và tên\" name=\"fullname\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Vai trò: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                    <input type=\"radio\" class=\"custom-control-input\" id=\"customRadio1\" name=\"role\" value=\"true\">\n");
      out.write("                    <label class=\"custom-control-label\" for=\"customRadio1\">ADMIN</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                    <input type=\"radio\" class=\"custom-control-input\" id=\"customRadio2\" name=\"role\" value=\"false\">\n");
      out.write("                    <label class=\"custom-control-label\" for=\"customRadio2\">Nhân Viên</label>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" style=\"margin-left: 600px;\" >Lưu</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                <!-- ----->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.modal-content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.modal-dialog -->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("      $(\"#myInput\").on(\"keyup\", function() {\n");
      out.write("        var value = $(this).val().toLowerCase();\n");
      out.write("        $(\"#myTable tr\").filter(function() {\n");
      out.write("          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("<script>\n");
      out.write("(function() {\n");
      out.write("    // get references to select list and display text box\n");
      out.write("    var input;\n");
      out.write("    var sel = document.getElementById('scripts');\n");
      out.write("    document.getElementById('scripts').onchange = function () {\n");
      out.write("   input = sel.options[sel.selectedIndex].text;\n");
      out.write("   $(\"#myTable tr\").filter(function() {\n");
      out.write("      $(this).toggle($(this).text().indexOf(input) > -1)\n");
      out.write("    });\n");
      out.write("    }\n");
      out.write("}());\n");
      out.write("</script> \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("u");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr style=\"text-align: center\">\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td>\n");
          out.write("                          <span class=\"badge badge-success\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.role?\"ADMIN\":\"Nhân Viên\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                      </td>\n");
          out.write("                      <td>\n");
          out.write("                          <a href=\"admin/user/upd/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\" class=\"fas fa-edit\" />\n");
          out.write("                          <a href=\"admin/user/delete/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\" class=\"fas fa-trash-alt\" style=\"padding-left: 10px;\" />\n");
          out.write("                      </td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
