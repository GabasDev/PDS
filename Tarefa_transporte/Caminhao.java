package conta.Tarefa_transporte;

public class Caminhao {
    private String marca;
    private String cor;
    private int placa;

    public Caminhao(String marca, String cor, int placa) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
