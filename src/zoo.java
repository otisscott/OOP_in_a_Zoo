public class zoo {
    public static void main(String args[]) {
        zoo test = new zoo();
        test.sleep("Tigger");
        test.eat("Tigger", "meat");
        test.eat("Tigger", "bacon");

    }


    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            sleep(name);
        }
    }


}
