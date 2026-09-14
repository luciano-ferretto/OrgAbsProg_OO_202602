void main() {
		IO.println("""
                Pressione 'S' para SAIR.
                Pressione 'C' para NÃO contar os loops.
                """);
        /*Neste exemplo NÃO estamos declarando nenhuma de controle, nem condição e nem incremento
          Possuímos apenas uma variável no escopo do método main() para servir de contador.
          No corpo de instruções do For definimos que será solicitado uma entrada 
                   via Teclado, essa entrada será um retorno 
                   do tipo String (retorno do método "readln()"),
                   e desse retorno estrairemos o caracter contido no índice 0 dessa String (charAt(0))
               Quando esse caracter extraído for igual à 'S',
                   o loop será "quebrado" (a execução sairá do loop) através da instrução "break"
               Quando esse caracter extraído for igual à 'C',
                   o loop "pulará" para próxima iteração, ou seja, o que está abaixo desta linha
                   não será executado na iteração corrente.
        */
        int i = 1;
		for (;;) {
            char caracter = IO.readln().charAt(0);
            if (caracter == 'S')
                break;
            if (caracter == 'C')
                continue;
			IO.println("Já passou "+ i++ + " vezes");
       	}
}
