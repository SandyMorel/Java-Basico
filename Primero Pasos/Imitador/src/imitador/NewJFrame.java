/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imitador;

import javax.swing.ButtonGroup;

/**
 *
 * @author sandy
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        //añadimos los radiobuttons en sus respectivos grupos
        ButtonGroup btg1 = new ButtonGroup();

        btg1.add(rdbOriginal1);
        btg1.add(rdbOriginal2);
        btg1.add(rdbOriginal3);

        ButtonGroup btg2 = new ButtonGroup();

        btg2.add(rdbImitacion1);
        btg2.add(rdbImitacion2);
        btg2.add(rdbImitacion3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        rdbOriginal1 = new javax.swing.JRadioButton();
        rdbOriginal2 = new javax.swing.JRadioButton();
        rdbOriginal3 = new javax.swing.JRadioButton();
        chkOriginal1 = new javax.swing.JCheckBox();
        chkOriginal2 = new javax.swing.JCheckBox();
        chkOriginal3 = new javax.swing.JCheckBox();
        txtOriginal = new javax.swing.JTextField();
        spnOriginal = new javax.swing.JSpinner();
        cbOriginal = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        rdbImitacion1 = new javax.swing.JRadioButton();
        rdbImitacion2 = new javax.swing.JRadioButton();
        rdbImitacion3 = new javax.swing.JRadioButton();
        chkImitacion1 = new javax.swing.JCheckBox();
        chkImitacion2 = new javax.swing.JCheckBox();
        chkImitacion3 = new javax.swing.JCheckBox();
        txtImitacion = new javax.swing.JTextField();
        cbImitacion = new javax.swing.JComboBox<>();
        spnImitacion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdbOriginal1.setText("Opcion 1");
        rdbOriginal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOriginal1ActionPerformed(evt);
            }
        });

        rdbOriginal2.setText("Opcion 2");
        rdbOriginal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOriginal2ActionPerformed(evt);
            }
        });

        rdbOriginal3.setText("Opcion 3");
        rdbOriginal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOriginal3ActionPerformed(evt);
            }
        });

        chkOriginal1.setText("Opcion 4");
        chkOriginal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOriginal1ActionPerformed(evt);
            }
        });

        chkOriginal2.setText("Opcion 5");
        chkOriginal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOriginal2ActionPerformed(evt);
            }
        });

        chkOriginal3.setText("Opcion 6");
        chkOriginal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOriginal3ActionPerformed(evt);
            }
        });

        txtOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOriginalActionPerformed(evt);
            }
        });
        txtOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOriginalKeyTyped(evt);
            }
        });

        spnOriginal.setFocusCycleRoot(true);
        spnOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnOriginalStateChanged(evt);
            }
        });

        cbOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2", "item3", "item4" }));
        cbOriginal.setToolTipText("");
        cbOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOriginalActionPerformed(evt);
            }
        });

        rdbImitacion1.setText("Opcion 1");
        rdbImitacion1.setEnabled(false);

        rdbImitacion2.setText("Opcion 2");
        rdbImitacion2.setEnabled(false);

        rdbImitacion3.setText("Opcion 3");
        rdbImitacion3.setEnabled(false);

        chkImitacion1.setText("Opcion 4");
        chkImitacion1.setEnabled(false);

        chkImitacion2.setText("Opcion 5");
        chkImitacion2.setEnabled(false);

        chkImitacion3.setText("Opcion 6");
        chkImitacion3.setEnabled(false);

        txtImitacion.setEnabled(false);

        cbImitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2", "item3", "item4" }));
        cbImitacion.setEnabled(false);

        spnImitacion.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbOriginal1)
                        .addGap(18, 18, 18)
                        .addComponent(chkOriginal1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbOriginal2)
                        .addGap(18, 18, 18)
                        .addComponent(chkOriginal2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbOriginal3)
                        .addGap(18, 18, 18)
                        .addComponent(chkOriginal3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spnOriginal)
                    .addComponent(cbOriginal, 0, 93, Short.MAX_VALUE)
                    .addComponent(txtOriginal))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbImitacion1)
                        .addGap(18, 18, 18)
                        .addComponent(chkImitacion1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbImitacion2)
                        .addGap(18, 18, 18)
                        .addComponent(chkImitacion2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbImitacion3)
                        .addGap(18, 18, 18)
                        .addComponent(chkImitacion3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtImitacion)
                    .addComponent(cbImitacion, 0, 94, Short.MAX_VALUE)
                    .addComponent(spnImitacion))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdbOriginal1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkOriginal1)
                        .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbOriginal2)
                    .addComponent(chkOriginal2)
                    .addComponent(cbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbOriginal3)
                    .addComponent(chkOriginal3)
                    .addComponent(spnOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbImitacion1)
                    .addComponent(chkImitacion1)
                    .addComponent(txtImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbImitacion2)
                    .addComponent(chkImitacion2)
                    .addComponent(cbImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbImitacion3)
                    .addComponent(chkImitacion3)
                    .addComponent(spnImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbOriginal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOriginal1ActionPerformed
        //pasamos la seleccion del RadioButton Original a la Imitacion
        rdbImitacion1.setSelected(true);

    }//GEN-LAST:event_rdbOriginal1ActionPerformed

    private void rdbOriginal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOriginal2ActionPerformed
        //pasamos la seleccion del RadioButton Original a la Imitacion
        rdbImitacion2.setSelected(true);
    }//GEN-LAST:event_rdbOriginal2ActionPerformed

    private void rdbOriginal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOriginal3ActionPerformed
        //pasamos la seleccion del RadioButton Original a la Imitacion
        rdbImitacion3.setSelected(true);
    }//GEN-LAST:event_rdbOriginal3ActionPerformed

    private void chkOriginal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOriginal1ActionPerformed
        //pasamos la seleccion del CheckBox Original a la Imitacion
        chkImitacion1.setSelected(chkOriginal1.isSelected());
    }//GEN-LAST:event_chkOriginal1ActionPerformed

    private void chkOriginal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOriginal2ActionPerformed
        //pasamos la seleccion del CheckBox Original a la Imitacion
        chkImitacion2.setSelected(chkOriginal2.isSelected());
    }//GEN-LAST:event_chkOriginal2ActionPerformed

    private void chkOriginal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOriginal3ActionPerformed
        //pasamos la seleccion del CheckBox Original a la Imitacion
        chkImitacion3.setSelected(chkOriginal3.isSelected());
    }//GEN-LAST:event_chkOriginal3ActionPerformed

    private void txtOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOriginalActionPerformed

    }//GEN-LAST:event_txtOriginalActionPerformed

    private void cbOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOriginalActionPerformed
        //pasamos los Items seleccionados en el ComboBox Original a la Imitacion
        cbImitacion.setSelectedIndex(cbOriginal.getSelectedIndex());
    }//GEN-LAST:event_cbOriginalActionPerformed

    private void spnOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnOriginalStateChanged
        //pasamos el Valor seleccionado en el Spinner Original a la Imitacion
        spnImitacion.setValue((Integer) spnOriginal.getValue());
    }//GEN-LAST:event_spnOriginalStateChanged

    private void txtOriginalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyTyped
        //pasamos el valor del JTextField Original a la Imitacion
        txtImitacion.setText(txtOriginal.getText());
    }//GEN-LAST:event_txtOriginalKeyTyped

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbImitacion;
    private javax.swing.JComboBox<String> cbOriginal;
    private javax.swing.JCheckBox chkImitacion1;
    private javax.swing.JCheckBox chkImitacion2;
    private javax.swing.JCheckBox chkImitacion3;
    private javax.swing.JCheckBox chkOriginal1;
    private javax.swing.JCheckBox chkOriginal2;
    private javax.swing.JCheckBox chkOriginal3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdbImitacion1;
    private javax.swing.JRadioButton rdbImitacion2;
    private javax.swing.JRadioButton rdbImitacion3;
    private javax.swing.JRadioButton rdbOriginal1;
    private javax.swing.JRadioButton rdbOriginal2;
    private javax.swing.JRadioButton rdbOriginal3;
    private javax.swing.JSpinner spnImitacion;
    private javax.swing.JSpinner spnOriginal;
    private javax.swing.JTextField txtImitacion;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}
