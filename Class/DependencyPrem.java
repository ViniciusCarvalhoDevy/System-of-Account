package Class;
public class DependencyPrem extends AccountPremium {
    public DependencyPrem(String nome){
        super.setDependenty(nome);
    }

    public void setArmazenDepen(){
        super.setArmazen("250 GB");
    }
    public String getTipoContaDepen(){
        return super.getTipoConta();  
    }
    public void setTipoContaDepen(){
        super.setTipoConta("Conta Dependente Premium");
    }
    public void infoD(){
        System.out.println("Tipo de Conta: "+getTipoContaDepen());
        System.out.println("Nome: "+super.getDependenty());
       
    }
}
