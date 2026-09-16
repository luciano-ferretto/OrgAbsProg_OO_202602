void main(){
    Pessoa jedi = new Pessoa("Obi Wan Kenobi");
    String padawan = "Anakin Skywalker";
    int idadeAnakin = 19;

    IO.println("=== Antes do Conselho Jedi ===");
    IO.println("Jedi: " + jedi.nome);
    IO.println("Padawan: " + padawan); 
    IO.println("Idade do Padawan: " + idadeAnakin);

    conselhoJedi(jedi, padawan, idadeAnakin);

    IO.println("\n=== Depois do Conselho Jedi ===");
    IO.println("Jedi: " + jedi.nome);
    IO.println("Padawan: " + padawan);
    IO.println("Idade do Padawan: " + idadeAnakin);
}

void conselhoJedi(Pessoa mestre, String aprendiz, int idade){
    mestre.nome = "Mestre " + mestre.nome;
    aprendiz = "Darth Vader";
    idade += 10;
    IO.println("\n=== Conselho Jedi ===");
    IO.println("Mestre renomeado: " + mestre.nome);
    IO.println("Aprendiz renomeado: " + aprendiz);
    IO.println("Idade do Aprendiz: " + idade);
}