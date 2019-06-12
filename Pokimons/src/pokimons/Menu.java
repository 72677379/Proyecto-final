/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokimons;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);//codigo para poner en el medio
        setResizable(false); //esto es para no modificar el frame
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        pokemon = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bBatalla = new javax.swing.JButton();
        jbtVaron = new javax.swing.JRadioButton();
        jbtMujer = new javax.swing.JRadioButton();
        pok1 = new javax.swing.JRadioButton();
        pok2 = new javax.swing.JRadioButton();
        pok3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Nombre de usuario : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 21, 220, 36));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 287, 36));

        jLabel8.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Sexo: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 22));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Elegir pokemon : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groudon.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 197, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sceptile.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 201, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suicune.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 200, 180));

        bBatalla.setText("Iniciar Batalla");
        bBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatallaActionPerformed(evt);
            }
        });
        getContentPane().add(bBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 131, 35));

        sexo.add(jbtVaron);
        jbtVaron.setText("Hombre");
        getContentPane().add(jbtVaron, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        sexo.add(jbtMujer);
        jbtMujer.setText("Mujer");
        jbtMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMujerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        pokemon.add(pok1);
        pok1.setText("Groudon");
        pok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pok1ActionPerformed(evt);
            }
        });
        getContentPane().add(pok1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        pokemon.add(pok2);
        pok2.setText("sceptile");
        pok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pok2ActionPerformed(evt);
            }
        });
        getContentPane().add(pok2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        pokemon.add(pok3);
        pok3.setText("suicune");
        getContentPane().add(pok3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pokemon.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatallaActionPerformed
        Entrenador1 entrenador = new Entrenador1();
        Entrenador2 entrenador2 =new Entrenador2();
        Entrenador3 entrenador3 = new Entrenador3();
        Entrenador4 entrenador4 = new Entrenador4();
        Entrenador5 entrenador5 = new Entrenador5();
        Entrenador6 entrenador6 = new Entrenador6();
        
        entrenador.jlb1.setText(txtNombre.getText());
        entrenador3.jlb2.setText(txtNombre.getText());
        entrenador2.jlb3.setText(txtNombre.getText());
        entrenador4.jlb4.setText(txtNombre.getText());
        entrenador5.jlb5.setText(txtNombre.getText());
        entrenador6.jlb6.setText(txtNombre.getText());
        
        //entrenador.txtVaron.setText(txtNombre.getText());
       //String mostrar="";
        if(jbtMujer.isSelected() && pok1.isSelected()){ 
            String a =(JOptionPane.showInputDialog(this,"Desea poner un nombre al pokemon"));
            entrenador.txt1.setText(a);   //obtiene el texto que se inserta en a
            entrenador.setVisible(true);
            
        }else if(jbtMujer.isSelected() && pok2.isSelected()){
            entrenador3.setVisible(true);
        }else if (jbtMujer.isSelected() && pok3.isSelected()){
            entrenador2.setVisible(true);
        }else if (jbtVaron.isSelected() && pok1.isSelected()){
            entrenador4.setVisible(true);
        }else if (jbtVaron.isSelected() && pok2.isSelected()){
           entrenador6.setVisible(true);
        
        }else if(jbtVaron.isSelected() && pok3.isSelected()){
          entrenador5.setVisible(true);
        }
        JOptionPane.showMessageDialog(null, "Bienvenido "+txtNombre.getText() + ":"+"\n" + 
                "soy el profesor Ouk y por la elección de tu primero" +"\n" +
                   "pokemon tendras que luchar contra mi nieto Gary");
        
        
    }//GEN-LAST:event_bBatallaActionPerformed

    private void jbtMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtMujerActionPerformed

    private void pok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pok1ActionPerformed
        if(pok1.isSelected()){
           //String a =(JOptionPane.showInputDialog(this,"Desea poner un nombre al pokemon"));
           
           
           
           
           
        }
    }//GEN-LAST:event_pok1ActionPerformed

    private void pok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pok2ActionPerformed
        
    }//GEN-LAST:event_pok2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jbtMujer;
    private javax.swing.JRadioButton jbtVaron;
    public static javax.swing.JRadioButton pok1;
    private javax.swing.JRadioButton pok2;
    private javax.swing.JRadioButton pok3;
    private javax.swing.ButtonGroup pokemon;
    private javax.swing.ButtonGroup sexo;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
