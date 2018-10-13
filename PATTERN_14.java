class PATTERN_14
{
    
    public static void main()
    {
        {
            int a=1,b=1,c=2,d=1;
            for(int i=1;i<=5;i++)
            {
                for(int j=8;j>=a;j--)
                {
                    System.out.print(" ");
                }
                a=a+2;
                for(int k=1;k<=b;k++)
                {
                    System.out.print("x");
                }
                b=b+2;
                System.out.println();
            }
             for(int i=1;i<=4;i++)
            {

                for(int k=1;k<=c;k++)
                {
                    System.out.print(" ");
                }
                c=c+2;
                for(int j=7;j>=d;j--)
                {
                    System.out.print("x");
                }
                d=d+2;
                
                System.out.println();

            }
        }
    }
}

// OUTPUT- 
        // x
      // xxx
    // xxxxx
  // xxxxxxx
// xxxxxxxxx
  // xxxxxxx
    // xxxxx
      // xxx
        // x
     