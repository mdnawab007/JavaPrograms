/*
8.Write a program to enter month number between(1-12) and print number of days in month using if else. 
Example
Input
Enter month number: 1
Output
It contains 31 days.
Input
Enter month number: 11
Output
It contains 30 days.
 */
class MONTHNO_8
{
    public static void main()
    {
        mot(1);
        mot(11);
        mot(2);
    }

    public static void mot(int month)
    {
        if(month==1 || month == 3 || month==5 || month==7 || month==8 || month==10 || month==12 )
        {
            System.out.println("IT CONTAINS 31 DAYS");
        }

        else if(month==2)
        {
            System.out.println("it contains 28 or 29 days");
        }
        else
        {
            System.out.println("it contains 30 days");
        }
    }
}
/*
 * OUTPUT
 * IT CONTAINS 31 DAYS
it contains 30 days
it contains 28 or 29 days

 */

