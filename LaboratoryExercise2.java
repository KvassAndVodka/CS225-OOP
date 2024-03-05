import java.util.Scanner;

class LaboratoryExercise2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Philippine Peso: ");
        double phpAmmount = scan.nextDouble();

        final double phpRate = 43.33809;
        final double usdRate = 1.00 / phpRate;
        final double euroRate = 0.734719 / phpRate;
        final double yuanRate = 6.346934 / phpRate; 
        final double korunaRate = 18.77263 / phpRate;
        final double kroneRate = 5.449007 / phpRate;
        final double sheqelRate = 3.726334 / phpRate;
        final double dinarRate = 0.274588 / phpRate;

        double usd = phpAmmount * usdRate;
        double euro = phpAmmount * euroRate;
        double yuan = phpAmmount * yuanRate;
        double koruna = phpAmmount * korunaRate;
        double krone = phpAmmount * kroneRate;
        double sheqel = phpAmmount * sheqelRate;
        double dinar = phpAmmount * dinarRate;
        
        System.out.println("\n\nThe ammount's equivalent to:");
        System.out.println("US Dollar is :\t" + String.format("%.6f", usd));
        System.out.println("Euro         :\t" + String.format("%.6f", euro));
        System.out.println("Yuan         :\t" + String.format("%.6f", yuan));
        System.out.println("Koruna       :\t" + String.format("%.6f", koruna));
        System.out.println("Krone        :\t" + String.format("%.6f", krone));
        System.out.println("Sheqel       :\t" + String.format("%.6f", sheqel));
        System.out.println("Dinar        :\t" + String.format("%.6f", dinar));

        scan.close();
    }
}