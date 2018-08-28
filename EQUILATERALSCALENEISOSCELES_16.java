/*
 * QUES-16:JAVA program to check whether triangle is equilateral, scalene or isosceles
 */
class EQUILATERALSCALENEISOSCELES_16
{
    public static void main()
    {
        equ (50,50,50);
        equ (70,70,50);
        equ (50,60,70);
    }
    public static void equ(int side1,int side2,int side3)
    {
        if(side1==side2 || side2==side3 || side3==side1)
        {
            System.out.println("TRIANGLE IS EQUILATERAL");
        }
        else if(side1 == side2 || side1 == side3 || side2 == side3)
        {
            System.out.println("TRIANGLE IS ISOSCELES");
        }
        else 
        {
            System.out.println("TRIANGLE IS SCALENE");
        }
    }
}