package AccountAbstract;
import ClassClient.Client;

public abstract class Account extends Client {
        private Integer CodConta;
        private Double valor;
        private String armazen;
        private String tipoConta;
        public void setTipoConta(String tipoConta) {
            this.tipoConta = tipoConta;
        }
        public Account(){
            super.getCodClient();
        }
        public String getTipoConta(){
            return this.tipoConta;
        }
        public Integer getCodConta(){
            return this.CodConta;
        }
        public void setCodConta(Integer n){
            this.CodConta = n;
        }
        public Double getValor(){
            return this.valor;
        }
        public void setValor(Double v){
            this.valor = v;
        }
        public String getArmazen(){
            return this.armazen;
        }
        
        public void setArmazen(String Gb){
            this.armazen = Gb;
        }
        public void info(){
            System.out.println("|Tipo de Conta:"+getTipoConta());
            System.out.println("\r\n|Armazenamento:"+getArmazen());
            System.out.println("|Valor:"+getValor()+"\r\n");
            
        }
    } 

