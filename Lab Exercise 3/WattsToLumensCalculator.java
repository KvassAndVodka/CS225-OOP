import java.util.Scanner;

public class WattsToLumensCalculator {
    public static int wattsToLumens(int wattage) {
        int lumens;

        switch (wattage) {
            case 15:
                lumens = 125;
                break;
            case 25:
                lumens = 215;
                break;
            case 40:
                lumens = 500;
                break;
            case 60:
                lumens = 880;
                break;
            case 75:
                lumens = 1000;
                break;
            case 100:
                lumens = 1675;
                break;
            default:
                lumens = -1;
                break;
        }

        return lumens;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WattsToLumensCalculator calculator = new WattsToLumensCalculator();

        int wattage, lumens;

        System.out.print("Enter Watts: ");
        wattage = scan.nextInt();

        lumens = calculator.wattsToLumens(wattage);

        if (lumens != -1) {
            System.out.println(wattage + " watts is " + lumens + " lumens.");
        } else {
            System.out.println("Watts is not in the table.");
        }

        scan.close();
    }
}
