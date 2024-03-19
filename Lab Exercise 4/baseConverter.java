import java.util.Scanner;

public class baseConverter {
    static void decimalToBinary(int decimalValue){
        int[] binaryArray = new int[32];
        int count = 0, num = decimalValue;

        while (decimalValue > 0){
            binaryArray[count++] = decimalValue % 2;
            decimalValue /= 2;
        }

        System.out.print("Equivalent of " + num + " in binary is ");
        for (int i = count - 1; i >= 0; i--){
            System.out.print(binaryArray[i]);
        }
        System.out.println();
    }

    static void decimalToOctal(int decimalValue){
        int[] octalArray = new int[100];
        int count = 0, num = decimalValue;

        while (decimalValue > 0){
            octalArray[count++] = decimalValue % 8;
            decimalValue /= 8;
        }

        System.out.print("Equivalent of " + num + " in binary is ");
        for (int i = count - 1; i >= 0; i--){
            System.out.print(octalArray[i]);
        }
        System.out.println();
    }

    static void decimalToHexadecimal(int decimalValue){
        char[] hexadecimalArray = new char[100];
        int count = 0, num = decimalValue;

        while (decimalValue != 0) {
            int remainder = decimalValue % 16;
            if (remainder < 10) {
                hexadecimalArray[count++] = (char) (remainder + 48); 
            } 
            else {
                hexadecimalArray[count++] = (char) (remainder + 55);
            }
            decimalValue /= 16;
        }

        System.out.print("Equivalent of " + num + " in hexadecimal is ");
        for (int i = count - 1; i >= 0; i--){
            System.out.print(hexadecimalArray[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a positive decimal value: ");
        int decValue = scan.nextInt();

        System.out.print("Value to which number system:"
                        + "\n1 - Decimal to Binary" 
                        + "\n2 - Decimal to Octal"
                        + "\n3 - Decimal to Hexadecimal"
                        + "\nEnter Choice: ");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                decimalToBinary(decValue);
                break;
            case 2:
                decimalToOctal(decValue);
                break;
            case 3:
                decimalToHexadecimal(decValue);
                break;
            default:
                System.out.println("Invalid Input");
        }
        scan.close();
    }   
}
