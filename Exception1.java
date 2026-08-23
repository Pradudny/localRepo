import java.util.Scanner;

class MinorAgeException extends RuntimeException {
    MinorAgeException() {
        super();
    }
}

public class Exception1 {
    public static void main(String[] Args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter you age :");
        int age = sobj.nextInt();

        if (age > 17) {
            System.out.println("Eligible");
        } else {
            throw new MinorAgeException();
        }
    }
}