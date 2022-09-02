public class Main {
    public static void main(String[] args) {
        Coche miCoche= new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);
    }

}
class Coche{
    public int puertas = 0;

    public void AumentarPuertas() {
        this.puertas++;
    }
}

