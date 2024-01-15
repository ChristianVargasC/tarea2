
package ejemplos;

import java.util.Scanner;

public class tarea2 {

   public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String titular;
        int dni;
        double totalapagar;
        System.out.println("Ingrese el nombre del titular: ");
        titular=lector.nextLine();
        System.out.println("Ingrese numero de DNI: ");
        dni=lector.nextInt();
        System.out.println("Ingrese total a pagar: ");
        totalapagar=lector.nextDouble();
       

        System.out.println("##############################");
        System.out.printf("%23S\n", "TICKET PARA PAGO");
        System.out.println("##############################");
        System.out.printf("%-15S\n","CODIGO DE USUARIO: 4546567");

        System.out.println("Fecha de registro: 14/01/2024\n");
        System.out.printf("Regristrado por:%S\n",titular);
        System.out.println("DNI:" +dni);
        System.out.println("Empresa: Universidad Tecnologica del Perú" );
        System.out.println("Importe:" +totalapagar);
        
        
    }
}

