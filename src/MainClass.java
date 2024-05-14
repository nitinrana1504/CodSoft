public class MainClass {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account(123456789,"Nitin" ,500);
        ATM atm = new ATM(account);
        atm.displayMainMenu();
    }
}
