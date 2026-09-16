import java.time.LocalDate;

public class Veiculo {

    String marca;
    String modelo;
    int ano;
    String placa;

    // Método construtor = Possui o mesmo nome (identificador) que a classe
    //                     e não possui retorno
    /*Método construtor Default
        - Não possui parâmetros de entrada
        - Existe implicitamente em todas as classes 
               SE E SOMENTE SE, não houver outro método construtor declarado
    */
    public Veiculo(){

    }

    /* Método Construtor
        - Pode ser usado para inicializar os atributos com valores no momento da instanciação
        - Pode realizar outras operções além da inicialização de atributos
     */
    public Veiculo(String _marca, String modelo, int ano, String placa){
        this.marca = _marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    int calculaTempoUso(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }


}