package Class;
import AccountAbstract.Account;

public class AccountMaster extends Account{

        public AccountMaster(){
            super.getCodClient();
    
        }
    public Integer getCodContaMAster(){
            return super.getCodConta();
        }
        public void setCodContaMAster(){
            super.setCodConta(5689);
        }
        public Double getValorMAster(){
            return super.getValor();
        }
        public void setValorMAster(){
            super.setValor(39.50);
        }
        public String getArmazenMAster(){
            return super.getArmazen();
        }
        public void setArmazenMAster(){
            super.setArmazen("700 GB");
        }
        public String getTipoContaMaster(){
            return super.getTipoConta();  
        }
        public void setTipoContaMaster(){
            super.setTipoConta("Conta Master");
        }
        public void info(){
            super.info();
           
        }
     
    } 
