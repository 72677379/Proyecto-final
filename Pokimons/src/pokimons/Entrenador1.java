/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokimons;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Entrenador1 extends javax.swing.JFrame {
     Pokemon mipokemon = new Pokemon("Groudon");
     Pokemon rival = new Pokemon("Sceptile");
     
   
    public Entrenador1() {
        initComponents();
        setLocationRelativeTo(null);//codigo para poner en el medio
        setResizable(false);      
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jlb1 = new javax.swing.JLabel();
        jt1 = new javax.swing.JToggleButton();
        jt2 = new javax.swing.JToggleButton();
        jt3 = new javax.swing.JToggleButton();
        jbrendirse = new javax.swing.JToggleButton();
        txt1 = new javax.swing.JTextField();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BATALLA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 11, 258, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/misty_opt.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 104, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groudon_1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 125, -1, -1));

        jLabel4.setFont(new java.awt.Font("Chiller", 0, 120)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VS.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 122));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sceptile_1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 106, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gary_opt.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 106, -1, -1));

        jb1.setText("ATACAR");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 350, 170));

        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 71, 80, 18));

        jt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        jt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt1ActionPerformed(evt);
            }
        });
        getContentPane().add(jt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 316, 47, 51));

        jt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        jt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt2ActionPerformed(evt);
            }
        });
        getContentPane().add(jt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 316, 51, 51));

        jt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        jt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt3ActionPerformed(evt);
            }
        });
        getContentPane().add(jt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 316, 50, 51));

        jbrendirse.setText("RENDIRSE");
        jbrendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrendirseActionPerformed(evt);
            }
        });
        getContentPane().add(jbrendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 97, 98, -1));

        vida1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 106, 25));

        vida2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 216, 111, 27));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
void AnalizarSituacion() {
        if (mipokemon.vida == 0) {
            Area1.append(mipokemon.nombre 
                    + " ya no puede continuar. "
                    + rival.nombre + " gana."+"\n");
            
            jb1.setEnabled(false);
        }
        
        else if (rival.vida == 0) {
            Area1.append(rival.nombre 
                    + " ya no puede continuar. "
                    + mipokemon.nombre + " gana."+"\n");
            
            jb1.setEnabled(false);
        }
    }
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
       double r1 = Math.random();
        double r2 = Math.random();
        
        if (r1 > r2) {
            String resultado = mipokemon.Atacar(rival);       
            Area1.append(resultado + "\n");

            String resultado2 = rival.Atacar(mipokemon);
            Area1.append(resultado2 + "\n");
        }
        else {
            String resultado2 = rival.Atacar(mipokemon);
            Area1.append(resultado2 + "\n");
            
            String resultado = mipokemon.Atacar(rival);       
            Area1.append(resultado + "\n");            
        }
        
        vida1.setText(mipokemon.MostrarEstado());
        vida2.setText(rival.MostrarEstado());
        
        AnalizarSituacion();
    }//GEN-LAST:event_jb1ActionPerformed

    private void jt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt1ActionPerformed
        String mostrar = "";
        if(jt1.isSelected()){
            mostrar=txt1.getText()+"ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(mostrar);
              jt1.setBackground(new Color(255,251,32));
              jt1.setVisible(false);
              
              
        }
    }//GEN-LAST:event_jt1ActionPerformed

    private void jbrendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrendirseActionPerformed
        if(jbrendirse.isSelected()){
            JOptionPane.showMessageDialog(null, jlb1.getText()+" se ha rendido.");
            jb1.setVisible(false);
        }
    }//GEN-LAST:event_jbrendirseActionPerformed

    private void jt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt2ActionPerformed
        String mostrar = "";
        if(jt2.isSelected()){
            mostrar=txt1.getText()+"ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(mostrar);
              jt2.setBackground(new Color(255,251,32));
              jt2.setVisible(false);
        }
    }//GEN-LAST:event_jt2ActionPerformed

    private void jt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt3ActionPerformed
        String mostrar = "";
        if(jt3.isSelected()){
            mostrar=txt1.getText()+"ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(mostrar);
              jt3.setBackground(new Color(255,251,32));
              jt3.setVisible(false);
        }
    }//GEN-LAST:event_jt3ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed
    
           
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
            java.util.logging.Logger.getLogger(Entrenador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrenador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrenador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrenador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrenador1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb1;
    private javax.swing.JToggleButton jbrendirse;
    public static javax.swing.JLabel jlb1;
    private javax.swing.JToggleButton jt1;
    private javax.swing.JToggleButton jt2;
    private javax.swing.JToggleButton jt3;
    private javax.swing.JTextField txt1;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    // End of variables declaration//GEN-END:variables
}
