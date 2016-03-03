package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Busquedas en Instagram</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"MEDIA/IMAGE/instagram12.png\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"MEDIA/CSS/style.css\" />\n");
      out.write("        <link href=\"MEDIA/CSS/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"MEDIA/CSS/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                background-image: url(MEDIA/IMAGE/InstagramFondo.png); \n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("            .estiloTAGS2{\n");
      out.write("                position:fixed;\n");
      out.write("                left:630px;\n");
      out.write("                top:300px;\n");
      out.write("                font-size:xx-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("            }\n");
      out.write("            .estiloTAGS1{\n");
      out.write("                position:fixed;\n");
      out.write("                left:630px;\n");
      out.write("                top:240px;\n");
      out.write("                font-size:x-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("                font-family: fantasy;\n");
      out.write("            }\n");
      out.write("            .estiloTAGS3{\n");
      out.write("                position:fixed;\n");
      out.write("                left:1100px;\n");
      out.write("                top:305px;\n");
      out.write("                font-size:x-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("            }\n");
      out.write("            .estiloTitulo{\n");
      out.write("                position:fixed;\n");
      out.write("                left:630px;\n");
      out.write("                top:120px;\n");
      out.write("                font-size:xx-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("            }\n");
      out.write("            .estiloUSER2{\n");
      out.write("                position:fixed;\n");
      out.write("                left:630px;\n");
      out.write("                top:430px;\n");
      out.write("                font-size:xx-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("            }\n");
      out.write("            .estiloUSER1{\n");
      out.write("                position:fixed;\n");
      out.write("                left:630px;\n");
      out.write("                top:375px;\n");
      out.write("                font-size:x-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("                font-family: fantasy;\n");
      out.write("            }\n");
      out.write("            .estiloUSER3{\n");
      out.write("                position:fixed;\n");
      out.write("                left:1100px;\n");
      out.write("                top:435px;\n");
      out.write("                font-size:x-large;\n");
      out.write("                padding-right:30px;\n");
      out.write("            }\n");
      out.write("            .footer {\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("            .wrap-footer{}\n");
      out.write("            \n");
      out.write("            .copyright{\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #333333;\n");
      out.write("                padding: 10px 0px;\n");
      out.write("                color: #fff;                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"estiloTitulo\"> PRESENTAR FOTOS DE TAGS Y USER DE INSTAGRAM </div>\n");
      out.write("        <form id=\"form_tags\" name=\"form_tags\" method=\"post\" action=\"tags.jsp\">\n");
      out.write("            <fieldset><legend class=\"estiloTAGS1\">TAGS</legend>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"text\" name=\"tags\" id=\"tags\" class=\"estiloTAGS2\" required/>\n");
      out.write("            <br/>\n");
      out.write("            <button type=\"submit_tags\" class=\"estiloTAGS3\">BUSCAR</button>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <form id=\"form_user\" name=\"form_user\" method=\"post\" action=\"user.jsp\">\n");
      out.write("            <fieldset><legend class=\"estiloUSER1\">USUARIO</legend>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"text\" name=\"usuario\" id=\"usuario\" class=\"estiloUSER2\" required/>\n");
      out.write("            <br/>\n");
      out.write("            <button type=\"submit_user\" class=\"estiloUSER3\">BUSCAR</button>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
}
