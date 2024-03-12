class PrintOneDigitalNumUsingDoWhile 
{
    public static void main(String[]args )
    {
        int a=2345;

        do
        {
            int r=a%10;
            System.out.println(r);
            a=a/10;
        } while(a>0);

        
    }
}