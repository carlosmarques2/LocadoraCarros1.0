package locadoracarros;

import java.util.Date;

/**
 *
 * @author edunativa
 */
public class Veiculos {
    private String Marca;
    private String placa;
    private Date datalocacao;
    private float vlrDiaria;
    private int qntDiasLocado;
    
    //Construtor

    public Veiculos(String Marca, String placa, Date datalocacao, float vlrDiaria, int qntDiasLocado) {
        this.Marca = Marca;
        this.placa = placa;
        this.datalocacao = datalocacao;
        this.vlrDiaria = vlrDiaria;
        this.qntDiasLocado = qntDiasLocado;
    }
    
    //Metodos acessores

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
