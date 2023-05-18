package modelo;

public class Multiplicacion extends Operaciones
{
    public Multiplicacion (double x, double y){
        super(x, y);
    }

    public void Multiplicar(){
        resultado = x*y;
    }
}