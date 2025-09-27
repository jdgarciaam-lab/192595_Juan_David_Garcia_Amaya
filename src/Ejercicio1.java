import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creo un scanner para leer por teclado
        Scanner scanner = new Scanner(System.in);
        //pido el valor del numero x, el del numero y para que lo pregunte y la persona lo copie por teclado
        System.out.print("Ingrese el valor del numero real x: ");
        double numerox = scanner.nextDouble();
        System.out.println("ingrese el valor del numero real y: ");
        double numeroy = scanner.nextDouble();
         
        //hago un if con la primera condicion para que haga las operaciones
        if (numerox >= numeroy) {
            int suma = (int) (numerox + numeroy);
            int resta = (int) (numerox - numeroy);
            System.out.println("suma: " + suma);
            System.out.println("resta: "+ resta);
        }
        // este es por que y es mayor que x entonces multiplica y divide
        if (numerox < numeroy) {
            int multiplicacion = (int) (numerox * numeroy);
            int division = (int) (numeroy / numerox);
            System.out.println("multiplicacion: " + multiplicacion);
            System.out.println("division: " + division);
            //si y es igual a cero dice que no se puede dividir
        } else if (numeroy == 0) {
            System.out.println("no se puede dividir 0 ");
        }
        //cierro el scanner
        scanner.close();
    }
}