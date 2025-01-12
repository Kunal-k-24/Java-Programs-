import java.util.Scanner;
public class Automated_Tailer_Machine {

    public static void main(String[] args) {
        long amt_bal=10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to Fakir Bank Of India ! ");
        System.out.println("");
        System.out.println("Please Insert Your Debit Card.");
        System.out.println("Enter Your Secret Pin : ");
        int pin = 8237;
        int pin1=sc.nextInt();
        byte ch1 = 1;
        if (pin1==pin) {
            while (ch1 == 1) {
                System.out.println("");
                System.out.println("1 - Deposit Money");
                System.out.println("2 - Withdraw Money");
                System.out.println("3 - Check Balance");
                System.out.println("4 - Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        if (amt_bal < 0) {
                            amt_bal = 0;
                        } else {
                            System.out.println("Enter Amount To Deposit : ");
                            long amt_to_dep = sc.nextLong();
                            amt_bal = amt_bal + amt_to_dep;
                            System.out.println("Balance Deposited.");
                        }
                        break;
                    case 2:
                        if (amt_bal > 0) {
                            System.out.println("Enter Amount to Withdraw: ");
                            long amt_to_with = sc.nextLong();
                            if (amt_to_with < 0) {
                                System.out.println("Cannot Withdraw Negative Amount !");
                            } else {
                                amt_bal = amt_bal - amt_to_with;
                                System.out.println("Balance Withdrawed Successfully,Collect Your Cash...");
                            }
                        } else {
                            System.out.println("Account Balance : 0");
                        }
                        break;
                    case 3:
                        if (amt_bal < 0) {
                            System.out.println("Account Balance : 0");
                        } else {
                            System.out.println("Account Balance is : " + amt_bal);
                        }
                        break;
                    case 4:
                        System.exit(0);
                }// End of Switch Case
                System.out.println("Do You Want To Perform Another Operation ?( 1-Yes / 2 - No )");
                ch1 = sc.nextByte();
                if (ch1 > 2) {
                    System.out.println("Invalid Input !");
                }
            }// End of While Loop
        }// End of if (pin1==pin)
        else {
            System.out.println("Invalid Pin !");
        }
    }// End of Main()
}
