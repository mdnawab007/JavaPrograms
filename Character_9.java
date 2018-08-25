/*
5.Write a program to input a character from user and check whether given character is alphabet, digit or special character using if else.
Example
Input
Input any character: 3
Output
3 is digit
Input
Input any character: R
Output
R is alphabet
Input
Input any character: %
Output
% is special character
*/

class Character_9
{
    public static void main()
    {
        character('3');
        character('r');
        character('%');
        

    }
    public static void character(char m)
    {
        if(m >= 'a' && m <= 'z')
        {
            System.out.println("Lower Case");
        }
        else if(m >= 'A' && m <= 'Z')
        {
            System.out.println("Upper Case");
        }
        else if(m >= '0' && m <= '9') 
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("SPECIAL CHARACTER");
    }
}
}
/*
 * OUTPUT
 * Digit
Lower Case
SPECIAL CHARACTER

 */