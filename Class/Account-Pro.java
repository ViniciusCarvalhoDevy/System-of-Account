package Class;
import AccountAbstract.Account;

public class AccountPro extends Account{

        public AccountPro(){
            super.getCodClient();
    
        }
    
        public Integer getCodContaPro(){
            return super.getCodConta();
        }
        public void setCodContaPro(){
            super.setCodConta(5239);
        }
        public Double getValorPro(){
            return super.getValor();
        }
        public void setValorPro(){
            super.setValor(29.50);
        }
        public String getArmazenPro(){
            return super.getArmazen();
        }
        public void setArmazenPro(){
            super.setArmazen("500 GB");
        }
        public String getTipoContaPro(){
            return super.getTipoConta();  
        }
        public void setTipoContaPro(){
            super.setTipoConta("Conta Pro");
        }
        public void info(){
            super.info();
           
        }
    }

