void main() {
    try {
        // Código que pode gerar uma exceção
    } catch (Exception e) {
        // Tratamento da exceção
    } finally {
        // Sempre é executado, independente de exceção ou não
    }

    IO.println("Resultado: " + divide(10, 2));
}

int divide(int a, int b) {
    try {
        IO.println("Tentando realizar a divisão de " + a + " por " + b);
        return a / b;
    } catch (Exception e) {
        IO.println("Houve um erro do tipo " + e.getMessage());
        return 0;
    } finally {
        IO.println("Método 'divide' invocado com sucesso!");
    }
}