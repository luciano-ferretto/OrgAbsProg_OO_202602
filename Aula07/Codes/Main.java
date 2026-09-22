import java.util.List;
void imprimirVeiculos(List<Veiculo> veiculos) {
    for (Veiculo v : veiculos) {
        IO.println(v.toString());
        //ou simplesmente = IO.println(v);
    }
}


void main(){
 
    Caminhao fnm = new Caminhao(
        "FNM", "FNM D-11000",1965,"ABC-1234",13000,3);

    Carro palio = new Carro(
        "Fiat", "Palio Fire 1.0", 2011, "xyz-3333", 4, "Flex");

    Veiculo cg = new Veiculo("Honda", "CG 150", 2014, "eee-8888");

    
    imprimirVeiculos(List.of(fnm, palio, cg));




    IO.println(fnm.toString());
    
    Veiculo fusca = new Veiculo();
    //fusca.marca = "Volkswagem";
    //fusca.modelo = "Fusca do Itamar - Série Ouro";
    //fusca.ano = 1995;
    //fusca.placa = "ABC-1234";
    fusca.setMarca("Volkswagem");
    fusca.setModelo("Fusca do Itamar - Série Ouro");
    fusca.setAno(1995);
    fusca.setPlaca("ABC-1234");

    Veiculo uno; //Declaro uma nova variável do tipo Veiculo
    uno = new Veiculo(); //Instanciando um novo objeto a partir da classe Veiculo
                         // referenciando-o pela variável uno
    //uno.marca = "Fiat";
    //uno.modelo = "Uno de firma com escada no teto";
    //uno.ano = 2005;
    //uno.placa = "DEF-5678";
    uno.setMarca("Fiat");
    uno.setModelo("Uno de firma com escada no teto");
    uno.setAno(2005);
    uno.setPlaca("DEF-5678");

    IO.println("Veículo: " + fusca.getMarca() + " - " + fusca.getModelo());
    int tempoUsoFusca = fusca.calculaTempoUso();
    IO.println("Tempo de uso do Fusca: " + tempoUsoFusca + " anos");

    int tempoUsoFusca2030 = fusca.calculaTempoUso(2030);
    IO.println("Tempo de uso do Fusca em 2030: " + tempoUsoFusca2030 + " anos");

    int tempoUsoUno = uno.calculaTempoUso();
    IO.println("Tempo de uso do Uno: " + tempoUsoUno + " anos");
    
    System.out.printf("Tempo de uso do uno: %d anos", tempoUsoUno);

    Veiculo novoUno = uno;
    novoUno.setAno(2014);

    Veiculo brasilia = new Veiculo("Volkswagem", "Brasília Amarela", 1980, "ghi-3333");

}