/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokimons;

//import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Entrenador1 extends javax.swing.JFrame {
     Pokemon mipokemon = new Pokemon("Groudon");
     Pokemonrival rival = new Pokemonrival("Sceptile");
     int cont=0;
     
   
    public Entrenador1() {
        initComponents();
        setLocationRelativeTo(null);//codigo para poner en el medio
        setResizable(false);
        /*AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Cancion.wav"));
        Sound.play();*/
        vida1.setText(mipokemon.MostrarEstado());  //muestra en el frame la vida
        vida2.setText(rival.MostrarEstado());
        nivel1.setText(mipokemon.Nivel());
        jLabel7.setText(mipokemon.Nivel());
      
        
        
        
        
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
        posion1 = new javax.swing.JToggleButton();
        posion2 = new javax.swing.JToggleButton();
        posion3 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jbrendirse = new javax.swing.JToggleButton();
        txt1 = new javax.swing.JTextField();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        nivel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jl123456 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BATALLA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 11, 258, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/misty_opt.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 104, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groudon_1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

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

        Area1.setEditable(false);
        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 350, 170));

        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 71, 80, 18));

        posion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion1ActionPerformed(evt);
            }
        });
        getContentPane().add(posion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 316, 50, 51));

        posion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion2ActionPerformed(evt);
            }
        });
        getContentPane().add(posion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 316, 51, 51));

        posion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Poción_opt.png"))); // NOI18N
        posion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posion3ActionPerformed(evt);
            }
        });
        getContentPane().add(posion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 316, 50, 51));

        jToggleButton1.setText("SALIR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jbrendirse.setText("RENDIRSE");
        jbrendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrendirseActionPerformed(evt);
            }
        });
        getContentPane().add(jbrendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        txt1.setEditable(false);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 98, -1));

        vida1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 20));

        vida2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 216, 130, 20));

        nivel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 74, 80, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 74, 100, 20));

        jl123456.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jl123456, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
void AnalizarSituacion() {
        if (mipokemon.vida == 0) {
            Area1.append(txt1.getText() 
                    + " ya no puede continuar. "
                    + rival.nombre + " gana."+"\n");
            
            jb1.setEnabled(false);
            jbrendirse.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
        
        else if (rival.vida == 0) {
            Area1.append(rival.nombre 
                    + " ya no puede continuar. "
                    + txt1.getText() + " gana."+"\n");
            
            jb1.setEnabled(false);
            jbrendirse.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
        }
    }
       
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
       mipokemon.nombre=txt1.getText();   //recibe el sobrenombre 
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
        
        
    }//GEN-LAST:event_jb1ActionPerformed
      // int Mipocion=0;
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

    private void jbrendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrendirseActionPerformed
        if(jbrendirse.isSelected()){
            JOptionPane.showMessageDialog(null, jlb1.getText()+" se ha rendido.");
            jb1.setEnabled(false);
            posion1.setEnabled(false);
            posion2.setEnabled(false);
            posion3.setEnabled(false);
            //4
        }
        
    }//GEN-LAST:event_jbrendirseActionPerformed

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
              
        /*String h = "";
        if(posion2.isSelected()){
            mostrar=txt1.getText()+" ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(mostrar);
              posion2.setBackground(new Color(255,251,32));
              posion2.setVisible(false);
        }*/
    }//GEN-LAST:event_posion2ActionPerformed

    private void posion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posion3ActionPerformed
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
            
              posion3.setBackground(new Color(255,251,32));
              posion3.setVisible(false);
              
              
              AnalizarSituacion();
        
        /*String b = "";
        if(posion3.isSelected()){
            mostrar=txt1.getText()+" ha usado posion y su vida aumento en : "+mipokemon.usarHp()+"\n";
            Area1.append(mostrar);
              posion3.setBackground(new Color(255,251,32));
              posion3.setVisible(false);
        }*/
    }//GEN-LAST:event_posion3ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        
    }//GEN-LAST:event_txt1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
           
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
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jb1;
    private javax.swing.JToggleButton jbrendirse;
    private javax.swing.JLabel jl123456;
    public static javax.swing.JLabel jlb1;
    public static javax.swing.JLabel nivel1;
    private javax.swing.JToggleButton posion1;
    private javax.swing.JToggleButton posion2;
    private javax.swing.JToggleButton posion3;
    public static javax.swing.JTextField txt1;
    public static javax.swing.JLabel vida1;
    private static javax.swing.JLabel vida2;
    // End of variables declaration//GEN-END:variables

    void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
