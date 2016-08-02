/* Sobrecarga de métodos (Overloading) é quando você utiliza dois métodos de mesmo nome
   e utiliza tipos diferentes de variáveis. */

package overloading;

public class Overloading
{
    public static int quadrado(int num)
    {
        int quadrado;
        quadrado = num * num;
        return quadrado;
    }
    
    public static double quadrado(double num)
    {
        double quadrado;
        quadrado = num * num;
        return quadrado;
    }
    
    public static void main(String[] args)
    {
        System.out.println("O quadrado de 2 é " + quadrado(2) + ".");
        System.out.println("O quadrado de PI é " + quadrado(Math.PI) + ".");
    }
}