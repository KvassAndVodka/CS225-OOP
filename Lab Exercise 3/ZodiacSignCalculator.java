import java.util.Scanner;

public class ZodiacSignCalculator {
    public String getZodiacSign(int month, int day) throws InvalidDateException {        
        if (month < 1 || month > 12 || day < 1 || day > 31 || (month == 2 && day > 29)
            || (month % 2 == 1 && day > 31) || (month % 2 == 0 && day > 30)) {
            throw new InvalidDateException();
        }

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } 
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } 
        else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } 
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        }
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } 
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } 
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } 
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } 
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } 
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } 
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } 
        else {
            return "Capricorn";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ZodiacSignCalculator calculator = new ZodiacSignCalculator();

        String monthString = "";
        int month = 0, day = 0;

        try {
            System.out.print("Enter Month: ");
            month = scan.nextInt();
            System.out.print("Enter Day: ");
            day = scan.nextInt();


            switch(month) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
            }

            String zodiacSign = calculator.getZodiacSign(month, day);
            System.out.println("Zodiac Sign for " + monthString + " " + day + " is " + zodiacSign);
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scan.close();
    }
}
