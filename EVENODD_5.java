/*QUES-5:Write a JAVA program to check whether a number is even or odd.
 * 
 */
class EVENODD_5
{
    public static void main()
    {
        evod(10);
        evod(21);
    }

    public static void evod(int a)
    {
        if(a%2==0)
        {
            System.out.println("NUMBER IS EVEN");
        }
        else
        {
            System.out.println("NUMBER IS ODD");
        }
    }
}