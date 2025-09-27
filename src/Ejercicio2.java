
import java.util.Scanner;
public class Ejercicio2 {

public static void main(String[] args) {
    // creo un scanner para que lea por teclado
    Scanner scanner = new Scanner(System.in);
    //pregunto cada nota y defino cada variable
    System.out.print("Ingrese la primera nota: ");
    double a = scanner.nextDouble();
    System.out.print("Ingrese la segunda nota: ");
    double b = scanner.nextDouble();
    System.out.print("Ingrese la tercera nota: ");
    double c = scanner.nextDouble();
    // este if lo hice para la condicion
    // si la nota es mayor a diez no sirve 
    if (a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10) {
        System.out.println("Nota invalida");
    } else {
        //saco el promedio
        double promedio = (a + b + c) / 3;
        System.out.printf("Promedio: %.2f\n", promedio);
        //dependiendo del promedio anterior le digo al estudiante por pantalla si fue promocionadp, regular o reprobado
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
    }
    scanner.close();
}
}


    

