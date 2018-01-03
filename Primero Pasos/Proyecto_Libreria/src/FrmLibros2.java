
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandy
 */
public class FrmLibros2 extends javax.swing.JFrame {

    /**
     * Creates new form FrmLibros2
     */
    public FrmLibros2() {
        initComponents();
           this.setLocationRelativeTo(null);
    }
    
    public void validar(){
        if (txtTitulo.getText().equals("")){
             int axx = JOptionPane.showConfirmDialog(null, "Debe Completar los campos Requeridos");
            
        }
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        lbCategoria = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        lbAutor = new javax.swing.JLabel();
        lbEditorial = new javax.swing.JLabel();
        lbPaginas = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbStock = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtTitulo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informacion Basica del Libro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 250, -1));

        btnBuscar.setBackground(new java.awt.Color(97, 112, 195));
        btnBuscar.setForeground(new java.awt.Color(36, 47, 65));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search_50px.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 100, 60));

        btnGuardar.setBackground(new java.awt.Color(97, 112, 195));
        btnGuardar.setForeground(new java.awt.Color(36, 47, 65));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_50px.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 100, 60));

        txtCategoria.setBackground(new java.awt.Color(36, 47, 65));
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setText("Ingrese la Categoria");
        txtCategoria.setBorder(null);
        txtCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCategoriaMouseClicked(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 20));

        lbCategoria.setBackground(new java.awt.Color(204, 204, 204));
        lbCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(153, 153, 153));
        lbCategoria.setText("Categoria");
        jPanel1.add(lbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        txtStock.setBackground(new java.awt.Color(36, 47, 65));
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setText("Ingrese la Cantidad de Libros");
        txtStock.setBorder(null);
        txtStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStockMouseClicked(evt);
            }
        });
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 320, 20));

        txtPaginas.setBackground(new java.awt.Color(36, 47, 65));
        txtPaginas.setForeground(new java.awt.Color(255, 255, 255));
        txtPaginas.setText("Ingrese Cantidad de Paginas");
        txtPaginas.setBorder(null);
        txtPaginas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPaginasMouseClicked(evt);
            }
        });
        txtPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaginasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginasKeyTyped(evt);
            }
        });
        jPanel1.add(txtPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 320, 20));

        txtEditorial.setBackground(new java.awt.Color(36, 47, 65));
        txtEditorial.setForeground(new java.awt.Color(255, 255, 255));
        txtEditorial.setText("Ingrese Editorial");
        txtEditorial.setBorder(null);
        txtEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEditorialMouseClicked(evt);
            }
        });
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 320, 20));

        txtAutor.setBackground(new java.awt.Color(36, 47, 65));
        txtAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setText("Ingrese Autor");
        txtAutor.setBorder(null);
        txtAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAutorMouseClicked(evt);
            }
        });
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 320, -1));

        lbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(153, 153, 153));
        lbTitulo.setText("Titulo");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));

        lbAutor.setBackground(new java.awt.Color(204, 204, 204));
        lbAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAutor.setForeground(new java.awt.Color(153, 153, 153));
        lbAutor.setText("Autor");
        jPanel1.add(lbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        lbEditorial.setBackground(new java.awt.Color(204, 204, 204));
        lbEditorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEditorial.setForeground(new java.awt.Color(153, 153, 153));
        lbEditorial.setText("Editorial");
        jPanel1.add(lbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        lbPaginas.setBackground(new java.awt.Color(204, 204, 204));
        lbPaginas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPaginas.setForeground(new java.awt.Color(153, 153, 153));
        lbPaginas.setText("Paginas");
        jPanel1.add(lbPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 320, -1));

        lbStock.setBackground(new java.awt.Color(204, 204, 204));
        lbStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbStock.setForeground(new java.awt.Color(153, 153, 153));
        lbStock.setText("Stock");
        jPanel1.add(lbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 50, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 320, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 320, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 320, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 320, 10));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 240, 20));

        txtTitulo.setBackground(new java.awt.Color(36, 47, 65));
        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Ingrese Titulo");
        txtTitulo.setBorder(null);
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTituloMouseClicked(evt);
            }
        });
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 310, 20));

        btnSalir.setBackground(new java.awt.Color(97, 112, 195));
        btnSalir.setForeground(new java.awt.Color(97, 112, 195));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_50px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 100, 60));

        btnActualizar.setBackground(new java.awt.Color(97, 112, 195));
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(36, 47, 65));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save as_50px.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 100, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
           if (txtTitulo.getText().equals("") || txtAutor.getText().equals("")||txtEditorial.getText().equals("")||txtPaginas.getText().equals("")||txtStock.getText().equals("")||txtCategoria.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe Completar los Campos Requeridos");
            
        }else{
        
          try {
            PreparedStatement pst  = cn.prepareStatement("INSERT INTO libros(Titulo,Autor,Editorial,Paginas,Stock,Categoria)values(?,?,?,?,?,?)");
            pst.setString(1, txtTitulo.getText());
            pst.setString(2, txtAutor.getText());
            pst.setString(3, txtEditorial.getText());
            pst.setString(4, txtPaginas.getText());
            pst.setString(5, txtStock.getText());
            pst.setString(6, txtCategoria.getText());
            pst.executeUpdate();

            int ax = JOptionPane.showConfirmDialog(null, "Estas seguro de agregar este libro?");
            if(ax == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "EL Libro fue agregado con éxito!!!");

                txtTitulo.setText("");
                txtAutor.setText("");
                txtEditorial.setText("");
                txtPaginas.setText("");
                txtStock.setText("");
                txtCategoria.setText("");

            }
            else if(ax == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "No se agrego el libro");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           }  
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        FrmBuscarLibros Buscar= new   FrmBuscarLibros();
        Buscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMouseClicked
        // TODO add your handling code here:
        txtTitulo.setText("");
    }//GEN-LAST:event_txtTituloMouseClicked

    private void txtAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutorMouseClicked
        // TODO add your handling code here:
        txtAutor.setText("");
    }//GEN-LAST:event_txtAutorMouseClicked

    private void txtEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditorialMouseClicked
        // TODO add your handling code here:
        txtEditorial.setText("");
    }//GEN-LAST:event_txtEditorialMouseClicked

    private void txtPaginasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaginasMouseClicked
        // TODO add your handling code here:
        txtPaginas.setText("");
    }//GEN-LAST:event_txtPaginasMouseClicked

    private void txtStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockMouseClicked
        // TODO add your handling code here:
        txtStock.setText("");
    }//GEN-LAST:event_txtStockMouseClicked

    private void txtPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasKeyTyped
        // TODO add your handling code here:
         char c= evt.getKeyChar();
        if (Character.isLetter(c)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"En este campo solo se permiten numeros");
            
        }
       
        
    }//GEN-LAST:event_txtPaginasKeyTyped

    private void txtCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCategoriaMouseClicked
        // TODO add your handling code here:
        txtCategoria.setText("");
    }//GEN-LAST:event_txtCategoriaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst  = cn.prepareStatement("Update libros SET  Titulo='"+txtTitulo.getText()+"',Autor='"+txtAutor.getText()+"',Editorial='"+txtEditorial.getText()+"',Paginas='"+txtPaginas.getText()+"',Stock='"+txtStock.getText()+"',Categoria='"+txtCategoria.getText()+"' WHERE Titulo='"+txtTitulo.getText()+"'");        
         
 
            pst.executeUpdate();

            int ax = JOptionPane.showConfirmDialog(null, "Estas seguro de actualizar este Libro?");
            if(ax == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "EL Libro fue actualizado con éxito!!!");
                
                 txtTitulo.setText("");
                txtAutor.setText("");
                txtEditorial.setText("");
                txtPaginas.setText("");
                txtStock.setText("");
                txtCategoria.setText("");

      }
            else if(ax == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "No se actualizo el Libro");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtPaginasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginasKeyPressed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        // TODO add your handling code here:
        
        char c= evt.getKeyChar();
        if (Character.isDigit(c)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"En este campo solo se permiten letras");
            
        }
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        // TODO add your handling code here:
         char c= evt.getKeyChar();
        if (Character.isDigit(c)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"En este campo solo se permiten letras");
            
        }
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
        // TODO add your handling code here:
         char c= evt.getKeyChar();
        if (Character.isDigit(c)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"En este campo solo se permiten letras");
            
        }
    }//GEN-LAST:event_txtEditorialKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        // TODO add your handling code here:
         char c= evt.getKeyChar();
        if (Character.isDigit(c)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"En este campo solo se permiten letras");
            
        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        // TODO add your handling code here:
              char c= evt.getKeyChar();
        if (Character.isLetter(c)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"En este campo solo se permiten numeros");
            
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
             int ax =JOptionPane.showConfirmDialog(null, "Estas seguro que desea Salir?");
          if(ax == JOptionPane.YES_OPTION){
              JOptionPane.showMessageDialog(null, "Saliendo");
              dispose();
              
          }  else if(ax == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Cancelado");
            }
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLibros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLibros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLibros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLibros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLibros2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbEditorial;
    private javax.swing.JLabel lbPaginas;
    private javax.swing.JLabel lbStock;
    private javax.swing.JLabel lbTitulo;
    public static javax.swing.JTextField txtAutor;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtEditorial;
    public static javax.swing.JTextField txtPaginas;
    public static javax.swing.JTextField txtStock;
    public static javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

ConexionSQL ir = new ConexionSQL();
    Connection cn = ir.conexion();
}