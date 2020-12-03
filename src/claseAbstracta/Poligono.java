/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Se dublica la clase poligono el cual vimos en el primer paquete
 * @author jopl1
 */
public abstract class Poligono {
    /**
     * 
     * @return Al ser clase abstracta regresa lo mismo que el primer paquete
     */
    public abstract float area();
    /**
     * 
     * @return Al ser clase abstracta regresa lo mismo que el primer paquete
     */
    public abstract float perimetro();
    /**
     * 
     * @return Esta clase no tiene valores por lo cual regresa la creacion del poligono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    } 
}
