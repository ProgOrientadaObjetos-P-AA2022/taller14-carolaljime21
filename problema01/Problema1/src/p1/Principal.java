package p1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Enlace e = new Enlace();
        Scanner entrada = new Scanner(System.in);
        double continuar;
        
        do {
            
            System.out.println("DATOS TRABAJADOR");
            System.out.println("Cedula de identidad: ");
            String id = entrada.nextLine();
            System.out.println("Nombre del trabajador: ");
            String nom = entrada.nextLine();
            System.out.println("Correo del trabajador: ");
            String correo = entrada.nextLine();
            System.out.println("Sueldo del trabajador: ");
            double suel = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Mes del sueldo del trabajador:");
            String mes = entrada.nextLine();

            Sueldos trabajador = new Sueldos(id, nom, correo,
                    suel, mes);
            e.insertarTrabajador(trabajador);
            System.out.println("¿Desea ingresar otro trabajador?"
                    + "\n 1. SI"
                    + "\n 2. NO");
            continuar = entrada.nextDouble();
            entrada.nextLine();
        } while (continuar != 2);
    }

}
