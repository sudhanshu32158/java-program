import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        String input = sc.nextLine();

        int units = Integer.parseInt(input);
        double bill;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = units * 7;
        } 
        else if (units <= 300) {
            bill = units * 10;
        } 
        else {
            bill = units * 15;
        }

        double surcharge = 0;

        if (bill > 2000) {
            surcharge = bill * 0.10;
        }

        double finalBill = bill + surcharge;

        System.out.println("Units: " + units);
        System.out.println("Bill: " + (int) bill);
        System.out.println("Surcharge: " + (int) surcharge);
        System.out.println("Final Bill: " + (int) finalBill);

        sc.close();
    }
}