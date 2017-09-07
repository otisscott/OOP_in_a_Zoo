/* public class Bear {
    // put your instance variables here!
    String name = "";
    String favoriteFood = "";

    public Bear(String name) {
        this.name = name;
        this.favoriteFood = "fish";
    }

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            sleep();
        }
    }

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Bear bear = new Bear("Bear");
        bear.eat("fish");
        bear.eat("kibble");

    }

} */

public class Bear extends Animal {
    // complete the Bear class here, using the completed Tiger class as an example
    public Bear(String name) {
        super(name, "fish");
        this.name = name;
        this.favoriteFood = favoriteFood;
    }
    // here, we override the sleep function
    @Override
    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }
}

