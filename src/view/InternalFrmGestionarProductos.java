/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.ProductoController;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import model.Producto;

/**
 *
 * @author SENA
 */
public class InternalFrmGestionarProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrmGestionarProductos
     */
    
    private int idProducto; 
    public InternalFrmGestionarProductos() {
        initComponents();
        
        this.setSize(new Dimension(900, 500)); 
        this.setTitle("Gestionar Productos"); 
        this.cargarTablaProductos(); 
        
        //Imagen de fondo 
        ImageIcon wallper = new ImageIcon("src/img/fondo3.jpg"); 
        Icon icono = new ImageIcon(wallper.getImage().getScaledInstance(900, 500, WIDTH)); 
        fondo.setIcon(icono);
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ctNomProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ctDesProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctPrecProd = new javax.swing.JTextField();
        ctCanProd = new javax.swing.JTextField();
        selComboIVA = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 650, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnEditar.setBackground(new java.awt.Color(51, 204, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 170, 220));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del Producto: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("IVA: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Precio: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descripcion: ");

        selComboIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Sin IVA", "5%", "19%", "32%" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctPrecProd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(ctCanProd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(ctNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctDesProd, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(selComboIVA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(116, 116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ctDesProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(selComboIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(ctCanProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ctPrecProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 840, 140));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Producto producto = new Producto();
        ProductoController controlproducto = new ProductoController();

        String iva = "";
        iva = selComboIVA.getSelectedItem().toString().trim();

        if (ctNomProd.getText().isEmpty() || ctCanProd.getText().isEmpty() || ctPrecProd.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else
        {
            if (iva.equalsIgnoreCase("Seleccione una opcion: "))
            {
                JOptionPane.showMessageDialog(null, "Seleccione Iva");
            } else
            {
                try
                {
                    //Nombre del Producto
                    producto.setNomprod(ctNomProd.getText().trim());

                    //Cantidad de Productos
                    producto.setCantprod(Integer.parseInt(ctCanProd.getText().trim()));

                    //Convertir Precio (,) a (.)
                    String precio = "";
                    double Precio = 0.0;
                    precio = ctPrecProd.getText().trim();
                    boolean aux = false;

                    for (int i = 0; i < precio.length(); i++)
                    {
                        if (precio.charAt(i) == ',')
                        {
                            String precioNuevo = precio.replace(",", ".");
                            Precio = Double.parseDouble(precioNuevo);
                            aux = true;
                        }
                    }

                    if (aux == true)
                    {
                        producto.setPrecprod(Precio);
                    } else
                    {
                        Precio = Double.parseDouble(precio);
                        producto.setPrecprod(Precio);
                    }

                    //Descripcion del Producto
                    producto.setDesprod(ctDesProd.getText().trim());

                    //Validacion de Iva
                    if (iva.equalsIgnoreCase("Sin IVA"))
                    {
                        producto.setIvaprod(0);
                    } else if (iva.equalsIgnoreCase("5%"))
                    {
                        producto.setIvaprod(5);
                    } else if (iva.equalsIgnoreCase("19%"))
                    {
                        producto.setIvaprod(19);
                    } else if (iva.equalsIgnoreCase("32%"))
                    {
                        producto.setIvaprod(32);
                    }

                    //Estado del Producto
                    producto.setStateprod(1);

                    if (controlproducto.editar(producto, idProducto)){
                        JOptionPane.showMessageDialog(null, "Registro Actualizado");
                        this.cargarTablaProductos();
                        this.selComboIVA.setSelectedItem("Seleccione una opcion");
                        this.limpiarCampos();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al Actualizar");
                    }

                } catch(HeadlessException | NumberFormatException e){
                    System.out.println("Error: "+ e);
                }
            }
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ProductoController controladorProducto = new ProductoController(); 
        if(idProducto == 0){
            JOptionPane.showMessageDialog(null, "Seleecione un Producto");
        }else{
            if(controladorProducto.eliminar(idProducto)){
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                this.cargarTablaProductos();
                this.limpiarCampos(); 
            }else{
                JOptionPane.showMessageDialog(null, "¡Error al Eliminar Producto!");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField ctCanProd;
    private javax.swing.JTextField ctDesProd;
    private javax.swing.JTextField ctNomProd;
    private javax.swing.JTextField ctPrecProd;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selComboIVA;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    String descripcionCategoria = ""; 
    double precio = 0.0; 
    int porcentajeIVA = 0; 
    double IVA = 0.0; 
    
    private void cargarTablaProductos() {
        Connection con = Conexion.conectar(); 
        DefaultTableModel model = new DefaultTableModel(); 
        String sql = "SELECT idprod, namprod, cantprod, precprod, desprod, ivaprod FROM producto";
        Statement st;
        try{
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Descripcion");
            model.addColumn("IVA");
            tblProductos.setModel(model); 
            st = con.createStatement(); 
            ResultSet rs = st.executeQuery(sql);
            
        while(rs.next()){
            
            precio = rs.getDouble("precprod"); 
            porcentajeIVA = rs.getInt("ivaprod"); 
            
            Object fila[] = new Object[6]; 
            for(int i = 0 ; i < 6; i++){
                if (i == 5){
                    this.calcularIVA(precio, porcentajeIVA);
                    fila[i] = IVA; 
                    rs.getObject(i+1); 
                }else {
                    fila[i] = rs.getObject(i+1); 
                }
            }
            model.addRow(fila);
        }
        
        con.close();
        }catch(SQLException e){
            System.out.println("Error al mostrar productos en la tabla: " + e);
        }
        tblProductos.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e){
               int  fila_point = tblProductos.rowAtPoint(e.getPoint());
               int columna_point = 0; 

               if(fila_point > -1){
                  idProducto = (int) model.getValueAt(fila_point, columna_point);
                  EnviarDatosProductoSeleccionado(idProducto); 
               }
           }

            private void EnviarDatosProductoSeleccionado(int idProducto) {
                try{
                    Connection con = Conexion.conectar(); 
                    PreparedStatement pst = con.prepareStatement("SELECT * FROM producto WHERE idprod= '"+idProducto+"'");  
                    ResultSet rs = pst.executeQuery(); 
                    if(rs.next()){
                        ctNomProd.setText(rs.getString("namprod"));
                        ctCanProd.setText(rs.getString("cantprod"));
                        ctPrecProd.setText(rs.getString("precprod"));
                        ctDesProd.setText(rs.getString("desprod"));
                        int iva = rs.getInt("ivaprod"); 
                        switch(iva){
                            case 0: 
                                selComboIVA.setSelectedItem("Sin IVA");
                            break; 
                        case 5: 
                            selComboIVA.setSelectedItem("5%");
                            break; 
                        case 19: 
                            selComboIVA.setSelectedItem("19%");
                            break; 
                        case 32: 
                            selComboIVA.setSelectedItem("32%");
                            break; 

                        default:
                            selComboIVA.setSelectedItem("Seleccione una opcion");
                                break; 
                        }
                    }
          
                }catch(SQLException e){
                    System.out.println("Error al seleccionar Producto en la Tabla: " + e);
                }
            }
       });    
    }

    private double calcularIVA(double precio, int porcentajeIVA) {
        int p_iva = porcentajeIVA; 
        switch(p_iva){
            case 0: 
                IVA = 0.0; 
                break; 
            case 5: 
                IVA = precio*0.05; 
                break; 
            case 19: 
                IVA = precio*0.19; 
                break; 
            case 32: 
                IVA = precio*0.32; 
                break; 
                
            default:
                    break; 
        }
        
        IVA = (double) Math.round(IVA*100)/100; 
        return IVA; 
    }

    private void limpiarCampos() {
        ctNomProd.setText("");
        ctCanProd.setText("");
        ctPrecProd.setText("");
        ctDesProd.setText("");
        selComboIVA.setSelectedItem("Sin IVA");

    }

    
}
