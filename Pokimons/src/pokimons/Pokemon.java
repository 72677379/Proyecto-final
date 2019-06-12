
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
   
    String MostrarEstado() {
        String estado = /*this.nombre + " / " +*/ "Vida : "+this.vida
                + " HP" /*+"\n"+"Nivel : "+ this.nivel + " / "*/;
        return estado;
    }
    public String Atacar(Pokemon contrincante) {
        String resultado = "";
        
        int ataque = (int)((new Random().nextInt(5))+5);        
        int critico = (int) (Math.random() * 100);
        int probabilidad =(int) (Math.random() * 100);
       contrincante.vida = contrincante.vida - ataque;
       
       if (critico <= 20){
            ataque = (int)(ataque*2);
        }
        else if (probabilidad <= 15){
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
    public String UsarPocion(Pokemon contrincante){
        String resultado = "";
        contrincante.vida = contrincante.vida + 15;
        resultado = contrincante.nombre + " uso una poción";
        return resultado;
    }
    public int usarHp(){
      return ((vida*25)/100);
      
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int gethPotions() {
        return hPotions;
    }

    public void sethPotions(int hPotions) {
        this.hPotions = hPotions;
    }
    
    
     
     
    
}
