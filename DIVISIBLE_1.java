/*
1. Write a program to check whether a number is divisible by 5 and 11 or not using if else.  
Example
Input 1
Input number: 55
Output
Number is divisible by 5 and 11
Input 2
Input number: 45
Output
Number is not divisible by 5 and 11
*/
class DIVISIBLE_1
{
    public static void main()
    {
        divisible5_11(55);
        divisible5_11(45);
        
    }
    
    public static void divisible5_11(int a)
    {
        if(a%5==0 && a%11==0)
        {
            System.out.println("NUMBER IS DIVISIBLE BY 5 AND 11");
        }
        else 
        {
            System.out.println("NUMBER IS NOT DIVISIBLE BY 5 AND 11");
        }
    }
    
    
    
    
}
 /* OUTPUT
  * NUMBER IS DIVISIBLE BY 5 AND 11
NUMBER IS NOT DIVISIBLE BY 5 AND 11
  */      
        