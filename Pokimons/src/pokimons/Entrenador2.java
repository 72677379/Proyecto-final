/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokimons;

//import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.JOptionPane;
import static pokimons.Entrenador1.vida1;

/**
 *
 * @author alumno
 */
public class Entrenador2 extends javax.swing.JFrame {
    Pokemon mipokemon = new Pokemon("Suicune");
    Pokemon rival = new Pokemon("Groudon");
    /**
     * Creates new form Entrenador2
     */
    public Entrenador2() {
        initComponents();
        setLocationRelativeTo(null);//codigo para poner en el medio
        setResizable(false);
        /*AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Cancion.wav"));
        Sound.play();*/
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jb2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jbrendirse = new javax.swing.JToggleButton();
        txt2 = new javax.swing.JTextField();
        posion1 = new javax.swing.JToggleButton();
        posion2 = new javax.swing.JToggleButton();
        posion3 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BATALLA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 17, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/misty_opt.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 105, 106, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suicune_1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 136, -1, -1));

        jLabel2.setFont(new java.awt.Font("Chiller", 0, 130)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VS.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 111, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groudon_1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 111, -1, -1));

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 340, 160));

        jb2.setText("ATACAR");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gary_opt.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 105, -1, -1));

        jlb3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, 84, 19));

        jbrendirse.setText("RENDIRSE");
        jbrendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrendirseActionPerformed(evt);
            }
        });
        getContentPane().add(jbrendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 105, 100, -1));

        posion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion1ActionPerformed(evt);
            }
        });
        getContentPane().add(posion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 315, 50, 48));

        posion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion2ActionPerformed(evt);
            }
        });
        getContentPane().add(posion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 315, 48, 48));

        posion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion3ActionPerformed(evt);
            }
        });
        getContentPane().add(posion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 315, 50, 48));

        jToggleButton1.setText("SALIR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        vida1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 120, 20));

        vida2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 120, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
void AnalizarSituacion() {
        if (mipokemon.vida == 0) {
            Area1.append(mipokemon.nombre 
                    + " ya no puede continuar. "
                    + rival.nombre + " gana."+"\n");
            
            jb2.setEnabled(false);
            jbrendirse.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
        
        else if (rival.vida == 0) {
            Area1.append(rival.nombre 
                    + " ya no puede continuar. "
                    + mipokemon.nombre + " gana."+"\n");
            
            jb2.setEnabled(false);
            jbrendirse.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
    }
    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
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
        
        vida1.setText(mipokemon.MostrarEstado()+"\n"+"/"+mipokemon.getNombre());
        vida2.setText(rival.MostrarEstado()+"\n"+"/"+rival.getNombre());
        
        AnalizarSituacion();
    }//GEN-LAST:event_jb2ActionPerformed

    private void jbrendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrendirseActionPerformed
        if (jbrendirse.isSelected()){
            JOptionPane.showMessageDialog(null, jlb3.getText()+" se ha rendido.");
            jb2.setVisible(false);
        }
    }//GEN-LAST:event_jbrendirseActionPerformed

    private void posion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion1ActionPerformed
        String mostrar = mipokemon.UsarPocion(mipokemon);
        Area1.append(mostrar + "\n");
        vida1.setText(mipokemon.MostrarEstado());
        posion1.setEnabled(false); 
        
        
        
        /*int pos = (int)(Math.random()*100);
        if (cont < 3){
            if (pos < 25 && rival.vida <= 40){
                String resultado2 = rival.UsarPocion(rival);
                Area1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            else{
                String resultado2 = rival.Atacar(mipokemon);
                Area1.append(resultado2 + "\n");
            }
        }
        else {
            String resultado2 = rival.Atacar(mipokemon);
            Area1.append(resultado2 + "\n");
        }
        */
        //vida1.setText(mipokemon.MostrarEstado()+"\n"+"/"+mipokemon.getNombre());
        //vida2.setText(rival.MostrarEstado()+"\n"+"/"+rival.getNombre());
            
              posion1.setBackground(new Color(255,251,32));
              posion1.setVisible(false);
              
              
              AnalizarSituacion();
        
        /*String most = "";
        if(posion1.isSelected()){
            mostrar=txt1.getText()+" ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(most);
              posion1.setBackground(new Color(255,251,32));
              posion1.setVisible(false);
        }*/
    }//GEN-LAST:event_posion1ActionPerformed

    private void posion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion2ActionPerformed
        String mostrar = mipokemon.UsarPocion(mipokemon);
        Area1.append(mostrar + "\n");
        vida1.setText(mipokemon.MostrarEstado());
        posion2.setEnabled(false); 
        
        
        
        /*int pos = (int)(Math.random()*100);
        if (cont < 3){
            if (pos < 25 && rival.vida <= 40){
                String resultado2 = rival.UsarPocion(rival);
                Area1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            else{
                String resultado2 = rival.Atacar(mipokemon);
                Area1.append(resultado2 + "\n");
            }
        }
        else {
            String resultado2 = rival.Atacar(mipokemon);
            Area1.append(resultado2 + "\n");
        }
        */
        //vida1.setText(mipokemon.MostrarEstado()+"\n"+"/"+mipokemon.getNombre());
        //vida2.setText(rival.MostrarEstado()+"\n"+"/"+rival.getNombre());
            
              posion2.setBackground(new Color(255,251,32));
              posion2.setVisible(false);
              
              
              AnalizarSituacion();
        
        /*String most = "";
        if(posion1.isSelected()){
            mostrar=txt1.getText()+" ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(most);
              posion1.setBackground(new Color(255,251,32));
              posion1.setVisible(false);
        }*/
    }//GEN-LAST:event_posion2ActionPerformed
        //int Mipocion=0;
        //int cont=0;
    private void posion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion3ActionPerformed
        String mostrar = mipokemon.UsarPocion(mipokemon);
        Area1.append(mostrar + "\n");
        vida1.setText(mipokemon.MostrarEstado());
        posion3.setEnabled(false); 
        
        
        
        /*int pos = (int)(Math.random()*100);
        if (cont < 3){
            if (pos < 25 && rival.vida <= 40){
                String resultado2 = rival.UsarPocion(rival);
                Area1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            else{
                String resultado2 = rival.Atacar(mipokemon);
                Area1.append(resultado2 + "\n");
            }
        }
        else {
            String resultado2 = rival.Atacar(mipokemon);
            Area1.append(resultado2 + "\n");
        }
        */
        //vida1.setText(mipokemon.MostrarEstado()+"\n"+"/"+mipokemon.getNombre());
        //vida2.setText(rival.MostrarEstado()+"\n"+"/"+rival.getNombre());
            
              posion3.setBackground(new Color(255,251,32));
              posion3.setVisible(false);
              
              
              AnalizarSituacion();
        
        /*String most = "";
        if(posion1.isSelected()){
            mostrar=txt1.getText()+" ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(most);
              posion1.setBackground(new Color(255,251,32));
              posion1.setVisible(false);
        }*/
    }//GEN-LAST:event_posion3ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Entrenador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrenador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrenador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrenador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrenador2().setVisible(true);
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jb2;
    private javax.swing.JToggleButton jbrendirse;
    public static javax.swing.JLabel jlb3;
    private javax.swing.JToggleButton posion1;
    private javax.swing.JToggleButton posion2;
    private javax.swing.JToggleButton posion3;
    public static javax.swing.JTextField txt2;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    // End of variables declaration//GEN-END:variables

    void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
