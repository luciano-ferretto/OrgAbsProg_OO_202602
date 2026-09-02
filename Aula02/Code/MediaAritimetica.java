void main() {
    String nome = IO.readln("Informe o seu nome: ");
    String notaG1Str = IO.readln("Informe sua nota G1: ");
    String notaG2Str = IO.readln("Informe sua nota G2: ");
    double notaG1 = Double.valueOf(notaG1Str);
    double notaG2 = Double.valueOf(notaG2Str);

    double media = (notaG1 + notaG2) / 2;

    System.out.printf(
            "Aluno: %s - Média: %.2f (G1: %.2f - G2: %.2f)",
            nome, media, notaG1, notaG2);

    if (media >= 7) // Quando é apenas uma instrução, não precisa {}
        IO.println("Parabéns!!! Você foi aprovado :-)");
    else if (media >= 3) {
        IO.println("Quase!!! Você ficou em exame :-|");
    } else {
        IO.println("Não foi dessa vez!!! Você está reprovado :-(");
    }

}