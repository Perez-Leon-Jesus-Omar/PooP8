/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Se genera una nueva clase
 * @author jopl1
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    /**
     * Se crea el instrumento
     */
    public InstrumentoViento() {
    }

    /**
     * Se imprime la funcion tocar
     */
    @Override
    public void tocar(){
        System.out.println("Estoy tocando el instrumento de viento");
    }
    /**
     * Se imprime la funcion afinar
     */
    @Override
    public void afinar(){
        System.out.println("Estoy afinano el instrumento de viento");
    }
    /**
     * 
     * @return se imprime el tipo de instrumento
     */
    @Override
    public String tipoInstumento(){
        return "Instrumento de Viento";
    }
    /**
     * 
     * @return Se imprime la clase
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
