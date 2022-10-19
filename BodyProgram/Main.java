import java.util.Scanner;

import Class.AccountMaster;
import Class.AccountPremium;
import Class.AccountPro;
import Class.DependencyPrem;
import ClassClient.Client;

//import ClassClient.Client;
import java.util.ArrayList;
import java.util.Random;

public class Main{

    public static void main(String[] args) {
        ArrayList<Integer> CodClient = new ArrayList<>();
        ArrayList<String> TipoConta = new ArrayList<>();
        ArrayList<String> Nome = new ArrayList<>();
        ArrayList<String> Email = new ArrayList<>();
        ArrayList<String> Senha = new ArrayList<>();
        ArrayList<String> Armazen= new ArrayList<>();
        ArrayList<Double> Valor = new ArrayList<>();
        ArrayList<String> Dependen= new ArrayList<>();
        int cont=0;
        int indk = 0;
        Scanner scan = new Scanner(System.in);
        AccountPro pro = new AccountPro();
        AccountMaster master = new AccountMaster();
        AccountPremium premiun = new AccountPremium();
        Client cliente = new Client();
        int op=0;
        int n=0;
    do{
        System.out.println("|1 - Cadastro|\r\n|2 - Consulta|\r\n|0 - Encerrar|");
         op = scan.nextInt();
        switch (op){
            case 1: 
                String name;
                System.out.println("|Cadastro do Cliente|");
                System.out.println("\r\nDigite Seu nome:");
                String bug = scan.nextLine();               
                name =scan.nextLine();
                cliente.setNome(name);
                Nome.add(name);
                System.out.println("\r\nDigite Seu E-mail:"); 
                String mail =scan.nextLine();
                cliente.setEmail(mail);
                Email.add(mail);
                System.out.println("\r\nDigite Sua Senha:");
                String sen =scan.nextLine();
                cliente.setSenha(sen);
                Senha.add(sen);
                cont = new Random().nextInt(1000000) + 1;
                cliente.setCodClient(++cont);; 
                cliente.infoClient(); 
                CodClient.add(cliente.getCodClient());
                System.out.println("\r\nQual Conta Você Deseja?");
                System.out.println("\r\n|1 - Pro    |\r\n|2 - Master |\r\n|3 - Premium|");
                int opcao = scan.nextInt();
                    if(opcao == 1){
                        pro.setTipoContaPro();
                        pro.setArmazenPro();
                        pro.setValorPro();
                        pro.info();
                        TipoConta.add(n,pro.getTipoContaPro());                        
                        Armazen.add(n,pro.getArmazenPro());
                        Valor.add(n,pro.getValorPro());
                    }else if (opcao == 2){
                        master.setTipoContaMaster();
                        master.setArmazenMAster();
                        master.setValorMAster();
                        master.info();
                        TipoConta.add(n,master.getTipoContaMaster());                          
                        Armazen.add(n,master.getArmazenMAster());
                        Valor.add(n,master.getValorMAster());
                    }else if (opcao == 3){
                        premiun.setTipoContaPremium();
                        premiun.setArmazenPrem();
                        premiun.setValorPrem();
                        premiun.info();
                        TipoConta.add(n,premiun.getTipoContaPremium());
                        Armazen.add(n,premiun.getArmazenPrem());
                        Valor.add(n,premiun.getValorPrem());
                        System.out.println("Deseja Adicionar uma dependente?");
                        int v = scan.nextInt();
                        if( v == 1){
                            System.out.println("\r\nDigite Seu nome:");
                        String d= scan.next();
                        DependencyPrem depen = new DependencyPrem(d); 
                        Dependen.add(depen.getDependenty()); 
                        indk++;
                        }                                                              
                    }
                        n++;                     
            break;
            case 2: 
                    Integer cod ;
                    int p=0;
                do{
                    System.out.println("\r\nDigite Seu Código:"); 
                    cod =scan.nextInt();
                    System.out.println("\r\nDigite Sua Senha:");
                    String s = scan.nextLine();
                    sen =scan.nextLine();
            
                    if(CodClient.indexOf(cod) <=-1 || Senha.indexOf(sen) <=-1){
                        System.out.println("Senha Ou Email Incorretos! PorFavor Tente Novamente!");
                        
                    }
                    
                    
                        int d; 
                        
                    if(CodClient.indexOf(cod) == Senha.indexOf(sen)){
                        p=CodClient.indexOf(cod);
                    //for(p=0;p<CodClient.size();p++)  {
                        System.out.println("--------------------------------------------");
                        System.out.println("||Imformações Sobre o Usuário||");
                        System.out.println("|Codigo: "+CodClient.get(p));
                        System.out.println("|E-mail: "+Email.get(p));
                        System.out.println("|Senha: "+Senha.get(p));
                        System.out.println("||Imformações Sobre a Conta||");
                        System.out.println("|Tipo Da Conta: "+TipoConta.get(p));
                        System.out.println("|Armazenamento: "+Armazen.get(p));
                        System.out.println("|Valor: "+Valor.get(p));
                        if(indk >=1){
                            System.out.println("|Dependente: "+Dependen.get(p));
                        }
                        System.out.println("--------------------------------------------");
                    // }
                        
                    }
                
                }while(CodClient.indexOf(cod) <=-1 || Senha.indexOf(sen) <=-1);
            break;
        }
    }while(op != 0);

    }
}
