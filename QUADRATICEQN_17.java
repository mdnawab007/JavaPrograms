/*
 * QUES-17:JAVA program to find all roots of a quadratic equation
 */
class QUADRATICEQN_17
{
    public static void main()
    {
        quad (0,1,2);
        quad (2,3,-3);
        quad (-2,0,3);
    }

    public static void quad(double a,double b,double c)
    {
        double root1, root2, imaginary;
        double discriminant;
        discriminant = (b * b) - (4 * a * c);
        if(discriminant > 0)
        {
            root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            root2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.println ("Two distinct and real roots exists:" + root1+","+root2);
        }
        else if(discriminant == 0)
        {
            root1 = root2 = -b / (2 * a);

            System.out.println("Two equal and real roots exists: " + root1+","+root2);
        }
        else if(discriminant < 0)
        {
            root1 = root2 = -b / (2 * a);
            imaginary = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Two distinct complex roots exists:" +root1+","+imaginary+","+root2+","+imaginary);

        }
    }
}
