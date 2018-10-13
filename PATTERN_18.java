class PATTERN_18
{
    public static void main()
    {
        int a=1,b=1,c=1,d=2;
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a++;
            for(int k=5;k>=b;k--)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=c;j--)
            {
                System.out.print(" ");
            }
            c++;
            for(int k=1;k<=d;k++)
            {
                System.out.print("x");
            }
            d++;
            System.out.println();
        }
    }
}

// OUTPUT-
 // xxxxx
  // xxxx
   // xxx
    // xx
     // x
    // xx
   // xxx
  // xxxx
 // xxxxx



