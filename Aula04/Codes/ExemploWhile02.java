void main() {
        /*Neste exemplo a execução permanece em loop enquanto a variável opcao contiver o valor 'S' 
        * a grande diferença para a estrutura while tradicional é que a variável opcao não precisa
        * possuir o valor 'S' no início;
        */
        char opcao;
        do {
            IO.println("Digite 'S' se deseja permanecer aqui?");
            opcao = IO.readln().charAt(0);
        } while (opcao == 'S');
}
