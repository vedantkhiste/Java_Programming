import java.util.*;

class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        int iIndex = 0, iData = 0;

        System.out.println("Enter the index number : ");
        iIndex = sobj.nextInt();

        iData = Arr[iIndex];        // Exception Prone Code

        System.out.println("Element at that index is : "+iData);
    }
}