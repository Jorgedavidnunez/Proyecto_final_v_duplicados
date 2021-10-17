package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Marca;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public final class index_005fmarcas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Marcas</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo_marca.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  action=\"index.html\">\n");
      out.write("            <input class=\"btn_form\" type=\"submit\" value=\"Menu\" />\n");
      out.write("            <button type=\"button\" class=\" btn_form\" data-toggle=\"modal\" data-target=\"#modal_marca\" onclick=\"Limpiar()\">\n");
      out.write("                Marcas\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div class=\"container p-3 my-3 bg-light  text-black\">\n");
      out.write("            <div class=\"modal fade\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" id=\"modal_marca\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog modal-xl \">\n");
      out.write("                    <div class=\"modal-content \">\n");
      out.write("                        <div class=\"modal-body formula_modal\">\n");
      out.write("                            <form  action=\"index_producto.jsp\">\n");
      out.write("                                <input class=\"enlaze_producto\" type=\"submit\" value=\"Productos\" />\n");
      out.write("                            </form>\n");
      out.write("                            <form action=\"src_marca\" method=\"post\" class=\"form-group\" name=\"formulario\" id=\"formulario\" >\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo_txt_id_marca\">\n");
      out.write("                                    <label for=\"lbl_id\" class=\"formulario__label\">ID:</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_id_marca\" id=\"txt_id_marca\" value=\"0\" readonly>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_marca\">\n");
      out.write("                                    <label for=\"lbl_marca\" class=\"formulario__label\">Marca: </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_marca\" id=\"txt_marca\" placeholder=\"Nombre de la marca\" pattern=\"[A-Z]{1}[a-zA-ZÀ-ÿ\\s]{3,40}\" required>\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Solo esta permitido letras </p>\n");
      out.write("                                </div>\n");
      out.write("                                <br>\n");
      out.write("\n");
      out.write("                                <center>    \n");
      out.write("                                    <button  name=\"btn_agregar_marcas\" id=\"btn_agregar_marcas\" value=\"agregar_marca\"    class=\"formulario__btn \" >Agregar</button>\n");
      out.write("                                    <button  name=\"btn_modificar_marcas\" id=\"btn_modificar_marcas\" value=\"modificar_marca\" class=\"formulario__btn1\" >Modificar</button>\n");
      out.write("                                    <button  name=\"btn_2\" id=\"btn_2\" onclick=\"return confirmar2();\" value=\"eliminar\"class=\"formulario__btn2\" > Eliminar </button>\n");
      out.write("                                </center>\n");
      out.write("                                <button name=\"btn_eliminar_marcas\" id=\"btn_eliminar\"  value=\"eliminar_marca\"class=\"btn_falso\" > </button>\n");
      out.write("\n");
      out.write("                            </form>   \n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-warning mod_salir\" onclick=\"recargar()\"  data-dismiss=\"modal\">Salir</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"formulario_titulo\">\n");
      out.write("                <h5>Formulario Marcas</h3>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class= \"container \">\n");
      out.write("                <table class=\"table table-hover table-bordered\">\n");
      out.write("                    <thead class=\"thead-dark   titulos\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Marcas</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody class=\"formula_puesto\" id=\"tbl_marcas\">\n");
      out.write("                        ");

                        Marca marca = new Marca();
                        DefaultTableModel tabla = new DefaultTableModel();
                        tabla = marca.leer();
                        int cero=0;
                        for (int t=0;t <tabla.getRowCount();t++){
                            cero++;
                            out.println("<tr data-id="+tabla.getValueAt(t, 0)+" data-id_marca="+tabla.getValueAt(t, 1)+">");
                            out.println("<td>"+ tabla.getValueAt(t, 1)+"</td>");
                            //out.println("<td>"+tabla.getValueAt(t,9)+"</td>");
                            out.println("</tr>");
                        }
                           out.println("<div class='contador_lbl'>"+"<h5 >"+"Marcas Encontradas: "+cero+"</h5>"+"</div>");
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("            <script type = \"text/javascript \" src = \"js/formulario_marca.js\" > </script> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
