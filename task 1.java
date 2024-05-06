import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("What time of day are we?");
        String time = s.next();
        System.out.println("How old are you?");
        byte age = s.nextByte();

        System.out.println("Which do you prefer performance or clean code?");
        System.out.println("P : performance  |  C : clean code");
        char c = s.next().charAt(0);
        if (c == 'P') {
            /* ******************************************** */
            /* *************** Performance **************** */
            /* ******************************************** */

            // Option 1
            if (time.equals("morning") || time.equals("evening")) {
                System.out.print("Good " + time + ", ");
            } else {
                System.out.println("Hi, ");
            }

            if (age <= 0) {
                System.out.println("Wrong age!");
            } else if (age > 30) {
                System.out.println("you are getting older " + name + '.');
            } else if (age > 20) {
                System.out.println("you are young " + name + '.');
            } else {
                System.out.println("you are very young " + name + '.');
            }

            // Option 2
            if (age <= 0) {
                System.out.println("Wrong age!");
            } else {
                if (time.equals("morning") || time.equals("evening")) {
                    System.out.print("Good " + time + ", ");
                } else {
                    System.out.print("Hi, ");
                }

                if (age > 30) {
                    System.out.println("you are getting older " + name + '.');
                } else if (age > 20) {
                    System.out.println("you are young " + name + '.');
                } else {
                    System.out.println("you are very young " + name + '.');
                }
            }
        } else {
            /* ******************************************** */
            /* *************** Clean Code ***************** */
            /* ******************************************** */
            // Option 1

            boolean checkTime = time.equals("morning");
            checkTime |= time.equals("evening");
            //boolean checkTime = time.equals("morning") || time.equals("evening");
            if (checkTime) {
                System.out.print("Good " + time + ", ");
            } else {
                System.out.print("Hi, ");
            }

            if (age > 0 && age <= 20) {
                System.out.println("you are very young " + name + '.');
            } else if (age > 20 && age <= 30) {
                System.out.println("you are young " + name + '.');
            } else if (age > 30) {
                System.out.println("you are getting older " + name + '.');
            } else {
                System.out.println("Wrong age!");
            }
        }
    }
}