/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Se crea una clase flauta
 * @author jopl1
 */
public class Flauta extends InstrumentoViento {
    /**
     * Se genera un constructor vacio para generar flauta
     */
    public Flauta() {
    }
    /**
     * Se imprime el tipo de instrumento
     * @return Flauta hereda de Instrumento de viento
     */
    @Override
    public String tipoInstumento(){
        return "Flauta";
    }
    /**
     * 
     * @return Se imprime la creacion de la flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
} 
