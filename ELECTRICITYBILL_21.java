/*
 * QUES-21:JAVA program to calculate electricity bill
 */
class ELECTRICITYBILL_21
{
    public static void main()
    {
        bill (100);
        bill (200);
    }

    public static void bill(double unit)
    {
        double amt,total_amt,surcharge;
        if(unit<=50)
        {
            amt=unit*0.50;
        }
        else if(unit<=150)
        {
            amt=25+((unit-50)*0.75);
        }
        else if(unit<=250)
        {
            amt=100+((unit-150)*1.20);
        }
        else
        {
            amt=220+((unit-250)*1.50);
        }
        surcharge=amt*0.20;
        total_amt=amt+surcharge;
        System.out.println("ELECTRICITY BILL=RS. " +total_amt);
    }
}

        