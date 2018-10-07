class PATTERN_4
{
    public static void main()
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=9;j>=a;j--)
            {
                System.out.print("*");
            }
            a=a+2;
            System.out.println();
        }
    }
}