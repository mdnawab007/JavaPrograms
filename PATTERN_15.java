class PATTERN_15
{
    public static void main()
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=a;j--)
            {
                System.out.print(" ");
            }
            a++;
            {
                for(int k=1;k<=5;k++)
                {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
    }
}

// OUTPUT-
    // XXXXX
   // XXXXX
  // XXXXX
 // XXXXX
// XXXXX
