/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Se imprime la creacion del instrumento
 * @author jopl1
 */
public class PooP8V3 {
    public static void main(String[] args){
        System.out.println("********* Act 4 **********");
        ///No se puede instanciar
        //InstrumentoMusical instrumento = new InstrumentoMusical();
        
        InstrumentoMusical instrumento;
        
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstumento());
        System.out.println(instrumento);
    }
    
}
