
package pokimons;

import java.util.Random;

public class Pokemon {
    private String nombre;
    private int nivel;
    private int vida;

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" +nombre + ", nivel=" + nivel + ", vida=" + vida + '}';
    }

    public Pokemon() {
        this.nombre = "";
        this.nivel=5 ;
        this.vida =40+nivel*5;
    }
    public void setNombre(String n) {
        this.nombre = n;
    }
    public void subirNivel() {
        this.nivel = this.nivel + 1;
       
    }
    
    public void recibirDanio(int danio) {
        this.vida = this.vida - danio;
        
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
    
    public void atacar(Pokemon oponente) {
        int danio = (int)((new Random().nextInt(4) + 2));
        oponente.recibirDanio(danio);
    }
    
    
    
    
     
    
}
