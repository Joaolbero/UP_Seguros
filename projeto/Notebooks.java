
package projeto;

public class Notebooks extends CategoriaB{
    
    protected double SeguroNotebooks(){
        double valor;
        double preco = Double.parseDouble(Preco);
        valor = (preco/100)*22;
        return valor;
    }    
    
}
