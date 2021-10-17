package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public final class index_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Formulario</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo_cliente.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  action=\"index.html\">\n");
      out.write("            <input class=\"btn_form\" type=\"submit\" value=\"Menu\" />\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"  btn_form\"  data-toggle=\"modal\" data-target=\"#modal_cliente\" onclick=\"Limpiar2()\">\n");
      out.write("                Formulario\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("        <div class=\"container-fluid  p-3 my-3 bg-light  text-black\">\n");
      out.write("            <div class=\"formulario_titulo\">\n");
      out.write("                <h5>Formulario Clientes :0</h5>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"modal fade\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" id=\"modal_cliente\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog modal-xl \" >\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-body formula_modal\">\n");
      out.write("                            <form action=\"src_cliente\" class=\"formulario\" method=\"post\" id=\"formulario\" >\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_id\">\n");
      out.write("                                    <label for=\"nombre\" class=\"formulario__label\">ID:</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_id\" id=\"txt_id\" value=\"0\" readonly>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_nombre\">\n");
      out.write("                                    <label for=\"nombre\" class=\"formulario__label\">Nombres: </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input  \" name=\"txt_nombre\" id=\"txt_nombre\"  pattern=\"[A-Z]{1}[a-zA-ZÀ-ÿ\\s]{3,40}([ ][A-Z]{1}[a-zA-ZÀ-ÿ\\s]{3,40})?\"  placeholder=\"Nombres\" required>\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Los Nombres deben Empezar Con inicial mayuscula.</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Grupo: Apellido -->\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_apellido\">\n");
      out.write("                                    <label for=\"apellido\" class=\"formulario__label\">Apellidos: </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_apellido\" id=\"txt_apellido\" pattern=\"[A-Z]{1}[a-zA-ZÀ-ÿ\\s]{3,40}[ ][A-Z]{1}[a-zA-ZÀ-ÿ\\s]{3,40}\" placeholder=\"Apellidos\" required>\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Los apellidos deben iniciar con iniciales mayusculas</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Grupo: nit -->\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_nit\">\n");
      out.write("                                    <label for=\"nit\" class=\"formulario__label\">Nit: </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_nit\" id=\"txt_nit\"   pattern=\"[0-9]{1,6}[-][0-9]{1}\" placeholder=\"######-#\" required>\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Nit Válido ######-#</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Genero -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo_txt_genero\">\n");
      out.write("                                    <label for=\"genero\" class=\"formulario__label\">Genero:</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input   name=\"gen\" type=\"radio\" id=\"uno\" value=\"Masculino\" required />Masculino           \n");
      out.write("                                        <input    name=\"gen\"  type=\"radio\" id=\"dos\" value=\"Femenino\"  />Femenino\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Grupo: Teléfono -->\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_telefono\">\n");
      out.write("                                    <label for=\"telefono\" class=\"formulario__label\">Teléfono:</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_telefono\" id=\"txt_telefono\" pattern=\"[+]{1}[0-9]{1,4}[ ][0-9]{7,14}\" placeholder=\"+### ########\" required>\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Extension del pais, numero de telefono</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Grupo: Correo Electronico -->\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_correo\">\n");
      out.write("                                    <label for=\"correo\" class=\"formulario__label\">Correo Electrónico</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"email\" class=\"formulario__input \" name=\"txt_correo\" id=\"txt_correo\" placeholder=\"correo@correo.com\" required>\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El correo solo puede contener letras, numeros, puntos, guiones y guion bajo.</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\" formulario__grupo-btn-enviar\">\n");
      out.write("                                    <button  name=\"btn_agregar\" id=\"btn_agregar\" value=\"agregar\"    class=\"formulario__btn \" >Agregar</button>\n");
      out.write("                                    <button  name=\"btn_modificar\" id=\"btn_modificar\" value=\"modificar\" class=\"formulario__btn1\" >Modificar</button>\n");
      out.write("                                 <button  name=\"btn_2\" id=\"btn_2\" onclick=\"return confirmar2();\" value=\"eliminar\"class=\"formulario__btn2\" > Eliminar </button>\n");
      out.write("                                </div>\n");
      out.write("                                <button name=\"btn_eliminar\" id=\"btn_eliminar\"  value=\"eliminar\"class=\"btn_falso\" >  </button>\n");
      out.write("                                <br>\n");
      out.write("                            </form>                  \n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\"  class=\"btn btn-warning mod_salir\" onclick=\"recargar()\"   data-dismiss=\"modal\">Salir</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class= \"container \">\n");
      out.write("                <table class=\"table table-hover table-bordered\">\n");
      out.write("                    <thead class=\"thead-dark   titulos\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombres</th> \n");
      out.write("                            <th>Apellidos</th>\n");
      out.write("                            <th>Nit</th>\n");
      out.write("                            <th>Genero</th>\n");
      out.write("                            <th>Teléfono</th>\n");
      out.write("                            <th>Correo Electronico</th>\n");
      out.write("                            <th>Fecha Ingreso</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody class=\"formula_tabla\" id=\"tbl_cliente\">\n");
      out.write("                        ");
 
                        Cliente cliente = new Cliente();
                        DefaultTableModel tabla = new DefaultTableModel();
                        tabla= cliente.leer3();
                        int cero =0;
                        for (int r=0; r<tabla.getRowCount(); r++){
                        cero++;  
                        out.println("<tr data-id=" + tabla.getValueAt(r,0) + " >");
                        out.println("<td>" + tabla.getValueAt(r,1) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,2) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,3) + "</td>");             
                        out.println("<td>" + tabla.getValueAt(r,4) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,5) + "</td>");     
                        out.println("<td>" + tabla.getValueAt(r,6) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,7) + "</td>");
                        out.println("</tr>");
                        }
                        out.println("<div class='contador_lbl'>"+"<h5 >"+"No. Clientes "+cero+"</h5>"+"</div>");        
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("             <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("            <script type = \"text/javascript \" src = \"js/formulario_cliente.js\" > </script> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
