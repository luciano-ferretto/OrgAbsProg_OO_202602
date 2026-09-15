import java.util.ArrayList;
import java.util.List;

List<String> veiculos = new ArrayList<>();

void main() {
    String menu = """
            ==== CadVeículos ====
            Selecione uma opção válida:
            1 - Cadastrar Veículo;
            2 - Listar Veículos;
            3 - Remover Veículo;
            0 - Sair;
            """;
    int opcao;
    do {
        IO.println(menu);
        opcao = Input.readInt("Digite uma opção:");
        switch (opcao) {
            case 1 -> {
                cadastrarVeiculo();
            }
            case 2 -> listarVeiculos();
            case 3 -> removerVeiculo();
            case 0 -> IO.println("Até Logo!!!!");
            default -> {
                IO.println("Opção Inválida");
            }
        }
    } while (opcao != 0);

}

void cadastrarVeiculo() {
    String novoVeiculo = IO.readln("Digite o nome do novo veículo: ");
    novoVeiculo = novoVeiculo.trim();
    if (!novoVeiculo.isBlank())
        veiculos.add(novoVeiculo);
}

void listarVeiculos() {
    IO.println("Veículos cadastrados: ");
    for (int i = 0; i < veiculos.size(); i++) {
        IO.println((i + 1) + " - " + veiculos.get(i));
    }
    // for (String veiculo : veiculos) {
    // IO.println(veiculo);
    // }
}

void removerVeiculo() {
    listarVeiculos();
    int indice = Input.readInt("Digite o índice do veículo a ser removido: ");
    if (indice > 0 && indice <= veiculos.size()) {
        veiculos.remove(--indice);
    }

}