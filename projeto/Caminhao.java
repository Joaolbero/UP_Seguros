
package projeto;

public class Caminhao extends CategoriaA{
    
    protected double SeguroCaminhao(){
        double valor;
        double preco = Double.parseDouble(Preco);
        valor = (preco/100)*5;
        return valor;
    }
}
