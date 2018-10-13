class PATTERN_17
{
    public static void main()
    {
         int a=1,b=1;
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a=a+2;
            for(int k=9;k>=b;k--)
            {
                System.out.print("x");
            }
            b=b+2;

            System.out.println();

        }
    }
}

// OUTPUT-
 // xxxxxxxxx
   // xxxxxxx
     // xxxxx
       // xxx
         // x

        
