public class Caminhao extends Veiculo{

    private double capacidadeCarga;
    private int quantidadeEixos;

    public Caminhao(){

    }

    public Caminhao(String marca, String modelo, int ano, String placa, double capacidadeCarga, int quantidadeEixos) {
        super(marca, modelo, ano, placa);
        this.capacidadeCarga = capacidadeCarga;
        this.quantidadeEixos = quantidadeEixos;
    }



    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override  //annotations
    public String toString() {
        String descricao = super.toString();
        descricao += """
                Capacidade de Carga: %.2f
                Número de eixos: %d
                """;
        return descricao.formatted(
            this.getCapacidadeCarga(),
            this.getQuantidadeEixos()
        );
    }
    
}