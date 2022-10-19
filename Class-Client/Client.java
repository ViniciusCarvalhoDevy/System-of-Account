package ClassClient;


public class Client{
    private String nome;
   
    private String email;
    private String senha;
    private int CodClient;
    
    public Client(){

    } 
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getCodClient() {
        return CodClient;
    }
    public void setCodClient(int codClient) {
        CodClient = codClient;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void infoClient(){
        System.out.println("Codigo: "+getCodClient());
        System.out.println("Nome: "+getEmail());
        System.out.println("E-mail: "+getNome());
    }
}
