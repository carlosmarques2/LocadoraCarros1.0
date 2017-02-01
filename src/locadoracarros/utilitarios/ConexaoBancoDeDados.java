/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ConexaoBancoDeDados {
    public Statement stm;//Responsavel por preparar e realizar pesquisas no Banco de Dados
    public ResultSet rs;//Responsavel por armazenar o resultado de uma pesquisa passada para o statement
    private String driver = "org.postgresql.Driver";//Responsavel por identificar o Serviço Banco de Dados
    private String caminho = "jdbc:postgresql://localhost:5432/databaselocadora";//Responsavel por setar o local do Banco de Dados
    private String usuario = "postgres";
    private String senha = "janela123";
    public Connection conn;//Responsavel por realizar a conexão com o Banco de Dados
    
    public void conexao(){ //metodo responsavel por realizar a conexão com o Banco de Dados
        try {
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do Driver de conexão
            conn = DriverManager.getConnection(caminho,usuario,senha);//Realiza a conexão com o Banco de Dados
            JOptionPane.showMessageDialog(null,"Conectado com Sucesso!");//imprime uma mensagem em caso de sucesso
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Conexão!\nErro: "+ex.getMessage());//imprime uma mensagem em caso de falha
        }
    }
    
    public void desconecta(){//metodo responsavel por desconectar o Banco de Dados
        try {
            conn.close();
            JOptionPane.showMessageDialog(null,"Desconectado com Sucesso!");//imprime uma mensagem em caso de sucesso
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Conexão!\nErro: "+ex.getMessage());
        }
    }
    
    public void executaSQL(String sql) { 
   
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Execução do SQL!\nErro: " + ex.getMessage());
        }
    }
}
