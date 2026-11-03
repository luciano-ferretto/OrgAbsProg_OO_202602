class Numero {
    int num;
    Numero(int num){this.num = num;}
}

void altera(int xx, Numero yy) {
    xx = xx + 10;
    yy.num = yy.num + 10;
}

void main() {
    int x = 10;
    Numero y = new Numero(10);
    altera(x, y);
    IO.println("X = " + x);
    IO.print("Y = " +  y.num);
}
