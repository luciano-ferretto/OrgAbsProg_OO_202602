void main() {
    String message = """
            Sistema de Biblioteca
            Escolha uma das opções:
            1 - Cadastro de Livros
            2 - Listar Livros
            3 - Buscar Livro
            0 - Sair
            """;
    IO.println(message);
    String opcaoStr = IO.readln("Digite uma opção: ");
    int opcao = Integer.valueOf(opcaoStr);
    switch (opcao) {
        case 1:
            IO.println("Cadastrando ...");
            break;
        case 2:
            IO.println("Listando ...");
            break;
        case 3: 
            IO.println("Buscando ...");
            break;
        case 0:
            IO.println("Saindo ...");
            break;
        default:
            IO.println("Opção Inválida");
            break;
    }
}