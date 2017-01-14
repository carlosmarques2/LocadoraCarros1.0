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
   
  
   
   //Construtor

    public Gerente(String nomeLogin, String senha) {
        this.nomeLogin = nomeLogin;
        this.senha = senha;
        lst_Clientes = new ArrayList();
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

    public ArrayList<Clientes> getLst_Clientes() {
        return lst_Clientes;
    }

    public void setLst_Clientes(ArrayList<Clientes> lst_Clientes) {
        this.lst_Clientes = lst_Clientes;
    }
    
    public void AdicionarCliente(Clientes c){
        lst_Clientes.add(c);
    }
   
}
