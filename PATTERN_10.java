class PATTERN_10
{
    public static void main()
    {
        int a=1,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=8;j>=a;j--)
            {
                System.out.print(" ");
            }
            a=a+2;
            for(int k=1;k<=b;k++)
            {
                System.out.print("Y");
            }
            b=b+2;
            System.out.println();
        }
    }
}
 