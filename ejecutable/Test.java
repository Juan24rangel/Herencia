package ejecutable;

import javax.swing.JOptionPane;

import modelo.Suma;
import modelo.Resta;
import modelo.Multiplicacion;
import modelo.Division;

public class Test 
{
  public static void main(String[] args) {
    double x= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
    double y= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

    Suma miSuma = new Suma(x, y);
    miSuma.Sumar();
    JOptionPane.showMessageDialog(null, "La suma de "+x+" y "+y+" es= "+miSuma.mostrarResultados());
    

    Resta miResta = new Resta(x, y);
    miResta.Restar();
    JOptionPane.showMessageDialog(null, "La resta de "+x+" y "+y+" es= "+miResta.mostrarResultados());
    

    Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
    miMultiplicacion.Multiplicar();

    JOptionPane.showMessageDialog(null, "La multiplicación de "+x+" y "+y+" es= "+miMultiplicacion.mostrarResultados());
    

    Division miDivision = new Division(x, y);
    miDivision.Divir();
    JOptionPane.showMessageDialog(null, "La división de "+x+" y "+y+" es= "+miDivision.mostrarResultados());
    System.exit(0);
  }  
}
