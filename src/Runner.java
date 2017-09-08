import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        zoebot.feedAnimals(animals,"pizza");
    }
}
