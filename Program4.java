import java.util.*;

class Code3
{
    public int Addition(int no1,int no2)
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

        Code3 obj = new Code3();   //// Create an instance of the Code3 class

        int iAns = obj.Addition(iNo1,iNo2);  //// Call the Addition method using the obj instance

        System.out.println("Addition :" + iAns);

    }
}
