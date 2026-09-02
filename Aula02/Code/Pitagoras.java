void main() {
    String catetoAStr = IO.readln("Informe o valor do Cateto A: ");
    String catetoBStr = IO.readln("Informe o valor do Cateto B: ");
    double catetoA = Double.valueOf(catetoAStr);
    double catetoB = Double.valueOf(catetoBStr);

    double hipotenusa = 
        Math.sqrt(catetoA * catetoA + Math.pow(catetoB, 2));
    
    IO.println("A hipotenusa é: " + hipotenusa);
    System.out.printf
       ("A hipotenusa é %.2f (A: %.2f - B: %.2f)!!!\n", 
                hipotenusa, catetoA, catetoB);
    IO.readln();

}