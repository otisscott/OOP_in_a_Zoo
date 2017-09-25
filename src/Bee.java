public class Bee extends Animal {

    public Bee(String name) {
        super(name, "pollen");
        this.favoriteFood = favoriteFood;
    }
    @Override
    public void sleep() {
        System.out.println(name + " never sleeps");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        }
        else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
