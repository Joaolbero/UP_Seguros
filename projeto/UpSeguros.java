
package projeto;

public abstract class UpSeguros {
    
    protected String Cor,Preco,Modelo;
    protected int Pkx;
    
//-------------------COR---------------------   
    public String getCor(){
        return Cor;
    }
    
    public void setCor(String cor){
        this.Cor = cor;
    }
//-------------------PREÇO---------------------   
    public String getPreco(){
        return Preco;
    }
    
    public void setPreco(String preco){
        this.Preco = preco;
    }
//-------------------MODELO---------------------   
    public String getModelo(){
        return Modelo;
    }
    
    public void setModelo(String modelo){
        this.Modelo = modelo;
    }
//------------------Pkx--------------------------
    public int getPkx(){
        return Pkx;
    }
    
    public void setPkx(int pkx){
        this.Pkx = pkx;
    }
}
