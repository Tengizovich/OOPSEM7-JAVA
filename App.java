ublic class App{

public static void main(String[] args) {
    new Innerapp().write();
}
}

interface IInterface {
void print();
}

class Innerapp {
IInterface v;

public Innerapp() {
    this.v = () -> System.out.println("Готово!");
}

void write() {
    v.print();
}
}
