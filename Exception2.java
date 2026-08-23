import java.util.Scanner;

class MinorAgeException extends RuntimeException {
    
    MinorAgeException() {
        super();
    }
    MinorAgeException(String message) {
        super(message);
    }
    MinorAgeException(Throwable cause) {
        super(cause);
    }
    MinorAgeException(String message ,Throwable cause){
        super(message ,cause);
    }
}

public class Exception2 {
    public static void main(String[] Args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter you age :");
        int age = sobj.nextInt();

       try{if (age > 17) {
            System.out.println("Eligible");
        } else {
            throw new MinorAgeException();
        }}catch(MinorAgeException e){

            System.out.println("Age must be more than 18" + e);
        }
    }
}