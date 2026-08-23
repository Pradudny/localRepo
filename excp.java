import java.util.Scanner;

class priceOverException extends RuntimeException {

    public priceOverException() {
        super();
    }

    public priceOverException(String message) {
        super(message);
    }

    public priceOverException(Throwable cause) {
        super(cause);
    }

    public priceOverException(String message, Throwable cause) {
        super(message, cause);
    }

}

public class excp {
    public static void main(String[] a)
    {

        Scanner sobj = new Scanner(System.in);
        int price = sobj.nextInt();

        try{
            if(price > 100)
            {
                throw new priceOverException();
            } if(price < 200)
            {
                throw new priceOverException("Must be more than 333200");
            } if(price < 300)
            {
                throw new priceOverException();
            } if(price > 400)
            {
                throw new priceOverException();
            }

        }catch(RuntimeException e)
        {
            System.out.println(e+"h");
        }

        
        
    }
}