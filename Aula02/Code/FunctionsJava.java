void main(){
    imprimeOi();
    String saudacao = retornaOi();
    String maiusculo = converterMaiusculo(saudacao);
}
void imprimeOi() {
    IO.println("Oi");
}
String retornaOi() {
    try { 
        int n = 10/0;
    }
    catch(Exception eer) {
        IO.println("erro");
    }
    return "Oi";
}
String converterMaiusculo(String texto){
    return texto.toUpperCase();
}