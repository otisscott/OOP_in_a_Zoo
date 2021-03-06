class Animal {
    String favoriteFood;
    String name;
    static int population;

    public Animal(String name, String favoriteFood) {
        population += 1; this.favoriteFood = favoriteFood; this.name = name;
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
    public int populationCount() {
        return population;
    }
}
