import javax.swing.text.View;

void main(){
    
    Veiculo fusca = new Veiculo();
    fusca.marca = "Volkswagem";
    fusca.modelo = "Fusca do Itamar - Série Ouro";
    fusca.ano = 1995;
    fusca.placa = "ABC-1234";

    Veiculo uno; //Declaro uma nova variável do tipo Veiculo
    uno = new Veiculo(); //Instanciando um novo objeto a partir da classe Veiculo
                         // referenciando-o pela variável uno
    uno.marca = "Fiat";
    uno.modelo = "Uno de firma com escada no teto";
    uno.ano = 2005;
    uno.placa = "DEF-5678";


    IO.println("Veículo: " + fusca.marca + " - " + fusca.modelo);
    int tempoUsoFusca = fusca.calculaTempoUso();
    IO.println("Tempo de uso do Fusca: " + tempoUsoFusca + " anos");



    int tempoUsoUno = uno.calculaTempoUso();
    IO.println("Tempo de uso do Uno: " + tempoUsoUno + " anos");
    
    System.out.printf("Tempo de uso do uno: %d anos", tempoUsoUno);





    Veiculo novoUno = uno;
    novoUno.ano = 2014;



    Veiculo brasilia = new Veiculo("Volkswagem", "Brasília Amarela", 1980, "ghi-3333");




}