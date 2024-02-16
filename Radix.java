import java.util.*;

class Radix
{
    public static void main(String []args)

    {
        System.out.println("Enter A no\n");

        Scanner sobj= new Scanner(System.in);
        sobj.useRadix(2);
        int x = sobj.nextInt();
        System.out.println(x);
    }
}
