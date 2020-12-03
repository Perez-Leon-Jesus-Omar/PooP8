/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop8;

/**
 *
 * @author jopl1
 */
public class PooP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///Act 1 - Las clases base pueden comportarse como sus subclases
        
        Poligono poligono = new Poligono();
        System.out.println("Poligono " + poligono);
        
        
        Object objeto = new Object();
        System.out.println("Object " + objeto);
        
        objeto = poligono;
        System.out.println("Object como poligono " + poligono);
        
                    ///Otras maneras de instanciarlo
        Object objeto2 = poligono;
        System.out.println("Object2 " + objeto2);
        
        Object objeto3 = new Poligono();
        System.out.println("Object3 " + objeto3);
        
        ///Act 2 
        System.out.println("\n********* Act 2 **********");
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println("\n" + poligono);
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println("\n" + poligono);
        selectorPoligonos(poligono);
    }
    
    public static void selectorPoligonos(Poligono poligono){
        if (poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        } else if (poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatro");
        } else if (poligono instanceof Poligono){
            System.out.println("El objeto es un Poligono");
        }else{
            System.out.println("Pollo");
        }
        
    }
    
}
