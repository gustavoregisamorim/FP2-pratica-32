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
        
            double d = (1.0/(Math.sqrt(2.0*Math.PI)*desvio))* Math.pow(Math.E,(-0.5*Math.pow(((x-media)/desvio),2)));
            return d;
         }
    
    public static void main(String[] args){
        
        double d2;
        
        d2 = densidade(-1.0,67.0,3.0);
        
        System.out.println(d2);
    }    
}
