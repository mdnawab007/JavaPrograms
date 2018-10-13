class PATTERN_11
{
    public static void main()
    {
        int a=1,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=a;j--)
            {
                System.out.print(" ");
            }
            a++;
            for(int k=1;k<=b;k++)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();
        }
    }
}

// OUTPUT-

     // x
    // xx
   // xxx
  // xxxx
 // xxxxx
