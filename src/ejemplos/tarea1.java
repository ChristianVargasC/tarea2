
package ejemplos;

import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args){
    int dias,DTotal,Ddiaria;
    int Vluz = 299792458;
    Scanner Lector=new Scanner(System.in);
    System.out.print("ingrese numero de dias");
    dias=Lector.nextInt();
    Ddiaria=86400*Vluz;
    DTotal=Ddiaria*dias;
            
    System.out.println("La distancia que recorre es de: " + DTotal + "m/s");
    
    
    
}
    }
