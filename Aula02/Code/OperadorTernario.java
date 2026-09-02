void main() {
    int num = 7;
    if (num % 2 == 0) {
        IO.println("Par");
    } else {
        IO.println("Ímpar");
    }

    String resultado = num % 2 == 0 ? "Par" : "Ímpar";
    IO.println(resultado);

    
}