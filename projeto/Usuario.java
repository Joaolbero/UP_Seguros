
package projeto;

public class Usuario{
    
    protected String Cpf,Nome,Endereco,Telefone,Idade;
    protected int Pk;
    
//-----------------------CPF-----------------------------
    public String getCpf(){
        return Cpf;
    }
    
    public void setCpf(String cpf){
        this.Cpf = cpf;
    }
//-----------------------NOME-----------------------------
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
//-----------------------ENDEREÇO-----------------------------
    public String getEndereco(){
        return Endereco;
    }
    
    public void setEndereco(String endereco){
        this.Endereco = endereco;
    }
//-----------------------TELEFONE-----------------------------
    public String getTelefone(){
        return Telefone;
    }
    
    public void setTelefone(String telefone){
        this.Telefone = telefone;
    }
//-----------------------IDADE-----------------------------
    public String getIdade(){
        return Idade;
    }
    
    public void setIdade(String idade){
        this.Idade = idade;
    }
//------------------------PK---------------------------------
    public int getPk(){
        return Pk;
    }
    
    public void setPk(int pk){
        this.Pk = pk;
    }
//-------------------------toString--------------------------

    public String toString(){
        String saida = "\nDADOS DO USUÁRIO -> " 
                +"NOME = "+ getNome()
                + " // CPF = "+ getCpf()
                + " // ENDERECO = "+ getEndereco()
                + " // TELEFONE = "+ getTelefone()
                + " // IDADE = "+ getIdade()
                + " // n";
        return saida;
    }
    
}
