class NEGATIVEPOSITIVE_3
{
    public static void main()
    {
        nepo (6);
        nepo (-10);
    }

    public static void nepo(int a)
    {
        if(a>0)
        {
            System.out.println("NUMBER IS POSITIVE");
        }
        else if(a<0)
        {
            System.out.println("NUMBER IS NEGATIVE");
        }
        else
        {
            System.out.println("NUMBER IS ZERO");
        }
    }
}