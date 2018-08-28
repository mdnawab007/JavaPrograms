/*
QUES-8:.Write a program to check whether an alphabet is vowel or consonant using if else. 
Example
Input
Input character: a
Output
'a' is vowel
Input
Input character: s
Output
's' is not vowel
*/
class VOWELCONSONANT_8
{
    public static void main()
    {
        vowel('a');
        vowel('s');
    }
    public static void vowel(char m)
    {
        if(m=='a' || m=='e' || m=='i' || m=='o' || m=='u')
        {
        System.out.println(m  + " is vowel");
    }
    else
    {
        System.out.println(m  + " is not vowel");
    }
    }
}
/*
 * OUTPUT
 * a is vowel
s is not vowel

 */