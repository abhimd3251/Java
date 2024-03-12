class PrintEvenNumUsingDoWhile
{
    public static void main(String[]args )
    {
        int a=2345;

        do
        {
            int b=a%10;
            if(b%2==0)
            {
                System.out.println(b);
            }
            a=a/10;
        } 
        while(a>0);
    }
}