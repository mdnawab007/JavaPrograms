/*
 * QUES-15:Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
 * 
 */
class TRIANGLESIDES_15
{
    public static void main()
    {
        sides (5,5,6);
        sides (5,2,100);
    }
    public static void sides(int a,int b,int c)
    {
        if(b+c>a && a+c>b && a+b>c)
        {
            System.out.println("TRIANGLE IS VALID");
        }
        else
        {
            System.out.println("TRIANGLE IS NOT VALID");
        }
    }
}