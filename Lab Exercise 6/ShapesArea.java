import java.util.Scanner;

class Shape {
    public double getSquareArea(double side) {
        return side * side;
    }

    public double getRectangleArea(double length, double width) {
        return length * width;
    }

    public double getTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public double getCircleArea(double radius) {
        return (3.1415926 * radius * radius);
    }
}

public class ShapesArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shape shape = new Shape();
        
        System.out.println(   "Area Calculator\n1. Square\n2. Rectable\n3. Triangle\n4. Circle \n");
        System.out.print("Input:");
        int input = scan.nextInt();
        
        switch(input) {
            case 1:
                System.out.print("Square side: ");
                double squareSide = scan.nextDouble();
                System.out.println("The area of the square is: " + shape.getSquareArea(squareSide));
                break;
            case 2:
                System.out.print("Rectangle Length: ");
                double rectangleLength = scan.nextDouble();
                System.out.print("Rectangle Height: ");
                double rectangleHeight = scan.nextDouble();
                System.out.println("The area of the rectangle is: " + shape.getRectangleArea(rectangleLength, rectangleHeight));
                break;
            case 3:
                System.out.print("Triangle base: ");
                double triangleBase = scan.nextDouble();
                System.out.print("Triangle Height: ");
                double triangleHeight = scan.nextDouble();
                System.out.println("The area of the triangle is: " + shape.getTriangleArea(triangleBase, triangleHeight));
                break;
            case 4:
                System.out.print("Circle radius: ");
                double circleRadius = scan.nextDouble();
                System.out.println("The area of the circle is: " + shape.getCircleArea(circleRadius));
                break;
            default:
                System.out.println("Input incorrect!");
                break;
            }

        scan.close();
    }
}