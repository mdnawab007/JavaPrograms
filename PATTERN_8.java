class PATTERN_8
{
    public static void main()
    {
        int a=1,b=1;
       for (int i=1; i<=5; i++)
        {
            for (int j=9; j >= a; j--)
            {
                System.out.print("*");
            }
            a+=2;
            System.out.println();
        }

        for (int i = 1; i <=4; i++)
        {
            for (int j = 3; j >=b; j--)
            {
                System.out.print("*");
            }
            b-=2;
            System.out.println();
        }
    }
}



