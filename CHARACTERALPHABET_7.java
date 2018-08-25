class CHARACTERALPHABET_7
{
    public static void main()
    {
        charalpha ('m');
        charalpha ('d');
        charalpha ('6');
    }

    public static void charalpha(char m)
    {
        if(m >= 'a'  &&  m<='z')
        {
            System.out.println("CHARACTER IS A ALPHABET");
        }
        else if (m>='A'  &&  m<='Z')
        {
            System.out.println("CHARACTER IS  ALPHABET");
        }
        else
        {
            System.out.println("CHARACTER IS NOT ALPHABET");
        }
    }
}