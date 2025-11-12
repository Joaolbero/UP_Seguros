
package projeto;

public class Carro extends CategoriaA{
    
    protected double SeguroCarro(){
        double valor;
        double preco = Double.parseDouble(Preco);
        valor = (preco/100)*8;
        return valor;
    }
    
}
