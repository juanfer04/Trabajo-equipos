import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Notas");

        String nombre;
        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la primera nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Aprobó ");
        } else {
            System.out.println("Reprobó ");
        }

        sc.close();
    }

    }