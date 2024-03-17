import java.util.Scanner;

public class Compare1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        while (scan != 10) {

           if  (scan == 1) {

               System.out.println("Monday");
              // break;
               double amount = sc.nextInt();
               System.out.println("Balance" + amount);
               scan = sc.nextInt();
           }
                if(scan == 2) {
               System.out.println("Tuesday");
               scan = sc.nextInt();


           }
           if(scan == 3) {
               System.out.println("Wednesday");
               scan = sc.nextInt();

           }
            if(scan == 4) {
                System.out.println("Thursday");
                scan = sc.nextInt();

            }
            if(scan == 5) {
                System.out.println("Friday");
                scan = sc.nextInt();

            }
            if(scan == 6) {
                System.out.println("Saturday");
                scan = sc.nextInt();

            }
            if(scan == 7) {
                System.out.println("ThursdayNot");
                scan = sc.nextInt();

            }
            if(scan == 8) {
                System.out.println("Sunday");
                scan = sc.nextInt();

            }
            if(scan == 9) {
                System.out.println("Thursday");
                scan = sc.nextInt();

            }
            if(scan == 10) {
                break;
            }

            }
        }
    }


