package locadoracarros;

import java.util.Date;

/**
 *
 * @author edunativa
 */
public class Veiculos {
    private String Marca;
    private String Modelo;
    private String placa;
    private String nChassi;
    private Date datalocacao;
    private float vlrDiaria;
    private int qntDiasLocado;
    
    //Construtor

    public Veiculos(String Marca, String Modelo, String placa, String nChassi){
        this.Modelo = Marca;
        this.Marca = Modelo;
        this.placa = placa;
        this.nChassi = nChassi;
        
    }
    
    //Metodos acessores

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public void setModelo(String modelo){
        this.Modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getNChassi(){
        return nChassi;
    }
    
    public void setNChassi(String nchassi){
        this.nChassi = nchassi;
    }

    public Date getDatalocacao() {
        return datalocacao;
    }

    public void setDatalocacao(Date datalocacao) {
        this.datalocacao = datalocacao;
    }

    public float getVlrDiaria() {
        return vlrDiaria;
    }

    public void setVlrDiaria(float vlrDiaria) {
        this.vlrDiaria = vlrDiaria;
    }

    public int getQntDiasLocado() {
        return qntDiasLocado;
    }

    public void setQntDiasLocado(int qntDiasLocado) {
        this.qntDiasLocado = qntDiasLocado;
    }
    
    
}
