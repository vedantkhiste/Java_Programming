import java.util.Scanner;

class SequenceDemo1
{
    public static void main (String A[])
    {
     Scanner sobj = new Scanner(System.in);
     int iNo = 0;

     System.out.println("Enter your age:");
     iNo = sobj.nextInt();

     if(iNo >= 18)
     {
        System.out.println("You can Vote");
     }
     else
     {
        System.out.println("You cant vote");
     }

    }
}