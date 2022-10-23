public class Main {
    public static void main(String[] args)
    {
        int creditBalance = 5000;
        double interestRate = 0.17;
        double firstMonth = creditBalance * (1 + interestRate);
        double secondMonth = firstMonth * (1+ interestRate);
        System.out.println("Your first month balance is "+ firstMonth);
        System.out.println("Your second month balance is "+ secondMonth);
    }
}