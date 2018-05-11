class electricitybill
{
    public static void main(double unit)
    {
        double amto;
        double surcharge,total;
        if(unit<=50)
        {
            amto=unit*0.50;
        }
        else if(unit<=150)
        {
            amto=unit*0.75;
        }
        else 
        {
            amto=unit*1.20;
        }

        surcharge=amto*0.20;
        total=amto+surcharge;
        System.out.println(""+total);
    }
}