/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoracarros;

/**
 *
 * @author edunativa
 */
public class Clientes {
    private String nome;
    private String CPF;
    private int Idade;
    private String Endereco;
    private String celular;
    
    //Construtor

    public Clientes(String nome, String CPF, int Idade, String celular) {
        this.nome = nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.celular = celular;
    }

    public Clientes() {
    }
    
    
    
    //Metodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

  

    
    
    
}
