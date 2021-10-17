package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class validarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/evalidar.css\" media=\"all\">\n");
      out.write("        ");

            response.setHeader("Cach-Control","no-cache, must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setDateHeader("Expires", 0);
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cuerpoFormulario\" id=\"cuerpoFormulario\">\n");
      out.write("            <form class=\"formularioAlta\" id=\"formularioAlta\" method=\"post\" action=\"sr_guardar_login\" autocomplete=\"off\">\n");
      out.write("                <h1>Registro Usuario</h1>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                <i class=\"fas fa-user-edit\"></i>\n");
      out.write("                ");
      out.write("<input type=\"number\" class=\"txt\" id=\"txtCurp\" required=\"\" onkeyup=\"generarUsuario()\" name=\"txtCurp\" placeholder=\"Codigo\" pattern=\"[J]{1}[0-9]{3}\">\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                <i class=\"fas fa-file-signature\"></i>\n");
      out.write("                ");
      out.write("<input type=\"text\" class=\"txt\" id=\"txtNombre\" required=\"\" onkeyup=\"generarUsuario()\" name=\"txtNombre\" placeholder=\"Nombre\" pattern=\"[A-Z]{1}[a-zA-ZÀ-ÿ\\s]{2,20}([ ][A-Z]{1}[a-zA-ZÀ-ÿ\\s]{2,20})?\">\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                <i class=\"fas fa-file-signature\"></i>\n");
      out.write("                ");
      out.write("<input type=\"text\" class=\"txt\" id=\"txtApellidos\" required=\"\" onkeyup=\"generarUsuario()\" name=\"txtApellidos\" placeholder=\"Apellidos\" pattern=\"[A-Z]{1}[a-zA-ZÀ-ÿ\\s]{2,20}([ ][A-Z]{1}[a-zA-ZÀ-ÿ\\s]{2,20})?\">\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                <i class=\"fas fa-unlock\"></i>\n");
      out.write("               ");
      out.write("<input type=\"password\" class=\"txt\" id=\"txtContrasena\" required=\"\" onkeyup=\"verificarContrasena()\" placeholder=\"Contraseña\" >\n");
      out.write("                </div> \n");
      out.write("               <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("                <i class=\"fas fa-lock\"></i> \n");
      out.write("                ");
      out.write("<input type=\"password\" class=\"txt \" id=\"txtRepetirContrasena\" required=\"\" onkeyup=\"verificarContrasena()\" name=\"txtContrasena\" placeholder=\"Verificar Contraseña\" >\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <label class=\"avisoContrasena\" id=\"avisoContrasena\" ></label>\n");
      out.write("                <br>\n");
      out.write("                <label>Usuario Generado: </label><input type=\"text\" class=\"txt\" id=\"txtUsuarioGeneradoAutomaticamente\" required=\"\" readonly=\"\" name=\"txtUsuarioGeneradoAutomaticamente\" placeholder=\"Usuario Generado\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Enviar Datos\" class=\"btn\" id=\"btnEnviarDatos\" disabled=\"\">\n");
      out.write("                <input type=\"button\" value=\"Borrar datos\" class=\"btn\" id=\"btnBorrardatos\" onclick=\"borrarDatosValidarUsuario()\">\n");
      out.write("            </form>\n");
      out.write("            <script src=\"js/funcionesValidarUsuario.js\"></script>\n");
      out.write("        </div>\n");
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
