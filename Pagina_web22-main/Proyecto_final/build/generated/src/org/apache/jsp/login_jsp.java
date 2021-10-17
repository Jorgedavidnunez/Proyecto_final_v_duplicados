package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\" integrity=\"sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elogin.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        ");

            response.setHeader("Cach-Control","no-cache, must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setDateHeader("Expires", 0);
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cuerpoFormulario\" id=\"cuerpoFormulario\">\n");
      out.write("            <form class=\"formularioLogin\" id=\"formularioLogin\" method=\"post\" action=\"sr_iniciar_sesion\">\n");
      out.write("                <h1>Inicio de Sesión</h1>\n");
      out.write("                <br>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                     <i class=\"fas fa-user-circle\"></i>\n");
      out.write("                    <input type=\"text\" class=\"txt\" id=\"txtUsuario\" required=\"\" name=\"txtUsuario\" placeholder=\"Ingrese su usuario\" autocomplete=\"off\">\n");
      out.write("                </div>\n");
      out.write("                 ");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                    <i class=\"fas fa-key\"></i>\n");
      out.write("                    <input type=\"password\" class=\"txt\" id=\"txtContrasena\" required=\"\" name=\"txtContrasena\" placeholder=\"Ingrese su contraseña\" autocomplete=\"off\">\n");
      out.write("                </div>     \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Iniciar Sesion\" class=\"btn\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"button\" value=\"Limpiar datos\" class=\"btn\" onclick=\"borrarDatosLogin()\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("                      \n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/funcionesLogin.js\"></script>\n");
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
