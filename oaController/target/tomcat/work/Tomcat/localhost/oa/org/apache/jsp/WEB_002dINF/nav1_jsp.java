/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-19 03:12:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=emulateIE7\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/skin_/nav.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/global.js\"></script>\r\n");
      out.write("<title>底部内容页</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div id=\"bd\">\r\n");
      out.write("    \t<div class=\"sidebar\">\r\n");
      out.write("        \t<div class=\"sidebar-bg\"></div>\r\n");
      out.write("            <i class=\"sidebar-hide\"></i>\r\n");
      out.write("            <h2><a href=\"javascript:;\"><i class=\"h2-icon\" title=\"切换到树型结构\"></i><span>安全管理</span></a></h2>\r\n");
      out.write("            <ul class=\"nav\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"tree-list outwindow\">\r\n");
      out.write("            \t<div class=\"tree ztree\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("        \t<div class=\"title\">\r\n");
      out.write("                <i class=\"sidebar-show\"></i>\r\n");
      out.write("                <ul class=\"tab ue-clear\">\r\n");
      out.write("                   \r\n");
      out.write("                </ul>\r\n");
      out.write("                <i class=\"tab-more\"></i>\r\n");
      out.write("                <i class=\"tab-close\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"more-bab-list\">\r\n");
      out.write("\t<ul></ul>\r\n");
      out.write("    <div class=\"opt-panel-ml\"></div>\r\n");
      out.write("    <div class=\"opt-panel-mr\"></div>\r\n");
      out.write("    <div class=\"opt-panel-bc\"></div>\r\n");
      out.write("    <div class=\"opt-panel-br\"></div>\r\n");
      out.write("    <div class=\"opt-panel-bl\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/nav.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/Menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.ztree.core-3.5.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar menu = new Menu({\r\n");
      out.write("\t\tdefaultSelect: $('.nav').find('li[data-id=\"1\"]')\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t// 左侧树结构加载\r\n");
      out.write("\tvar setting = {};\r\n");
      out.write("\r\n");
      out.write("\t\tvar zNodes =[\r\n");
      out.write("\t\t\t{ name:\"新闻管理\",\r\n");
      out.write("\t\t\t   children: [\r\n");
      out.write("\t\t\t\t { name:\"新闻视频管理\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"新闻频道管理\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"地方新闻管理\",icon:'img/skin_/leftlist.png'}\r\n");
      out.write("\t\t\t]},\r\n");
      out.write("\t\t\t{ name:\"用户信息设置\", open:true,\r\n");
      out.write("\t\t\t   children: [\r\n");
      out.write("\t\t\t\t { name:\"首页\", checked:true,icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"表单\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"表格\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"自定义设置\",icon:'img/skin_/leftlist.png'}\r\n");
      out.write("\t\t\t]},\r\n");
      out.write("\t\t\t{ name:\"工作安排\",\r\n");
      out.write("\t\t\t   children: [\r\n");
      out.write("\t\t\t\t { name:\"工作安排\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"安排管理\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"类型选择\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"自定义设置\",icon:'img/skin_/leftlist.png'}\r\n");
      out.write("\t\t\t]},\r\n");
      out.write("\t\t\t{ name:\"数据管理\",\r\n");
      out.write("\t\t\t   children: [\r\n");
      out.write("\t\t\t\t { name:\"工作安排\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"安排管理\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"类型选择\",icon:'img/skin_/leftlist.png'},\r\n");
      out.write("\t\t\t\t { name:\"自定义设置\",icon:'img/skin_/leftlist.png'}\r\n");
      out.write("\t\t\t]}\r\n");
      out.write("\t\t];\r\n");
      out.write("\r\n");
      out.write("\t$.fn.zTree.init($(\".tree\"), setting, zNodes);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('.sidebar h2').click(function(e) {\r\n");
      out.write("        $('.tree-list').toggleClass('outwindow');\r\n");
      out.write("\t\t$('.nav').toggleClass('outwindow');\r\n");
      out.write("    });\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).click(function(e) {\r\n");
      out.write("\t\tif(!$(e.target).is('.tab-more')){\r\n");
      out.write("\t\t\t $('.tab-more').removeClass('active');\r\n");
      out.write("\t\t\t $('.more-bab-list').hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/nav1.jsp(25,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("p");
    // /WEB-INF/nav1.jsp(25,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/nav1.jsp(25,12) '${permissions}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${permissions}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <li class=\"nav-li\">\r\n");
          out.write("                \t<a href=\"javascript:;\" class=\"ue-clear\"><i class=\"nav-ivon\"></i><span class=\"nav-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.menu.menuName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></a>\r\n");
          out.write("                    <ul class=\"subnav\">\r\n");
          out.write("\t                    ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(" \r\n");
          out.write("                    </ul>\r\n");
          out.write("                </li>\r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/nav1.jsp(29,21) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("menu");
    // /WEB-INF/nav1.jsp(29,21) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/nav1.jsp(29,21) '${p.menu.subMenu}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${p.menu.subMenu}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                    \t<li class=\"subnav-li\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.menuUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.menuId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" data-id=\"8\"><a href=\"\" class=\"ue-clear\"><i class=\"subnav-icon\"></i><span class=\"subnav-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.menuName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></a></li>\r\n");
          out.write("\t                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
