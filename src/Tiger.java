public class Tiger {
    // put your instance variables here!
    String name = "";
    String favoriteFood = "";

    public Tiger(String name) {
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
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
        Tiger tiger = new Tiger("Tiger");
        tiger.eat("meat");
        tiger.eat("kibble");

    }

}
