/*
2.Write a program to check leap year using if else. 
Example
Input
Input year: 2004
Output
2004 is leap year.
Input
Input year: 2005
Output
2005 is not a leap year.
*/


class LEAPYEAR_6
{
    public static void main()
    {
        leap(2004);
        leap(2005);
        leap(2007);

    }

    public static void leap(int year)
    {
        if(year%4==0)
        {
            System.out.println(year + " IS LEAP YEAR");
        }
        else
        {
            System.out.println(year + " IS NOT LEAP YEAR");
        }

    }
}
/* 
  OUTPUT
 2004 IS LEAP YEAR
2005 IS NOT LEAP YEAR
2007 IS NOT LEAP YEAR

 */

