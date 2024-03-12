class ReverseNum
{
    public static void main(String[]args )
    {
        int a=4567;
        int r=0;

        do
        {
            int b=a%10;
            r= (r*10)+b;
            a=a/10;
            
        } while(a>0);
          System.out.println(r+"is reverse value");
    }
}