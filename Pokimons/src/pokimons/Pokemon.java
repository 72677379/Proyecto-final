
package pokimons;

import java.util.Random;

public class Pokemon {
     public String nombre;
     protected int nivel;
     public int vida;
     public int hPotions;
    
    Pokemon(String nombre){
       this.nombre=nombre;
       this.nivel=5;
       this.vida=40+nivel*5;
    }
   
    public String MostrarEstado() {
        String estado = /*this.nombre + " / " +*/ "Vida : "+this.vida
                + " HP" /*+"\n"+"Nivel : "+ this.nivel + " / "*/;
        return estado;
    }
    public String Nivel(){
      String niv="NIVEL : " +this.nivel;
      return niv;
    }
    public String Atacar(Pokemon contrincante) {
        String resultado = "";
        
        int ataque = (int)(Math.random()*5 + 5);        
        int critico = (int) (Math.random() * 100);
        int probabilidad =(int) (Math.random() * 100);
       
       
       if (critico <= 20){
            ataque = (int)(ataque*2);
        }
       else if  (probabilidad <= 15){
            ataque = 0;
        }
        
        contrincante.vida = contrincante.vida - ataque;
        
        if (contrincante.vida < 0) {
            contrincante.vida = 0;
        }
        
        if (critico <= 20) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        }
        else if (probabilidad <= 15){
            resultado = contrincante.nombre + " esquivo el ataque.";
        }
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado; 
}
    public String UsarPocion(Pokemon rival){
        String hp = "";
        int HP = this.vida + 15;
        rival.vida =  HP;
        hp = rival.nombre + " ha usado poción, su vida aumenta a " + HP;
        return hp;
    
    /*String resultado = "";
        contrincante.vida = contrincante.vida + 15;
        resultado = contrincante.nombre + " uso una poción";
        return resultado;*/
    }
    public String usarHprival(Pokemon contrin){
      String hp="";
      int HP =this.vida+25;
      contrin.vida=HP;
         return null;
     
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    boolean setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean setVida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
     
    
}
