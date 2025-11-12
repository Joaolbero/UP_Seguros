
package projeto;

public abstract class CategoriaB extends UpSeguros{
    
    protected String Id,Nf;
    
    //-------------------ID---------------------   
    public String getId(){
        return Id;
    }
    
    public void setId(String id){
        this.Id = id;
    }
//-------------------NF---------------------   
    public String getNf(){
        return Nf;
    }
    
    public void setNf(String nf){
        this.Nf = nf;
    }
    
//-------------------toString---------------------   
    
    public String toString(){
        String saida = "DADOS DO DISPOSITIVO ->"
                + " MODELO = "+ getModelo()
                + " // PRECO = "+ getPreco()
                + " // COR = "+ getCor()
                + " // ID = "+ getId()
                + " // NF = "+ getNf()
                +"\n------------------------------------------------------------------------------------------------------------------------------------\n";
        return saida;
    }
    
}
