import java.util.Scanner;

/**
 * Scanner scanner = new Scanner(system.in)
 * scanner.nextInt() - Gets Integer number from user
 * scanner.next() - Gets String from user
 */

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int adding = add(number1,number2);
        System.out.println(adding);

    }

    public static int add(int num1,int num2)
    {
        int answer = num1 + num2;
        return answer;

    }
}
