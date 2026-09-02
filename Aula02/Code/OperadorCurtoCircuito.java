void main() {
    int num1 = 10;
    int num2 = 0;

    // Valida a primeira condicional - se esta for falsa, não executa as próximas
    if (num2 != 0 && num1 % num2 == 0) {
        IO.println("Num2 é fator de Num1");
    } 

    // Aqui irá passar por todas as condicionais, idependende de serem falsas ou não
    if (num2 != 0 & num1 % num2 == 0) {
        IO.println("Num2 é fator de Num1");
    } 

}