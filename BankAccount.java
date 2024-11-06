import java.util.*;

public class BankAccount {
    private String AccNum;
    private double bal;
    
    public BankAccount(String AccNum, double bal) {
        this.AccNum = AccNum;
        this.bal = bal;
    }
    
    public void deposit(double amt) {
        if(amt > 0) {
            bal = amt + bal;
            System.out.println("Amount deposited : $" +amt + "successfully!" );
        }
        else{
            System.out.println("Invalid request!");
            
        }
    }
    
    public void withdraw(double amt) {
        if( amt > 0 && bal >= amt) {
            bal -= amt;
            System.out.println("Amount withdrawn: $" +amt + "successfully");
        }
        else if( amt > bal) {
            System.out.println( "Insufficient balance");
        }
        else {
            System.out.println("Invalid Request!");
            
        }
        }
        
        public double getBal() {
            return bal;
        }
        
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("Enter account number: ");
            String AccNum = sc.nextLine();
            
            System.out.println("Enter initial balance: ");
            double bal = sc.nextDouble();
    
            BankAccount bankacc = new BankAccount(AccNum, bal);
            
            while(true){
                System.out.println("Enter a request:\n 1.Deposit\n 2.Withdraw\n 3.Balance\n 4.Exit\n");
                int choice = sc.nextInt();
                
                switch(choice){
                    case 1: 
                        System.out.println("Enter the amount to be deposited: ");
                        double depositamt = sc.nextDouble();
                        bankacc.deposit(depositamt);
                        break;
                        
                    case 2:
                        System.out.println("Enter the amount to be withdrawn: ");
                        double withdrawamt = sc.nextDouble();
                        bankacc.withdraw(withdrawamt);
                        break;
                        
                    case 3:
                        System.out.println("Current balance:$ " + bankacc.getBal());
                        break;
                        
                    case 4:
                            System.out.println("Thank you for banking with us!");
                            return;
                            
                    default:
                            System.out.println("Invalid request!");
                            
                }
                
            }
        }
}
        
    
