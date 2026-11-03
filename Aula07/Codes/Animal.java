class Animal {
    public void emiteSom() {
        IO.println("Animal emite som genérico");
    }
}
class Cachorro extends Animal {
    public void emiteSom(){
        IO.println("Cachorro Late (au, au)");
    }
    public String toString() {return "Este é um cachorro";}
}
class Gato extends Animal {
    @Override 
    public void emiteSom(){IO.println("Gato mia (miau, miau)");}
    public String toString() {return "Este é um gato";}
}
void main() {
    Animal dog = new Cachorro();
    Animal mimi = new Gato();
    dog.emiteSom();
    mimi.emiteSom();

    IO.print(dog.toString());
}