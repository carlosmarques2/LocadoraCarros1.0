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
    private String dataNascimento;
    private String Endereco;
    private String celular;
    
    //Construtor

    public Clientes(String nome, String CPF, String dataNascimento, String celular) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
    }

    //Construtor Vazio;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    

    
    
    
}
