import java.util.*;
class Interface
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM();
        while(true)
        {
            System.out.println("\nWelcome to ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                atm.checkBalance();
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                atm.withdrawCash(withdrawAmount);
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = sc.nextDouble();
                atm.depositCash(depositAmount);
                break;
            case 4:
                System.out.println("Exiting the ATM Interface...");
                System.exit(0);
                break;
            default:
            System.out.println("Invalid choice. Please try again.");

            }
        }


    }
}
class ATM
{
    private double balance;
    public ATM()
    {
        this.balance=0;
    }
    void checkBalance()
    {
        System.out.println("Your current balance is: " + this.balance);
    }
    void withdrawCash(double amt)
    {
        if(amt>this.balance)
        {
            System.out.println("Insufficient balance. Please try again.");
        }
        else
        {
            this.balance -= amt;
            System.out.println("You have successfully withdrawn: " + amt);
            System.out.println("Your new balance is: " +this.balance);
        }
    }
    void  depositCash(double at)
    {
        this.balance+=at;
        System.out.println("Deposit successful. Your new balance is: " +this.balance);
    }


}