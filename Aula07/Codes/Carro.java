public class Carro extends Veiculo {
    
    private int quantidadePortas;
    private String tipoCombustivel;

    public Carro(){

    }

    public Carro(String marca, String modelo, int ano, String placa,
                 int quantidadePortas, String tipoCombustivel) {
        super(marca, modelo, ano, placa);
        this.quantidadePortas = quantidadePortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    @Override  //annotations
    public String toString() {
        String descricao = super.toString();
        descricao += """
                Número de Portas: %d
                Combustível: %s
                """;
        return descricao.formatted(
            this.getQuantidadePortas(),
            this.getTipoCombustivel()
        );
    }
    

}
