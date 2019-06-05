
package pokimons;

import java.util.Random;

public class Pokemon {
     String nombre;
     int nivel;
     int vida;
    
    Pokemon(String nombre){
       this.nombre=nombre;
       this.nivel=5;
       this.vida=40+nivel*5;
    }
   
    String MostrarEstado() {
        String estado = this.nombre + " / " + this.vida 
                + " HP" + this.nivel + " / ";
        return estado;
    }
    String Atacar(Pokemon contrincante) {
        String resultado = "";
        
        int ataque = (int)((new Random().nextInt(5))+5);        
        int critico = (int) (Math.random() * 100);
       contrincante.vida = contrincante.vida - ataque;
        
        if (contrincante.vida < 0) {
            contrincante.vida = 0;
        }
        
        if (critico <= 10) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        }
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado;
    
}
     
     
    
}
