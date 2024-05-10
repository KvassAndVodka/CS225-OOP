class Fruit {
    public void ripe() {
        System.out.println("This fruit is ripe!");
    }

    public void unripe() {
        System.out.println("This fruit is not ripe!");
    }

    public void taste() {
        System.out.println("This fruit tastes good!");
    }
}

class Apple extends Fruit {
    public void taste() {
        super.taste();
        System.out.println("Sweet, crispy, tart-like, fresh.");
    }

    public void color() {
        System.out.println("The color of this fruit is Red");
    }
}

class Orange extends Fruit {
    public void taste() {
        super.taste();
        System.out.println("Juicy, sweet, lightly acidic, refreshing, refreshing.");
    }

    public void color() {
        System.out.println("The color of this fruit is Orange");

    }
}

class Mango extends Fruit {
    public void taste() {
        super.taste();
        System.out.println("Fresh-sweet, juicy, refreshing, tropical");
    }

    public void color() {
        System.out.println("The color of this fruit is Yellow.");
    }
}

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Mango mango = new Mango();

        System.out.println("Details about Apple:");
        apple.ripe();
        apple.unripe();
        apple.taste();
        apple.color();

        System.out.println("\nDetails about Orange:");
        orange.ripe();
        orange.unripe();
        orange.taste();
        orange.color();

        System.out.println("\nDetails about Mango:");
        mango.ripe();
        mango.unripe();
        mango.taste();
        mango.color();
    }
}

