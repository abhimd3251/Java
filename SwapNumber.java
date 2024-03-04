import java.util.*;

class SwapNumber
{
    public static void main(String[]args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= sc.nextInt();
        System.out.println("enter number 2");
        int num2= sc.nextInt();
        System.out.println("the value of num1 & num2 before swaping is "+num1+":"+num2);
        
        int c=num1;
        num2=num1;
        num1=c;

        System.out.println("after swaping is "+num1 +":"+num2);
    }
}