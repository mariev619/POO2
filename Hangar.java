// Crée une classe Hangar qui possédera une méthode main()
public class Hangar {
    public static void main (String[] args) {

    // Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
        Boat Alumacraft = new Boat("Alumacraft", 1);
        Car Mercedes = new Car("Mercedes", 1);
        System.out.println(Alumacraft.doStuff());
        System.out.println(Mercedes.doStuff());
    }
}