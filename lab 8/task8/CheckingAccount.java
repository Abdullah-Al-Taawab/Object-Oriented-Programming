public class CheckingAccount extends Account
{
  static int numberOfAccount=0;
  public  CheckingAccount(){
    super(0.0);
    numberOfAccount++;
    
  }
   public  CheckingAccount(double n){
     super (n);
     numberOfAccount++;
  }
}
  



//Number of Checking Accounts: 0
//Account Balance: 0.0
//Account Balance: 100.0
//Account Balance: 200.0
//Number of Checking Accounts: 3
