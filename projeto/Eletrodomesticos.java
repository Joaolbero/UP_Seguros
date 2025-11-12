
package projeto;

public class Eletrodomesticos extends CategoriaB{
    
    protected double SeguroEletrodomesticos(){
        double valor;
        double preco = Double.parseDouble(Preco);
        valor = (preco/100)*18;
        return valor;
    }    
    
    
}
