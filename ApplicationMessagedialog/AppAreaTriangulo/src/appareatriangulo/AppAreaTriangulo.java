
package appareatriangulo;

import entidades.Triangulo;
import java.util.Scanner;

public class AppAreaTriangulo {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Triangulo x,y;
       x=new Triangulo ();
       y = new Triangulo();
       
       System.out.println("Base triangulo x");
       x.base = ler.nextDouble();
       
       System.out.println("altura triangulo x");
       x.altura = ler.nextDouble();
       
       System.out.println("base do triangulo y");
       y.base = ler.nextDouble();
       
       System.out.println("altura do triangulo y");
       y.altura = ler.nextDouble();
       
       double areax = x.areaTriangulo();
       double areay = y.areaTriangulo();
       System.out.printf("área x = %.2f%n", areax);
       System.out.printf("área y = %.2f%n",  areay);
       
       if (areax > areay){
           System.out.println("maior area y");
       }
       else{
           System.out.println("maior area x");
       }
       
               
            
       ler.close();
    }
    
}
