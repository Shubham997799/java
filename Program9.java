import java.util.*;

class Program9
{   
    public static int add(int iValue1 , int iValue2)
    {
        int iResAdd= iValue1+iValue2;

        return iResAdd;
    }

    public static int sub(int iValue3 , int iValue4)
    {
        int iResSub;
        if(iValue3>iValue4)
        {
            iResSub= iValue3-iValue4;
        }
        else
        {
            iResSub= iValue4-iValue3;
        }

        return iResSub;
    }

    public static int mul(int iValue5 , int iValue6)
    {
        int iResMul= iValue5*iValue6;

        return iResMul;
    }

    public static int divi(int iValue7 , int iValue8)
    {
        int iResDiv;
        if(iValue7>iValue8)
        {
            iResDiv= iValue7/iValue8;
        }
        else
        {
            iResDiv= iValue8/iValue7;
        }

        return iResDiv;
    }
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a 1st no:");
        int iNo1=sobj.nextInt();

        System.out.println("Enter a 2nd No :");
        int iNo2 = sobj.nextInt();

        int iAddition= add(iNo1,iNo2);
        int iSubstraction= sub(iNo1,iNo2);
        int iProduct= mul(iNo1,iNo2);
        int iDivision= divi(iNo1,iNo2);

        System.out.println("Addition : " + iAddition);
        System.out.println("Difference : " + iSubstraction);
        System.out.println("Product  : " + iProduct);
        System.out.println("Division  : " + iDivision);


    }

   
}
