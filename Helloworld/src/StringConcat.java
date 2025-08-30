import java.util.Scanner;

/**
 * System.out.print(conc(firstname,lastname)); can also be used
 */

public class StringConcat{

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first name");
    String firstname = scanner.next();
    System.out.print("Enter last name");
    String lastname = scanner.next();
    String name = conc(firstname, lastname);
    System.out.println(name);
    /**
     * System.out.print(conc(firstname,lastname)); can also be used
     */

}
    public static String conc(String fname,String lname)
    {
    /**
       return fname + " " + lname; can be written like this as well
     */
    String nam = fname.concat(lname);
    return nam;
    }

}
