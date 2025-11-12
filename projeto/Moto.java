
package projeto;

public class Moto extends CategoriaA{
    
    protected double SeguroMoto(){
        double valor;
        double preco = Double.parseDouble(Preco);
        valor = (preco/100)*6;
        return valor;
    }
    
}
