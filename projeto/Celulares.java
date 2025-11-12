
package projeto;

public class Celulares extends CategoriaB{
    
    protected double SeguroCelulares(){
        double valor;
        double preco = Double.parseDouble(Preco);
        valor = (preco/100)*27;
        return valor;
    }    
    
}
