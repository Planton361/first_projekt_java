class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        counter++;
        this.age = age;
        this.name = name;
        getNumberOfCats();
        if(counter>5){
            System.out.println("You have too many cats");
        }
        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
        // implement the static method
    }
}