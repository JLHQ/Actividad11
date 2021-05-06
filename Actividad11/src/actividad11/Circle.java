
package actividad11;

/**
 *
 * @author Luis_
 */
public class Circle extends Shape{
    private double radio;

    public Circle(double radio) {
        super(1);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo; \n" + "radio=" + radio;
    }
    
    @Override
    public double area(){
        return (Math.PI*(radio*radio));
    }
    
    @Override
    public double perimetro(){
        return (2*Math.PI*radio);
    }
    
    
}
