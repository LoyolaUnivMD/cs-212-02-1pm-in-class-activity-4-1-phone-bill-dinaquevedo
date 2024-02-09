
import java.text.DecimalFormat;
import java.util.Scanner;
class phoneBill {

    public static void main(String[] args) {

        Scanner int_input = new Scanner(System.in);
        Scanner string_input = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("$#.00");

        System.out.println("Welcome to your phone bill calculator!");
        System.out.println("What was your data usage (GB) this month? ");
        int data_usage = int_input.nextInt();

        System.out.println("What subscription package do you have? (green/blue/purple) ");
        String package_type = string_input.nextLine();
        String package_lower = package_type.toLowerCase();

        if (package_lower.equals("green")){
            double base_cost = 49.99;
            double additional_cost_gb = 15.00;
            double additional_data = data_usage - 2;
            double bill = (base_cost + (additional_cost_gb * additional_data));

            System.out.println("Do you have a coupon? (y/n) ");
            String coupon = string_input.nextLine();
            if (coupon.equals("y") && bill >= 75){
                double bill_save = (bill-20);
                System.out.println("Your monthly bill is " + money.format(bill_save));
            } else {
                System.out.println("Your monthly bill is " + money.format(bill));
            }
        } else if (package_lower.equals("blue")){
            double base_cost = 70.00;
            double additional_cost_gb = 10;
            double additional_data = data_usage -3;
            double bill = (base_cost + (additional_cost_gb * additional_data));
            System.out.println("Your monthly bill is " + money.format(bill));
        } else if (package_lower.equals("purple")){
            double base_cost = 99.99;
//            double additional_cost_gb = 0;
            double bill = base_cost;
            System.out.println("Your monthly bill is " + money.format(bill));
        } else {
            System.out.println("\nInvalid package choice. Please choose Green, Blue, or Purple.");
        }

    }
}
