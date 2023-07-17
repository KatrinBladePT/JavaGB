package HWork6;

public class classCat {
    private String name;
    private int age;
    private String color;

    public classCat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        classCat cat1 = new classCat("Tom", 3, "Gray");
        classCat cat2 = new classCat("Whiskers", 5, "Orange");

        cat1.meow();
        cat1.printInfo();

        System.out.println();

        cat2.meow();
        cat2.printInfo();
    }
}
