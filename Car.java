// Crée une classe Car qui étend la classe Vehicle
public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }
    @Override 
    public String doStuff() {
        return "Je suis un(e) " + getBrand() + " et je fais vroum vroum !";
    }
}