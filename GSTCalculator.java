import java.util.Scanner;

class GSTCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double price = sc.nextDouble();

        System.out.print("Enter the GST percentage: ");
        double gst = sc.nextDouble();

        double gstAmount = price * gst / 100;
        double finalPrice = price + gstAmount;
        System.out.println("GST Amount = " + gstAmount);
        System.out.println("Final Price = " + finalPrice);
    }
}

