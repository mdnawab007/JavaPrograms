/*
3.Write a program to input a character from user and check whether the given character is alphabet or not using if else. 
Example
Input
Input character: a
Output
'a' is alphabet
Input
Input character: &
Output
'&' is not alphabet
*/

class ALPHABET_3
{
    public static void main()
    {
        charac('a');
        charac('&');
    }
    public static void charac(char m)
    {
        if(m>='a' && m<='z' || m>='A' && m<='z')
        {
            System.out.println(m + " is alphabet");
        }
        else
        {
            System.out.println(m + " is not alphabet");
        }
    }
}
/*
 * OUTPUT
 * a is alphabet
& is not alphabet

 */