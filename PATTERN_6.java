class PATTERN_6
{
    public static void main()
    {
    int a=1,b=7;   
    for (int i = 1; i <=5; i++) 
        {
            for (int j = 1; j <= a; j++) 
            { 
                System.out.print("*"); 
            } 
            a+=2;
             
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
         
        for (int i = 4; i >= 1; i--)
        {
            for (int j = 1; j <= b; j++)
            {
                System.out.print("*");
            }
            b-=2; 
            System.out.println();
        }
    }
}
         

