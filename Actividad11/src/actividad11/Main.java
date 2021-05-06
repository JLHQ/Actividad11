
package actividad11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis_
 */
public class Main {
    
    static ArrayList<Shape> shape = new ArrayList<Shape>();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        //Llenar un poligono
        fillShape();
        
        //Mostrar los datos, area y perimetro de cada poligono
        showResults();
    }
    
    public static void fillShape(){
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Circulo");
                System.out.println("Opcion: ");
                opcion = scan.nextInt();
            }while(opcion<1 || opcion>3);
            
            switch(opcion){
                case 1: fillTriangle();
                    break;
                case 2: fillSquare();
                    break;
                case 3: fillCircle();
                    break;
            }
            
            System.out.println("\nDesea introducir otro poligono (s/n)");
            respuesta = scan.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s'||respuesta=='S');
    }
    
    public static void fillTriangle(){
        double lado1, lado2, lado3;
        
        System.out.println("\nDigite el primer lado del triangulo");
        lado1 = scan.nextDouble();
        System.out.println("Digite el segundo lado del triangulo");
        lado2 = scan.nextDouble();
        System.out.println("Digite el tercer lado del triangulo");
        lado3 = scan.nextDouble();
        
        Triangle triangle = new Triangle(lado1, lado2, lado3);
        //Guarda un triangulo en el arreglo de shape
        shape.add(triangle);
    }
    
    public static void fillSquare(){
        double lado1;
        System.out.println("\nDigite un lado del cuadrado");
        lado1 = scan.nextDouble();
        
        Square square = new Square(lado1);
        
        shape.add(square);
    }
    
    public static void fillCircle(){
        double radio;
        System.out.println("\nDigite el radio del circulo");
        radio = scan.nextDouble();
        
        Circle circle = new Circle(radio);
        
        shape.add(circle);
    }
    
    public static void showResults(){
        //recorre el arreglo de shapes
        for(Shape shapes: shape){
            System.out.println(shapes.toString());
            System.out.println("Area= "+shapes.area());
            System.out.println("Perimetro= "+shapes.perimetro());
            System.out.println("");
        }
    }
}
