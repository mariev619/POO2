
    // Crée une classe abstraite Vehicle
public abstract class Vehicle {

    // Ajoute les attributs String brand et int kilometers
    private String brand;
    private int kilometers;
    
    // Crée un constructeur permettant d'initialiser brand et kilometers
    public Vehicle (String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }


    // Ajoute des getters et setters pour tous les attributs, en respectant les conventions
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setKilometers (int kilometers) {
        this.kilometers = kilometers;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getKilometers() {
        return this.kilometers;
    }

    // Ajoute dans Vehicle la méthode abstraite public String doStuff()
    public abstract String doStuff();

    // Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff(). Pour Car, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour Boat : "Je suis {brand} et je fais glou glou !"

    // Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
    // Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
    // Partage le lien du dépôt GitHub en solution
}