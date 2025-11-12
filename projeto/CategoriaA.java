
package projeto;

public abstract class CategoriaA extends UpSeguros{
    
    protected String Placa,Chassi;
    
//-------------------PLACA---------------------   
    public String getPlaca(){
        return Placa;
    }
    
    public void setPlaca(String placa){
        this.Placa = placa;
    }
//-------------------CHASSI---------------------   
    public String getChassi(){
        return Chassi;
    }
    
    public void setChassi(String chassi){
        this.Chassi = chassi;
    }
//-------------------toString---------------------   
    public String toString(){
        String saida = "DADOS DO VEICULO ->"
                + " MODELO = "+ getModelo()
                + " // PRECO = "+ getPreco()
                + " // COR = "+ getCor()
                + " // PLACA = "+ getPlaca()
                + " // CHASSI = "+ getChassi()
                +"\n------------------------------------------------------------------------------------------------------------------------------------\n";
        return saida;
    }
    
 
}
