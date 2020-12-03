/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Se crea la interface 
 * @author jopl1
 */
public interface InstrumentoMusical {
    
    //Por defecto todos los metodos son public y abstract
    void tocar();
    void afinar();
    String tipoInstumento();
    
}
