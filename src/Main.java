import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hi Sir,\tPlease enter your money?");
        float initialMoney;
        initialMoney = s.nextFloat();

        System.out.println("What is the bank interest rate?");
        float interestRate;
        interestRate = s.nextFloat();
        interestRate /= 100;

        System.out.println("What is the money limit?");
        float limit;
        limit = s.nextFloat();

        byte years = 0;
        float money = initialMoney;
        while (money < limit) {
            years++;
            money += money * interestRate;
            if (years == 5) {
                money += initialMoney * interestRate;
            }
        }
        System.out.println("The number of years: " + years + '\n' + "Your Balance:        " + money);


    }
}