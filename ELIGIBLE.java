class ELIGIBLE
{
    public static void elig(int a)
    {

        if (a>18)
        {
            System.out.println("ELIGIBLE FOR VOTE");
        }
        else
        {
            System.out.println("NOT ELIGIBLE FOR VOTE");
        }
    }

    public static void main()
    {
        elig (18);
        elig (20);
    }
}
