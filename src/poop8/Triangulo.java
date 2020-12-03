/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop8;

/**
 *
 * @author Perez León Jesus Omar, Lopez Hernandez Yesenia Sarahi
 */
public class Triangulo extends Poligono{
    private float a,b,c,base,altura;
    private int alpha,beta,gamna;
/**
 * Se crea un constructor vacio
 */
    public Triangulo() {
    }
/**
 * Este constructor tiene 8 parametros
 * @param a Es el cateto a del triangulo
 * @param b Es el cateto b del triangulo
 * @param c Es la hipotenusa del triangulo
 * @param base Es la base del triangulo
 * @param altura Es la altura del triangulo
 * @param alpha Es el angulo A de el triangulo
 * @param beta Es el angulo B del triangulo
 * @param gamna Es el angulo C del triangulo
 */
    public Triangulo(float a, float b, float c, float base,float altura, int alpha, int beta, int gamna) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamna = gamna;
    }
    /**
     * 
     * @return Se crea el cateto a del triangulo
     */

    public float getA() {
        return a;
    }
    /**
     * 
     * @param a Se genera el valor a del triangulo
     */
    public void setA(float a) {
        this.a = a;
    }
    
    /**
     * 
     * @return Se crea el cateto b del triangulo
     */
    public float getB() {
        return b;
    }
    /**
     * 
     * @param b Se genera el valor b del triangulo
     */
    public void setB(float b) {
        this.b = b;
    }
    
    /**
     * 
     * @return Se crea el cateto c del triangulo
     */
    public float getC() {
        return c;
    }
    /**
     * 
     * @param c Se genera el valor c del triangulo
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * 
     * @return Se crea la base del triangulo
     */
    public float getBase() {
        return base;
    }
    /**
     * 
     * @param base Se genera la base del triangulo
     */
    public void setBase(float base) {
        this.base = base;
    }
    
    /**
     * 
     * @return Se crea la altura del triangulo
     */
    public float getAltura() {
        return altura;
    }
    /**
     * 
     * @param altura se genera la altura del traingulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * 
     * @return Se crea el angulo A del triangulo
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * 
     * @param alpha Se genera el angulo A del triangulo
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    /**
     * 
     * @return Se crea el angulo B del triangulo
     */
    public int getBeta() {
        return beta;
    }
    /**
     * 
     * @param beta Se genera el angulo B del triangulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * 
     * @return Se crea el angulo C del triangulo
     */
    public int getGamna() {
        return gamna;
    }
    /**
     * 
     * @param gamna Se genera el angulo C del triangulo
     */
    public void setGamna(int gamna) {
        this.gamna = gamna;
    }
    /**
     * 
     * @return Se imprimen los datos del triangulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha="+ alpha + ", beta=" + beta + ", gamna=" + gamna + '}';
    }
}
