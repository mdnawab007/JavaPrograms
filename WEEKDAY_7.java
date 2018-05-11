/*
7.Write a program to input week number(1-7) and print the corresponding day of week name using if else.
Example
Input
Input week number: 1
Output
Monday
Input
Input week number: 5
Output
Friday
*/  

class WEEKDAY_7
{
    public static void main()
    {
        week(5);
        week(7);
        
    }
    public static void week(int day)
    {
        if(day==1)
        {
            System.out.println("MONDAY");
        }
        else if(day==2)
        {
            System.out.println("TUESDAY");
        }
        else if(day==3)
        {
            System.out.println("WEDNESDAY");
        }
        else if(day==4)
        {
            System.out.println("THURSDAY");
        }
        else if(day==5)
        {
            System.out.println("FRIDAY");
        }
        else if (day==6)
        {
            System.out.println("SATURDAY");
        }
        else if(day==7)
        {
            System.out.println("SUNDAY");
        }
    }
}
/*
 * OUTPUT
 * FRIDAY
SUNDAY

 */
    