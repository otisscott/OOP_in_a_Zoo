public class Unicorn extends Animal {

    public Unicorn(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "marshmallows");
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }
}
