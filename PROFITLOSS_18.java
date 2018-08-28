/*
 * QUES-18:JAVA program to calculate profit or loss
 */
class PROFITLOSS_18
{
    public static void main()
    {
        proloss (20,30);
        proloss (30,20);
    }

    public static void proloss (int cp,int sp)
    
    {
        int amt=0;
        if (sp>cp)
        {
            amt=sp-cp;
            System.out.println("PROFIT IS EQUAL TO " + amt);
        }
        else if (sp<cp)
        {
            amt=cp-sp;
            System.out.println("LOSS IS EQUAL TO " + amt);
        }
        else
        {
            System.out.println("NO PROFIT NO LOSS");
        }
    }
}

