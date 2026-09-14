void main() {
		IO.println("Pressione 'S' para SAIR.");
        /*Neste exemplo estamos declarando uma variável de controle que nomeamos de "i"
                   e a inicializamos com o valor 1 (um)
          A cada iteração do bloco, ou seja, a cada loop haverá o incremento de "+ 1" (mais um)
                   na variável de controle "i"
          Na condição do For definimos que será solicitado uma entrada via Teclado
                   essa entrada será um retorno do tipo String (retorno do método "readln()"),
                   e desse retorno estrairemos o caracter contido no índice 0 dessa String (charAt(0))
               O loop ficará ativo enquanto esse caracter extraído for diferente de 'S',
                   observe que o Java é Case-Sensitive
        */
        
		for (int i = 1; !IO.readln().equals("S"); i++) {
			IO.println("Já passou "+ i + " vezes");
       	}

        for (int i = 1; IO.readln().charAt(0) != 'S'; i++) {
			IO.println("Já passou "+ i + " vezes");
       	}
}
