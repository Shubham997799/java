import java.util.*;

class Code3
{
    public int addition(int no1,int no2)
    {
        int sum = no1+no2;
        return sum;
    }
      public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);
       

        System.out.println("Enter a 1st no :");
        int iNo1= sobj.nextInt();

        System.out.println("Enter a 2nd Number :");
        int iNo2 = sobj.nextInt();


        int iAns = addition(iNo1,iNo2);  //// Call the Addition method using the obj instance

        System.out.println("Addition :" + iAns);

    }
}
