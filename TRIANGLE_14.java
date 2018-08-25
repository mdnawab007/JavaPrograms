/*
10.Write a program to check whether a triangle is valid or not if angles are given using if else. 
Example
Input
Input first angle: 60
Input second angle: 30
Input third angle: 90
Output
The triangle is valid
Input
Input first angle: 10
Input second angle: 20
Input third angle: 90
Output
The triangle is not valid
*/
class TRIANGLE_14
{
    public static void main()
    {
        angle(60,30,90);
        angle(10,20,90);
        
    }
    public static void angle(int a,int b,int c)
    {
        if(a+b+c==180)
        {
            System.out.println("THE TRIANGLE IS VALID");
        }
        else
        {
            System.out.println("THE TRIANGLE IS NOT VALID");
        }
    }
}
 /*
  * OUTPUT
  * THE TRIANGLE IS VALID
THE TRIANGLE IS NOT VALID

  */