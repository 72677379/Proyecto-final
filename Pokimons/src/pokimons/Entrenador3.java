/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokimons;

//import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.JOptionPane;
import static pokimons.Entrenador1.jLabel7;
import static pokimons.Entrenador1.nivel1;
import static pokimons.Entrenador1.txt1;
import static pokimons.Entrenador1.vida1;
import static pokimons.Entrenador2.jlb3;

/**
 *
 * @author alumno
 */
public class Entrenador3 extends javax.swing.JFrame {
    Pokemon mipokemon = new Pokemon("Sceptile");
    Pokemonrival rival = new Pokemonrival("Suicune");
    int cont =0;
    /**
     * Creates new form Entrenador3
     */
    public Entrenador3() {
        initComponents();
        setLocationRelativeTo(null);//codigo para poner en el medio
        setResizable(false);
        vida1.setText(mipokemon.MostrarEstado());  //muestra en el frame la vida
        vida2.setText(rival.MostrarEstado());
        nivel1.setText(mipokemon.Nivel());
        nivel2.setText(mipokemon.Nivel());
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbatacar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jlb2 = new javax.swing.JLabel();
        jbrendirse = new javax.swing.JToggleButton();
        txt2 = new javax.swing.JTextField();
        posion3 = new javax.swing.JToggleButton();
        posion2 = new javax.swing.JToggleButton();
        posion1 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        nivel1 = new javax.swing.JLabel();
        nivel2 = new javax.swing.JLabel();
        INICIO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BATALLA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sceptile_1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Chiller", 0, 110)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VS.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 133, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suicune_1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 99, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gary_opt.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 90, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/misty_opt.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 90, 110, -1));

        jbatacar.setText("ATACAR");
        jbatacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbatacarActionPerformed(evt);
            }
        });
        getContentPane().add(jbatacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        Area1.setEditable(false);
        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 350, 160));

        jlb2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 60, 100, 24));

        jbrendirse.setText("RENDIRSE");
        jbrendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrendirseActionPerformed(evt);
            }
        });
        getContentPane().add(jbrendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        txt2.setEditable(false);
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, -1));

        posion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion3ActionPerformed(evt);
            }
        });
        getContentPane().add(posion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 51, 51));

        posion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion2ActionPerformed(evt);
            }
        });
        getContentPane().add(posion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 51, 51));

        posion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion1ActionPerformed(evt);
            }
        });
        getContentPane().add(posion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, 51));

        jToggleButton1.setText("SALIR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        vida1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 20));

        vida2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, 20));
        getContentPane().add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 80, 30));
        getContentPane().add(nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 70, 30));

        INICIO.setText("INICIO");
        INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIOActionPerformed(evt);
            }
        });
        getContentPane().add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 80, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jLabel2.setText("INICIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void AnalizarSituacion(){
        if (mipokemon.vida == 0) {
            Area1.append(mipokemon.nombre 
                    + " ya no puede continuar. "
                    + rival.nombre + " gana."+"\n");
            
            jbatacar.setEnabled(false);
            jbrendirse.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
        
        else if (rival.vida == 0) {
            Area1.append(rival.nombre 
                    + " ya no puede continuar. "
                    + mipokemon.nombre + " gana."+"\n");
            
            jbatacar.setEnabled(false);
            jbrendirse.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
    
}
    private void jbatacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbatacarActionPerformed
        mipokemon.nombre=txt2.getText();   //recibe el sobrenombre 
       String resultado = mipokemon.Atacar(rival); //pokemon ataca rival
       Area1.append(resultado+ "\n");
        
        int pos = (int)(Math.random()*100);
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
        
        
        
        vida1.setText(mipokemon.MostrarEstado());
        vida2.setText(rival.MostrarEstado());
        
        
        AnalizarSituacion();
    }//GEN-LAST:event_jbatacarActionPerformed
    //int Mipocion=0;
    //int cont=0;
    private void posion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion1ActionPerformed
        String mostrar = mipokemon.UsarPocion(mipokemon);
        Area1.append(mostrar + "\n");
        vida1.setText(mipokemon.MostrarEstado());
        posion1.setEnabled(false); 
        
        
        
        
            
              posion1.setBackground(new Color(255,251,32));
              posion1.setVisible(false);
              
              
              AnalizarSituacion();
        
        
    }//GEN-LAST:event_posion1ActionPerformed

    private void posion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion2ActionPerformed
        String mostrar = mipokemon.UsarPocion(mipokemon);
        Area1.append(mostrar + "\n");
        vida1.setText(mipokemon.MostrarEstado());
        posion2.setEnabled(false); 
        
        
        
        
              posion2.setBackground(new Color(255,251,32));
              posion2.setVisible(false);
              
              
              AnalizarSituacion();
        
        
    }//GEN-LAST:event_posion2ActionPerformed

    private void posion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion3ActionPerformed
        String mostrar = mipokemon.UsarPocion(mipokemon);
        Area1.append(mostrar + "\n");
        vida1.setText(mipokemon.MostrarEstado());
        posion3.setEnabled(false); 
        
        
        
        
            
              posion3.setBackground(new Color(255,251,32));
              posion3.setVisible(false);
              
              
              AnalizarSituacion();
        
       
    }//GEN-LAST:event_posion3ActionPerformed

    private void jbrendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrendirseActionPerformed
        if (jbrendirse.isSelected()){
            JOptionPane.showMessageDialog(null, jlb3.getText()+" se ha rendido.");
            jbatacar.setVisible(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
    }//GEN-LAST:event_jbrendirseActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIOActionPerformed
       Menu menu =new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_INICIOActionPerformed

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
            java.util.logging.Logger.getLogger(Entrenador3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrenador3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrenador3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrenador3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrenador3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    public static javax.swing.JButton INICIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbatacar;
    private javax.swing.JToggleButton jbrendirse;
    public static javax.swing.JLabel jlb2;
    public static javax.swing.JLabel nivel1;
    public static javax.swing.JLabel nivel2;
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
