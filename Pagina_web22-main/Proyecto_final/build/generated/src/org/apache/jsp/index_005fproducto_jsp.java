package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Marca;
import java.util.HashMap;
import modelo.Producto;
import javax.swing.table.DefaultTableModel;

public final class index_005fproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo_producto.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  action=\"index.html\">\n");
      out.write("            <input class=\"btn_form\" type=\"submit\" value=\"Menu\" />\n");
      out.write("            <button type=\"button\" class=\"btn_form\" data-toggle=\"modal\" data-target=\"#modal_producto\" onclick=\"Limpiar()\">\n");
      out.write("                Formulario\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid p-3 my-3 bg-light  text-black\">\n");
      out.write("            <div class=\"formulario_titulo\">\n");
      out.write("                <h5>Formulario Productos</h5>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"modal fade\"  data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" id=\"modal_producto\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog modal-xl\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-body  formula_modal\">\n");
      out.write("                           <form  action=\"index_marcas.jsp\">\n");
      out.write("                                <input class=\"enlaze_marcas\" type=\"submit\" value=\"Marcas\" />\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            <form action=\"src_producto\" method=\"post\" class=\"formulario\" name=\"formulario\"  class=\"form-group\" id=\"formulario\" >\n");
      out.write("                                <!-- ID -->\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo_txt_id\">\n");
      out.write("                                    <label for=\"lbl_id\" class=\"formulario__label\">ID:</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_id_producto\" id=\"txt_id_producto\" value=\"0\" readonly>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Producto -->\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_producto\">\n");
      out.write("                                    <label for=\"lbl_producto\" class=\"formulario__label\">Producto </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_producto\" id=\"txt_producto\" placeholder=\"Producto\" required >\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Solo esta permitido letras </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Existencia -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_existencia\">\n");
      out.write("                                    <label for=\"lbl_descripcion\" class=\"formulario__label\">Existencia </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"number\" class=\"formulario__input\" name=\"txt_existencia\" id=\"txt_existencia\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!--Descripción -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_descripcion\">\n");
      out.write("                                    <label for=\"lbl_descripcion\" class=\"formulario__label\">Descripcion </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_descripcion\" id=\"txt_descripcion\"  placeholder=\"Descripcion del producto\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Solo esta permitido letras </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Precio Costo -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_pcos\">\n");
      out.write("                                    <label for=\"lbl_descripcion\" class=\"formulario__label\">Precio Costo </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <span class=\"input-group-text\" style=\"position: absolute; margin-left: 0px; margin-top: 0px;\">Q</span>\n");
      out.write("                                        <input type=\"number\" style=\"padding-left: 40px;\" class=\"formulario__input\" step=\"0.01\" name=\"txt_costo\" id=\"txt_costo\" class=\"form-control\" placeholder=\"Q##. ##\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Precio Venta-->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_pven\">\n");
      out.write("                                    <label for=\"lbl_descripcion\" class=\"formulario__label\">Precio Venta </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <span class=\"input-group-text\" style=\"position: absolute; margin-left: 0px; margin-top: 0px;\">Q</span>\n");
      out.write("                                        <input type=\"number\" style=\"padding-left: 40px;\"  class=\"formulario__input\" step=\"0.01\" name=\"txt_venta\" id=\"txt_venta\" placeholder=\"Q##. ##\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Imagen -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_imagen\">\n");
      out.write("                                    <label for=\"lbl_imagen\" class=\"formulario__label\">Imagen </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name=\"txt_imagen\" id=\"txt_imagen\" placeholder=\"Link de la imagen del producto\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Marcas -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_marcas\">\n");
      out.write("                                    <label for=\"lbl_marcas\" class=\"formulario__label\">Marcas:</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <select name=\"drop_marcas\" id=\"drop_marcas\" class=\"formulario__input\">\n");
      out.write("                                            ");

                                                Marca marca= new Marca();
                                                HashMap<String,String> desplegar= marca.mostrar_marcas();
                                                for(String i:desplegar.keySet())
                                                {
                                                    out.println("<option value="+i+">"+desplegar.get(i)+ "</option>");
                                                }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>    \n");
      out.write("                                <!-- Fecha Ingreso -->\n");
      out.write("\n");
      out.write("                                <div class=\"formulario__grupo\" id=\"grupo__txt_fni\">\n");
      out.write("                                    <label for=\"lbl_fecha\" class=\"formulario__label\">Fecha Ingreso </label>\n");
      out.write("                                    <input type=\"text\" class=\"formulario__input\" name=\"txt_fecha_ingreso\" id=\"txt_fecha_ingreso\" value=\"YYYY/MM/DD HH:MM\" readonly=\"\">\n");
      out.write("                                </div>     \n");
      out.write("                                <br> \n");
      out.write("                                <div class=\" formulario__grupo-btn-enviar\">\n");
      out.write("                                    <button  name=\"btn_agregar_productos\" id=\"btn_agregar_productos\" value=\"agregar_producto\" class=\"formulario__btn \" >Agregar</button>\n");
      out.write("                                    <button  name=\"btn_modificar_productos\" id=\"btn_modificar_productos\" value=\"modificar_producto\" class=\"formulario__btn1\" >Modificar</button>\n");
      out.write("                                    <button  name=\"btn_2\" id=\"btn_2\" onclick=\"return confirmar2();\" value=\"eliminar\"class=\"formulario__btn2\" > Eliminar </button>\n");
      out.write("                                </div>\n");
      out.write("                                <button name=\"btn_eliminar_productos\" id=\"btn_eliminar_productos\"  value=\"eliminar_producto\"class=\"btn_falso\" > </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>  \n");
      out.write("\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button  type=\"button\" class=\"btn btn-warning mod_salir\" onclick=\"recargar()\"  onclick=\"unselect()\" data-dismiss=\"modal\">Salir</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>              \n");
      out.write("\n");
      out.write("            <br> <br>\n");
      out.write("            <table class=\"table table-hover table-bordered\">\n");
      out.write("                <thead class=\"thead-dark   titulos\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Producto </th>\n");
      out.write("                        <th>Descripcion </th>\n");
      out.write("                        <th>Imagen</th>\n");
      out.write("                        <th>Precio Costo </th>\n");
      out.write("                        <th>Precio Venta </th>\n");
      out.write("                        <th>Existencia</th>\n");
      out.write("                        <th>Fecha ingreso</th>\n");
      out.write("                        <th>Marca </th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody class=\"formula_tabla\" id=\"tbl_productos\">\n");
      out.write("                    ");

                    Producto producto = new Producto();
                    DefaultTableModel tabla = new DefaultTableModel();
                    tabla = producto.leer();
                    int cero =0;
                    for (int t=0;t <tabla.getRowCount();t++){
                        cero++;
                        out.println("<tr data-id="+tabla.getValueAt(t, 0)+" data-id_producto="+tabla.getValueAt(t, 9)+">");
                        out.println("<td>"+ tabla.getValueAt(t, 1)+"</td>");
                        out.println("<td>"+ tabla.getValueAt(t, 2)+"</td>");
                        out.println("<td>"+ tabla.getValueAt(t, 3)+"</td>");
                        out.println("<td>"+ tabla.getValueAt(t, 4)+"</td>");
                        out.println("<td>"+ tabla.getValueAt(t, 5)+"</td>");
                        out.println("<td>"+ tabla.getValueAt(t, 6)+"</td>");
                        out.println("<td>"+tabla.getValueAt(t,7)+"</td>");
                        out.println("<td>"+tabla.getValueAt(t,8)+"</td>");
                        //out.println("<td>"+tabla.getValueAt(t,9)+"</td>");
                        out.println("</tr>");
                    }
                       out.println("<div class='contador_lbl'>"+"<h5 >"+"No. Productos "+cero+"</h5>"+"</div>");
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("            <script type = \"text/javascript \" src = \"js/formulario_productos.js\" > </script> \n");
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
