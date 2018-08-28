/* QUES-2: JAVA program to find maximum between two numbers
 * 
 */
class MAXBTWNTHREENUMB_2

{
    public static void main()
    {
        maxthree(80,90,100);
        maxthree(10,20,30);

    }

    public static void maxthree(double a,double b,double c)
    {
        if(a>b && a>c)
        { 
            System.out.println("MAX NUM IS " + a);
        }
        else if (b>a && b>c)
        {
            System.out.println("MAX NUM IS " + b);

        }

        else
        {
            System.out.println("MAX NUM IS " + c);
        }
    }
}

