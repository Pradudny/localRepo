import java.util.Scanner;

class Arithmatic<T>{

    T value;
    T value2;
    public Arithmatic(T value,T value2)
    {
        this.value = value;
        this.value2 = value2;
    }
    public T get1()
    {
        return value;
    }
     public T get2()
    {
        return value2;
    }
}

public class Generics{

    public static <T> void gett(T value)
    {
        System.out.println(value);;
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        // gett(1);
        // gett(true);
        // gett("hahahaha");

        Arithmatic arith = new Arithmatic(12, "hii");

        // arith.get();
        System.out.println(arith.get1());
        System.out.println(arith.get2());

    }
}