/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokimons;

import javax.swing.JOptionPane;
import static pokimons.Menu.batalla;
import static pokimons.Menu.jbtMujer;
import static pokimons.Menu.jbtVaron;
import static pokimons.Menu.pok1;
import static pokimons.Menu.pok2;
import static pokimons.Menu.pok3;
import static pokimons.Menu.txtNombre;

/**
 *
 * @author Usuario
 */
public class ElegirNombre extends javax.swing.JFrame {

    /**
     * Creates new form ElegirNombre
     */
    public ElegirNombre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JTextField();
        jlbtexto = new javax.swing.JLabel();
        jbno = new javax.swing.JToggleButton();
        jbsi = new javax.swing.JToggleButton();
        batalla = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        jlbtexto.setText("!Desea Cambiar nombre¡");

        jbno.setText("NO");
        jbno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnoActionPerformed(evt);
            }
        });

        jbsi.setText("SI");
        jbsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsiActionPerformed(evt);
            }
        });

        batalla.setText("Iniciar Batalla");
        batalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jlbtexto)
                .addGap(18, 18, 18)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jbno)
                .addGap(88, 88, 88)
                .addComponent(jbsi)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(batalla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtexto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbno)
                    .addComponent(jbsi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(batalla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        if(jbsi.isSelected()){
            texto.setEditable(true);
            
        }
        else{
            texto.setEditable(false);
            texto.setVisible(false);
        }
    }//GEN-LAST:event_textoActionPerformed

    private void jbnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnoActionPerformed
        if(jbno.isSelected()){
            //jbsi.setEnabled(false);
            texto.setEditable(false);
            
        }
    }//GEN-LAST:event_jbnoActionPerformed

    private void jbsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsiActionPerformed
         if(jbsi.isSelected()){
             texto.setEditable(true);
             
             
         }
        
    }//GEN-LAST:event_jbsiActionPerformed

    private void batallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batallaActionPerformed
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
       //String a =(JOptionPane.showInputDialog(this,"Desea poner un nombre al pokemon"));
       
       
        
       if(jbtMujer.isSelected() && pok1.isSelected()){
           entrenador.setVisible(true);
          
            //entrenador.txt1.setText(a);   //obtiene el texto que se inserta en a            
            
            
        }else if(jbtMujer.isSelected() && pok2.isSelected()){   
            entrenador3.setVisible(true);
            //entrenador3.txt2.setText(a);
            
            
            
        }else if (jbtMujer.isSelected() && pok3.isSelected()){
            entrenador2.setVisible(true);
            //entrenador2.txt2.setText(a);
            
            
            
        }else if (jbtVaron.isSelected() && pok1.isSelected()){
            entrenador4.setVisible(true);
            //entrenador4.txt2.setText(a);
            
            
            
        }else if (jbtVaron.isSelected() && pok2.isSelected()){
            entrenador5.setVisible(true);
            //entrenador6.txt2.setText(a);
            
            
            
        }else if(jbtVaron.isSelected() && pok3.isSelected()){
            entrenador6.setVisible(true);
            //entrenador5.txt2.setText(a);*/
            
        }
    }//GEN-LAST:event_batallaActionPerformed

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
            java.util.logging.Logger.getLogger(ElegirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElegirNombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton batalla;
    private javax.swing.JToggleButton jbno;
    private javax.swing.JToggleButton jbsi;
    private javax.swing.JLabel jlbtexto;
    public static javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables

    private Menu Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      


}
