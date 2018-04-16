/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Pratica32 {
    
    public static double densidade(double x, double media, double desvio){
        
            double d = (1/Math.sqrt(2*Math.PI*desvio))*(Math.pow(Math.E,((-0.5)*((x-media)/desvio)*(x-media)/desvio)));
            return d;
         }
    
    public static void main(String[] args){
        
        double d2;
        
        d2 = densidade(-1,67,3);
        
        System.out.println(d2);
    }    
}
