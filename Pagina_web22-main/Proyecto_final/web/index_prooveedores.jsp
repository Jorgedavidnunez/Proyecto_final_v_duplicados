<%-- 
    Document   : index_prooveedores
    Created on : Sep 26, 2021, 5:16:59 PM
    Author     : Luis Fernando Paxel
--%>
<%@page  import="modelo.Proveedor" %>
<%@page import="java.util.HashMap" %>
<%@page import="javax.swing.table.DefaultTableModel" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proveedores</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


        <link rel="stylesheet" href="css/estilo_proveedor.css">
    </head>
    <body>
        <form  action="index.html">
            <input class="btn_form" type="submit" value="Menu" />

            <button type="button" class="btn_form" data-toggle="modal" data-target="#modal_proveedor" onclick="Limpiar()">
                Formulario
            </button>
        </form>
        <div class="container p-3 my-3 bg-light  text-black">
            <div class="formulario_titulo">
                <h5>Formulario Proveedores :3</h5>
            </div>
            <br> 

            <div class="modal fade" data-backdrop="static" data-keyboard="false" tabindex="-1" id="modal_proveedor" role="dialog">
                <div class="modal-dialog modal-xl">
                    <div class="modal-content">
                        <div class="modal-body  formula_modal">
                            <form action="src_proveedor" method="post" class="formulario" class="form-group" id="formulario">

                                <div class="formulario__grupo" id="grupo__txt_id">
                                    <label for="nombre" class="formulario__label">ID:</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name="txt_id" id="txt_id" value="0" readonly>
                                    </div>
                                </div>
                                <!-- Proveedor -->
                                <div class="formulario__grupo" id="grupo__txt_proo">
                                    <label for="lbl_proo" class="formulario__label">Proveedor: </label>
                                    <div class="formulario__grupo-input">

                                        <input type="text" class="formulario__input  " name="txt_proo" id="txt_proo"  pattern="[A-Z]{1}[a-zA-ZÀ-ÿ\s]{3,40}"  placeholder="Organización" required>
                                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">No estan permitidos los numeros</p>
                                </div>

                                <!-- Grupo: NIT-->
                                <div class="formulario__grupo" id="grupo__txt_nit">
                                    <label for="lbl_nit" class="formulario__label">NIT: </label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name="txt_nit" id="txt_nit" pattern="[0-9]{6}[-][0-9]{1}" placeholder="######-#" required>
                                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Nit Válido: ######-#</p>
                                </div>

                                <!-- Direccion -->
                                <div class="formulario__grupo" id="grupo__txt_direccion">
                                    <label for="lbl_direccion" class="formulario__label">Dirección: </label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name="txt_direccion" id="txt_direccion" pattern="[A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}[ ][A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}" placeholder="Direccion"  required>
                                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Lugar, Pais </p>
                                </div>

                                <!-- Telefono -->
                                <div class="formulario__grupo" id="grupo__txt_telefono">
                                    <label for="lbl_telefono" class="formulario__label">Telefono: </label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name="txt_telefono" id="txt_telefono" pattern="[+]{1}[0-9]{1,4}[ ][0-9]{7,14}" placeholder="+### ########"  required>
                                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Extension del Pais, número de teléfono</p>
                                </div>
                                <br>
                                <div class=" formulario__grupo-btn-enviar">
                                    <button  name="btn_agregar" id="btn_agregar" value="agregar"    class="formulario__btn " >Agregar</button>
                                    <button  name="btn_modificar" id="btn_modificar" value="modificar" class="formulario__btn1" >Modificar</button>
                                     <button  name="btn_2" id="btn_2" onclick="return confirmar2();" value="eliminar"class="formulario__btn2" > Eliminar </button>
                                </div>
                                <button name="btn_eliminar" id="btn_eliminar"  value="eliminar"class="btn_falso" > </button>
                                <br> 
                            </form>

                            <div class="modal-footer">
                                <button type="button" class="btn btn-warning mod_salir" onclick="recargar()"  onclick="unselect()"  data-dismiss="modal">Salir</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class= "container">
                <table class="table table-hover table-bordered">
                    <thead class="thead-dark   titulos">      
                        <tr>
                            <th>Proveedor</th> 
                            <th>Nit</th>
                            <th>Direccion</th>
                            <th>Teléfono</th>
                        </tr>
                    </thead>
                    <tbody class="formula_tabla" id="tbl_proveedores">
                        <% 
                                Proveedor prov = new Proveedor();
                                DefaultTableModel tabla = new DefaultTableModel();
                                tabla= prov.leer3();
                                int cero=0;
                                for (int r=0; r<tabla.getRowCount(); r++){
                                cero++;
                                out.println("<tr data-id=" + tabla.getValueAt(r,0) + " >");
                                out.println("<td>" + tabla.getValueAt(r,1) + "</td>");
                                out.println("<td>" + tabla.getValueAt(r,2) + "</td>");
                                out.println("<td>" + tabla.getValueAt(r,3) + "</td>");             
                                out.println("<td>" + tabla.getValueAt(r,4) + "</td>");
                                out.println("</tr>");
                                }
                                  out.println("<div class='contador_lbl'>"+"<h5 >"+"No. Proveedores "+cero+"</h5>"+"</div>");
                        %>
                    </tbody>
                </table>
            </div>
            <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
            <script type = "text/javascript " src = "js/formulario_proveedor.js" > </script> 
        </div>
    </body>
</html>
