class BuzzNumUsingDoWhile
{
    public static void main(String[]args )
    {
        int a=10;
        do
        {
            if (a%10==7||a%7==0)
            {
                System.out.println(a);
            }
            a++;
        } while(a<=100);
        
    }
}