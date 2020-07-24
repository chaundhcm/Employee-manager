package org.apache.jsp.WEB_002dINF.jsp.admin.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Select;
import controller.RecordController;
import controller.RecordController;

public final class show_002dstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_style_path_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_radiobutton_value_path_id_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_path_onchange_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_onsubmit_modelAttribute_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_message_code_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_path_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path_items_itemValue_itemLabel_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_style_path_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_radiobutton_value_path_id_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_path_onchange_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_onsubmit_modelAttribute_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path_items_itemValue_itemLabel_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_form_input_style_path_id_cssClass_nobody.release();
    _jspx_tagPool_form_radiobutton_value_path_id_class_nobody.release();
    _jspx_tagPool_form_input_type_path_onchange_id_nobody.release();
    _jspx_tagPool_form_input_path_cssClass_nobody.release();
    _jspx_tagPool_form_form_onsubmit_modelAttribute_method_action.release();
    _jspx_tagPool_s_message_code_nobody.release();
    _jspx_tagPool_form_input_type_path_cssClass_nobody.release();
    _jspx_tagPool_form_select_path_items_itemValue_itemLabel_cssClass_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ABC Group</title>\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 style=\"padding: 10px; font-weight: bold\">");
      if (_jspx_meth_s_message_0(_jspx_page_context))
        return;
      out.write("</h2>\n");
      out.write("        <p class=\"text-success\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header pb-0\">\n");
      out.write("                  <div class=\"form-row\">\n");
      out.write("                  <div class=\"form-group col-7\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal-lg\">\n");
      out.write("                  ");
      if (_jspx_meth_s_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </button>\n");
      out.write("                      </div>\n");
      out.write("                  <div class=\"form-group col-3\">\n");
      out.write("                      <form action=\"admin/record/search.htm\" >\n");
      out.write("                    <div class=\"form-group col-12\">\n");
      out.write("                    <select  id=\"scripts\" name=\"depart_id\" class=\"form-control\">\n");
      out.write("                        <option value=\"All\" label=\"All\" selected=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        ");

                            RecordController dao = new RecordController();
                            ArrayList<Select> ds = dao.fillAllDepart();
                            for(int i =0; i<ds.size();i++){
                                out.print("<option value="+ds.get(i).getId()+">"+ds.get(i).getName()+"</option>");
                            }
                        
      out.write("\n");
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
      out.write("                  <table class=\"table table-head-fixed text-nowrap\" >\n");
      out.write("                  <thead>\n");
      out.write("                    <tr style=\"text-align: center\">\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_2(_jspx_page_context))
        return;
      out.write("</th>\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_3(_jspx_page_context))
        return;
      out.write("</th>\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_4(_jspx_page_context))
        return;
      out.write("</th>\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_5(_jspx_page_context))
        return;
      out.write("</th>\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_6(_jspx_page_context))
        return;
      out.write("</th>\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_7(_jspx_page_context))
        return;
      out.write("</th>\n");
      out.write("                      <th>");
      if (_jspx_meth_s_message_8(_jspx_page_context))
        return;
      out.write("</th>\n");
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
      out.write("        <div class=\"clear\" style=\"margin-bottom: 90px;\"></div>\n");
      out.write("<!-- Modal -->\n");
      out.write("      <div class=\"modal fade\" id=\"modal-lg\">\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <h4 class=\"modal-title\">Thêm mới Staff</h4>\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <!----- -->\n");
      out.write("                ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("\n");
      out.write("                <!-- ----->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.modal-content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.modal-dialog -->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  $(\"#myInput\").on(\"keyup\", function() {\n");
      out.write("    var value = $(this).val().toLowerCase();\n");
      out.write("    $(\"#myTable tr\").filter(function() {\n");
      out.write("      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
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
      out.write("<script>\n");
      out.write("function getnameimg(){\n");
      out.write("var s = document.getElementById(\"txtimg\").value;\n");
      out.write("s = s.slice(12)\n");
      out.write("document.images['test'].src ='images/'+s;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script >\n");
      out.write("         function validateform() {\n");
      out.write("        var name = document.myform.name.value;\n");
      out.write("        var password = document.myform.password.value;\n");
      out.write(" \n");
      out.write("        if (name == null || name == \"\") {\n");
      out.write("            alert(\"Vui lòng nhập tên\");\n");
      out.write("            return false;\n");
      out.write("        } else if (password.length < 6) {\n");
      out.write("            alert(\"Password must be at least 6 characters long.\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("      </script>\n");
      out.write("    <style>\n");
      out.write("    .insert-row1{\n");
      out.write("    width: 100%;\n");
      out.write("    float:left;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".insert-row1 .col1{\n");
      out.write("    width: 65%;\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write(".insert-row1 .col2{\n");
      out.write("    width: 25%;\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write(".clear{\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("    .insert-row2{\n");
      out.write("    width: 100%;\n");
      out.write("    margin-left: 11px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_s_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_0.setPageContext(_jspx_page_context);
    _jspx_th_s_message_0.setParent(null);
    _jspx_th_s_message_0.setCode("admin.staff.showStaff.title");
    int[] _jspx_push_body_count_s_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_0 = _jspx_th_s_message_0.doStartTag();
      if (_jspx_th_s_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_0.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_1.setPageContext(_jspx_page_context);
    _jspx_th_s_message_1.setParent(null);
    _jspx_th_s_message_1.setCode("admin.staff.showStaff.btnNew");
    int[] _jspx_push_body_count_s_message_1 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_1 = _jspx_th_s_message_1.doStartTag();
      if (_jspx_th_s_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_1.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_1);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_2 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_2.setPageContext(_jspx_page_context);
    _jspx_th_s_message_2.setParent(null);
    _jspx_th_s_message_2.setCode("admin.staff.showStaff.table.id");
    int[] _jspx_push_body_count_s_message_2 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_2 = _jspx_th_s_message_2.doStartTag();
      if (_jspx_th_s_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_2.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_2);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_3 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_3.setPageContext(_jspx_page_context);
    _jspx_th_s_message_3.setParent(null);
    _jspx_th_s_message_3.setCode("admin.staff.showStaff.table.fullname");
    int[] _jspx_push_body_count_s_message_3 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_3 = _jspx_th_s_message_3.doStartTag();
      if (_jspx_th_s_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_3.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_3);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_4 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_4.setPageContext(_jspx_page_context);
    _jspx_th_s_message_4.setParent(null);
    _jspx_th_s_message_4.setCode("admin.staff.showStaff.table.gender");
    int[] _jspx_push_body_count_s_message_4 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_4 = _jspx_th_s_message_4.doStartTag();
      if (_jspx_th_s_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_4.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_4);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_5 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_5.setPageContext(_jspx_page_context);
    _jspx_th_s_message_5.setParent(null);
    _jspx_th_s_message_5.setCode("admin.staff.showStaff.table.birthday");
    int[] _jspx_push_body_count_s_message_5 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_5 = _jspx_th_s_message_5.doStartTag();
      if (_jspx_th_s_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_5.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_5);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_6 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_6.setPageContext(_jspx_page_context);
    _jspx_th_s_message_6.setParent(null);
    _jspx_th_s_message_6.setCode("admin.staff.showStaff.table.photo");
    int[] _jspx_push_body_count_s_message_6 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_6 = _jspx_th_s_message_6.doStartTag();
      if (_jspx_th_s_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_6.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_6);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_7 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_7.setPageContext(_jspx_page_context);
    _jspx_th_s_message_7.setParent(null);
    _jspx_th_s_message_7.setCode("admin.staff.showStaff.table.email");
    int[] _jspx_push_body_count_s_message_7 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_7 = _jspx_th_s_message_7.doStartTag();
      if (_jspx_th_s_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_7.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_7);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_8 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_8.setPageContext(_jspx_page_context);
    _jspx_th_s_message_8.setParent(null);
    _jspx_th_s_message_8.setCode("admin.staff.showStaff.table.depart");
    int[] _jspx_push_body_count_s_message_8 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_8 = _jspx_th_s_message_8.doStartTag();
      if (_jspx_th_s_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_8.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_8);
    }
    return false;
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staffs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr style=\"text-align: center\">\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.gender?\"Nam\":\"Nữ\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td><img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 50px; height: 50px;\"/></td>\n");
          out.write("                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                      <td><span class=\"badge badge-success\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.depart.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></td>\n");
          out.write("                      <td>\n");
          out.write("                          <a href=\"admin/staff/upd/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\" class=\"fas fa-edit\" />\n");
          out.write("                          <a href=\"admin/staff/delete/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\" class=\"fas fa-trash-alt\" style=\"padding-left: 10px;\" />\n");
          out.write("                          <a href=\"admin/staff/assess/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\" class=\"fas fa-award\" style=\"padding-left: 10px;\" />\n");
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

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_onsubmit_modelAttribute_method_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setAction("admin/staff/insert.htm");
    _jspx_th_form_form_0.setModelAttribute("staff");
    _jspx_th_form_form_0.setMethod("post");
    _jspx_th_form_form_0.setOnsubmit("return validateform()");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("               <div class=\"insert-row1\">\n");
          out.write("               <div class=\"insert-row1 col1\">\n");
          out.write("                <div class=\"col-8\">\n");
          out.write("\t\t\t<label>ID</label>\n");
          out.write("                        ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("\t\t<div class=\"col-8\">\n");
          out.write("\t\t\t<label>Tên</label>\n");
          out.write("                        ");
          if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-8\">\n");
          out.write("\t\t\t<label>Giới tính:</label> <br>\n");
          out.write("                <div class=\"custom-control custom-radio custom-control-inline\">\n");
          out.write("                    ");
          if (_jspx_meth_form_radiobutton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    <label class=\"custom-control-label\" for=\"customRadio1\">Nam</label>\n");
          out.write("                    </div>\n");
          out.write("                <div class=\"custom-control custom-radio custom-control-inline\">\n");
          out.write("                    ");
          if (_jspx_meth_form_radiobutton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    <label class=\"custom-control-label\" for=\"customRadio2\">Nữ</label>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"insert-row1 col2\">\n");
          out.write("                <div class=\"form-control-file\">\n");
          out.write("                    <label>Ảnh:</label>\n");
          out.write("                    <img src=\"images/adduser.jpg\" name=\"test\" style=\"width: 200px; height: 120px;\"  /> <br><br>\n");
          out.write("                    ");
          if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"clear\"/>\n");
          out.write("                <div class=\"insert-row2\">\n");
          out.write("                <div class=\"form-row\">\n");
          out.write("                <div class=\"col-5\" style=\"margin-right: 100px;\">\n");
          out.write("\t\t\t<label>Ngày sinh:</label>\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                <div class=\"col-5\">\n");
          out.write("\t\t\t<label>Email:</label>\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"form-row\">\n");
          out.write("                <div class=\"col-5\" style=\"margin-right: 100px;\">\n");
          out.write("\t\t\t<label>SĐT:</label>\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                <div class=\"col-5\">\n");
          out.write("\t\t\t<label>Lương:</label>\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_input_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"form-row\">\n");
          out.write("                <div class=\"col-5\" style=\"margin-right: 100px;\">\n");
          out.write("\t\t\t<label>Ghi chú:</label>\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_input_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                <div class=\"col-5\">\n");
          out.write("\t\t\t<label>Phòng ban:</label>\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("                </div>\n");
          out.write("                </div>\n");
          out.write("                <hr>\n");
          out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
          out.write("                    <button type=\"submit\" class=\"btn btn-primary\" style=\"margin-left: 600px;\" >Lưu</button>\n");
          out.write("<!--                    <button type=\"submit\" class=\"btn btn-primary\" style=\"margin-left: 500px;\" >Lưu</button>-->\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_onsubmit_modelAttribute_method_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_style_path_id_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("id");
    _jspx_th_form_input_0.setCssClass("form-control");
    _jspx_th_form_input_0.setDynamicAttribute(null, "style", new String("width=1000px;"));
    _jspx_th_form_input_0.setId("id");
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_style_path_id_cssClass_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_style_path_id_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setPath("name");
    _jspx_th_form_input_1.setCssClass("form-control");
    _jspx_th_form_input_1.setDynamicAttribute(null, "style", new String("width=1000px;"));
    _jspx_th_form_input_1.setId("name");
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_style_path_id_cssClass_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobutton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_radiobutton_0 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _jspx_tagPool_form_radiobutton_value_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_form_radiobutton_0.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobutton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobutton_0.setDynamicAttribute(null, "class", new String("custom-control-input"));
    _jspx_th_form_radiobutton_0.setId("customRadio1");
    _jspx_th_form_radiobutton_0.setPath("gender");
    _jspx_th_form_radiobutton_0.setValue(new String("true"));
    int[] _jspx_push_body_count_form_radiobutton_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobutton_0 = _jspx_th_form_radiobutton_0.doStartTag();
      if (_jspx_th_form_radiobutton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobutton_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobutton_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobutton_0.doFinally();
      _jspx_tagPool_form_radiobutton_value_path_id_class_nobody.reuse(_jspx_th_form_radiobutton_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_radiobutton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_radiobutton_1 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _jspx_tagPool_form_radiobutton_value_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_form_radiobutton_1.setPageContext(_jspx_page_context);
    _jspx_th_form_radiobutton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_radiobutton_1.setDynamicAttribute(null, "class", new String("custom-control-input"));
    _jspx_th_form_radiobutton_1.setId("customRadio2");
    _jspx_th_form_radiobutton_1.setPath("gender");
    _jspx_th_form_radiobutton_1.setValue(new String("false"));
    int[] _jspx_push_body_count_form_radiobutton_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_radiobutton_1 = _jspx_th_form_radiobutton_1.doStartTag();
      if (_jspx_th_form_radiobutton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_radiobutton_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_radiobutton_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_radiobutton_1.doFinally();
      _jspx_tagPool_form_radiobutton_value_path_id_class_nobody.reuse(_jspx_th_form_radiobutton_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_onchange_id_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setDynamicAttribute(null, "type", new String("file"));
    _jspx_th_form_input_2.setId("txtimg");
    _jspx_th_form_input_2.setPath("photo");
    _jspx_th_form_input_2.setOnchange("getnameimg();");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_type_path_onchange_id_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setDynamicAttribute(null, "type", new String("date"));
    _jspx_th_form_input_3.setPath("birthday");
    _jspx_th_form_input_3.setCssClass("form-control");
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_type_path_cssClass_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_4.setPageContext(_jspx_page_context);
    _jspx_th_form_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_4.setPath("email");
    _jspx_th_form_input_4.setCssClass("form-control");
    int[] _jspx_push_body_count_form_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_4 = _jspx_th_form_input_4.doStartTag();
      if (_jspx_th_form_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_4.doFinally();
      _jspx_tagPool_form_input_path_cssClass_nobody.reuse(_jspx_th_form_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_5.setPageContext(_jspx_page_context);
    _jspx_th_form_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_5.setPath("phone");
    _jspx_th_form_input_5.setCssClass("form-control");
    int[] _jspx_push_body_count_form_input_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_5 = _jspx_th_form_input_5.doStartTag();
      if (_jspx_th_form_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_5.doFinally();
      _jspx_tagPool_form_input_path_cssClass_nobody.reuse(_jspx_th_form_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_6 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_6.setPageContext(_jspx_page_context);
    _jspx_th_form_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_6.setPath("salary");
    _jspx_th_form_input_6.setCssClass("form-control");
    int[] _jspx_push_body_count_form_input_6 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_6 = _jspx_th_form_input_6.doStartTag();
      if (_jspx_th_form_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_6.doFinally();
      _jspx_tagPool_form_input_path_cssClass_nobody.reuse(_jspx_th_form_input_6);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_7 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_7.setPageContext(_jspx_page_context);
    _jspx_th_form_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_7.setPath("notes");
    _jspx_th_form_input_7.setCssClass("form-control");
    int[] _jspx_push_body_count_form_input_7 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_7 = _jspx_th_form_input_7.doStartTag();
      if (_jspx_th_form_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_7.doFinally();
      _jspx_tagPool_form_input_path_cssClass_nobody.reuse(_jspx_th_form_input_7);
    }
    return false;
  }

  private boolean _jspx_meth_form_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_items_itemValue_itemLabel_cssClass_nobody.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_0.setPageContext(_jspx_page_context);
    _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_0.setPath("depart.id");
    _jspx_th_form_select_0.setCssClass("form-control");
    _jspx_th_form_select_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_select_0.setItemValue("id");
    _jspx_th_form_select_0.setItemLabel("name");
    int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
      if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_0.doFinally();
      _jspx_tagPool_form_select_path_items_itemValue_itemLabel_cssClass_nobody.reuse(_jspx_th_form_select_0);
    }
    return false;
  }
}
