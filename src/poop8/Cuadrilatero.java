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

public class Cuadrilatero extends Poligono {
    private int alpha,beta;
    private float a, b, base, altura;
    /**
     * Generamos el cuadrilatero
     */
    public Cuadrilatero() {
    }
    /**
     * 
     * @param alpha es de tipo int
     * @param beta es de tipo int
     * @param a Es un lado a del cuadrilatero
     * @param b Es un lado b del cuadrilatero
     * @param base Es el valor de la base del cuadrilatero
     * @param altura Es el valor de la altura del cuadrilatero
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return Se crea el valor alpha 
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * 
     * @param alpha Se le asigna un valor a alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * 
     * @return Se crea el valor beta 
     */
    public int getBeta() {
        return beta;
    }
    /**
     * 
     * @param beta Se le asigna valor a beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * 
     * @return Se crea el lado a 
     */
    public float getA() {
        return a;
    }
    /**
     * 
     * @param a Se le asigna un valor a el lado 'a'
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * 
     * @return Se crea el lado b 
     */
    public float getB() {
        return b;
    }
    /**
     * 
     * @param b Se le asigna un valor a el lado 'b'
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * 
     * @return Se crea la base
     */
    public float getBase() {
        return base;
    }
    /**
     * 
     * @param base Se le asigna valor a la base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * 
     * @return Se crea el valor altura 
     */
    public float getAltura() {
        return altura;
    }
    /**
     * @param altura Se le asigna la altura
     * 
     */
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * 
     * @return Se imprime el cuadrilatero y sus valores
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
