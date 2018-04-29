import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstN, secondN, thirdN, denominator, sum;

        System.out.println("Hello user, this program is used to add together fractions that have the same DENOMINATOR.\n");

        System.out.println("Please insert the denominator: ");
        denominator = scan.nextInt();

        System.out.println("Please insert the first nominator: ");
        firstN = scan.nextInt();

        System.out.println("Please insert the second nominator: ");
        secondN = scan.nextInt();

        System.out.println("Please insert the third nominator: ");
        thirdN = scan.nextInt();

        sum = firstN+secondN+thirdN;

        System.out.println("The answer is: \n\n "+sum+" \n-----\n "+denominator+"\n\n");
    }
}
