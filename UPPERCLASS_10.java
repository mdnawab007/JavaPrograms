/*
6.Write a program to input character from user and check whether character is uppercase or lowercase alphabet using if else. 
Example
Input
Input character: C
Output
'C' is uppercase alphabet
Input
Input character: s
Output
's' is lowercase alphabet
*/
class UPPERCLASS_10
{
    public static void main()
    {
        upper('C');
        upper('s');
    }
    public static void upper(char m)
    {
        if(m>='A' && m<='Z')
        {
            System.out.println(m + " is UPPERCASE");
        }
        else 
        {
            System.out.println(m + " is LOWERCASE");
        }
    }
}
/*  
  OUTPUT
 C is UPPERCASE
s is LOWERCASE
*/       
        