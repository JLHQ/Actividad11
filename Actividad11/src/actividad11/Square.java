
package actividad11;

/**
 *
 * @author Luis_
 */
public class Square extends Shape{
    private double lado1;

    public Square(double lado1) {
        super(4);
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    @Override
    public String toString() {
        return "Cuadrado; \n" + super.toString() + "\nLados= " + lado1;
    }
    
    @Override
    public double area(){
        return lado1*lado1;
    }
    
    @Override
    public double perimetro(){
        return ((lado1*4));
    }
}
