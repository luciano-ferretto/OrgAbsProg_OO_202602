void main() {
    /* Como o Java é Compilado, é possível invocar (chamar)
    os métodos (funções) em qualquer parte do código,
    mesmo antes de serem declarados */
    imprimeOi();

    int resultadoInt = divide(10, 4);
    IO.println(resultadoInt);

    double resultadoDouble = divide(10.0, 4.0);
    IO.println(resultadoDouble);
}

void imprimeOi(){
    IO.println("OI");
}

int divide(int a, int b) {
    return a/b;
}

double divide(double a, double b) {
    return a/b;
}

