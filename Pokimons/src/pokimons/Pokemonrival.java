
package pokimons;

public class Pokemonrival extends Pokemon {
    
    public Pokemonrival(String nombre) {
        super(nombre);
    }
    @Override
    public String MostrarEstado(){
       String estado = this.nombre + " / " + this.vida + " HP";
        return estado;
    }
    @Override
    public String Atacar(Pokemon contrincante){
    String resultado = "";
        
        int ataque = (int)(Math.random()*5 +7);        
        int critico = (int)(Math.random()*100);     
        int probaEsquivar = (int)(Math.random()*100);
        int probaAtacar=(int)(Math.random()*100);
        
        if(critico <= 20){
            ataque = (int)(ataque * 3);
        }
        else if(probaEsquivar <= 20){
            ataque =0;
        }
        if(probaAtacar <= 75){
            ataque = (int)(ataque*1);
    }
        
        contrincante.vida = contrincante.vida - ataque;
        if(contrincante.vida <= 0){
            contrincante.vida = 0;
        }
        
        if (critico <= 20) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        }
        else if (probaEsquivar <= 15){
            resultado = contrincante.nombre
                    + " esquivo el ataque.";
        }
        
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado;
        }

}