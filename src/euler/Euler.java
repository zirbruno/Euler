/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;


public class Euler{
    public double x0;
    public double xf;
    public double y0;
    public double h;
    public double resultado;
    //constructor del objeto euler
    public Euler(double x0,double xf, double y0,double h,double resultado){
        this.x0=x0;
        this.xf=xf;
        this.y0=y0;
        this.h=h;
        this.resultado=resultado;
    } 
    
    public static Euler Calcular(String fun, double x0,double xf, double y0,double h){
        ExprEvaluator util = new ExprEvaluator();
        EvalEngine engine = util.getEvalEngine();
        
        //asignando valor a y
        String uno="y=";
        String dos= Double.toString(y0);
        //checando que se asigne el valor a y
        IExpr result = util.evaluate(uno+dos);
        System.out.println("y=");
        System.out.println(result.toString());
        
        //asignando valor a x
        String ocho="x=";
        String nueve= Double.toString(x0);
        result = util.evaluate(ocho+nueve);
        System.out.println("x=");
        System.out.println(result.toString());
        
        String tres="+";
        
        String cuatro= "h=";
        String cinco=Double.toString(h);
        result = util.evaluate(cuatro+cinco);
        System.out.println("h=");
        System.out.println(result.toString());
        
        String seis="*(";
        String siete=")";
       
        
       
        String g=dos+tres+cinco+seis+fun+siete;//y+h*(f(x,y))
        System.out.println("g=");
        System.out.println(g);
        result = util.evaluate(dos+tres+cinco+seis+fun+siete);
        Double res=Double.parseDouble(result.toString());
        System.out.printf("%f",res);
        Euler obj=new Euler(x0,xf,y0,h,res);
        return obj;

    }

    Euler() {
        this.x0=0;
        this.xf=0;
        this.y0=0;
        this.h=0;
        this.resultado=0; //To change body of generated methods, choose Tools | Templates.
    }

}
