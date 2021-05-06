
package actividad11;

/**
 *
 * @author Luis_
 */
public abstract class Shape {
    protected int numeroLados;

    public Shape(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero de Lados=" + numeroLados;
    }
    
    public abstract double area();
    
    public abstract double perimetro();
}
