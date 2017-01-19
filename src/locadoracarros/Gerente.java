package locadoracarros;

import java.util.ArrayList;

/**
 *
 * @author edunativa
 */
public class Gerente extends Funcionario{
   private String nomeLogin;
   private String senha;
   ArrayList<Clientes> lst_Clientes;
   ArrayList<Veiculos>lst_Veiculos;
   
  
   
   //Construtor

    public Gerente(String nomeLogin, String senha) {
        this.nomeLogin = nomeLogin;
        this.senha = senha;
        lst_Clientes = new ArrayList();
        lst_Veiculos = new ArrayList();
    }
   //Encaspulamento

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin; 
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //Metodos acessores para acessar a Lista de Clientes;
    public ArrayList<Clientes> getLst_Clientes() {
        return lst_Clientes;
    }

    public void setLst_Clientes(ArrayList<Clientes> lst_Clientes) {
        this.lst_Clientes = lst_Clientes;
    }
    
    public void AdicionarCliente(Clientes c){
        lst_Clientes.add(c);
    }
    
    //Metodos acessores para Acessar a Lista de Veiculos
    public ArrayList<Veiculos> getLst_Veiculos() {
        return lst_Veiculos;
    }

    public void setLst_Veiculos(ArrayList<Veiculos> lst_Veiculos) {
        this.lst_Veiculos = lst_Veiculos;
    }
    
        
    public void AdicionarVeiculos(Veiculos v){
        lst_Veiculos.add(v);
    }
    
   
}
