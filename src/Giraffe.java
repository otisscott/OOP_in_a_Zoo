public class Giraffe extends Animal {
    public Giraffe(String name) {
        super(name, "leaves");
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
