package Class;
import AccountAbstract.Account;

public class AccountPremium extends Account{
       private String Dependenty;

    public AccountPremium(){
        super.getCodClient();
        }
          
    
        public String getDependenty() {
            return Dependenty;
        }
    
    
    
        public void setDependenty(String Nome) {
            Dependenty = Nome;
        }
    
    
    public Integer getCodContaPrem(){
            return super.getCodConta();
        }
        public void setCodContaPrem(){
            super.setCodConta(5689);
        }
        public Double getValorPrem(){
            return super.getValor();
        }
        public void setValorPrem(){
            super.setValor(49.50);
        }
        public String getArmazenPrem(){
            return super.getArmazen();
        }
        public void setArmazenPrem(){
            super.setArmazen("1 TB");
        }
        public String getTipoContaPremium(){
            return super.getTipoConta();  
        }
        public void setTipoContaPremium(){
            super.setTipoConta("Conta Master");
        }
        public void info(){
            super.info();
           
        }
    }

