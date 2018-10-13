class PATERRN_19
{
    public static void main()
    { 
        int a=1,b=1,c=1,d=3;
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

        for(int i=1;i<=4;i++)
        {
            for(int j=7;j>=c;j--)
            {
                System.out.print(" ");
            }
            c=c+2;
            for(int k=1;k<=d;k++)
            {
                System.out.print("x");
            }
            d=d+2;
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
       // xxx
     // xxxxx
   // xxxxxxx
 // xxxxxxxxx

