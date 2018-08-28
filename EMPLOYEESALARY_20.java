/*
 * QUES-20:JAVA program to enter basic salary and calculate gross salary of an employee
 */
class EMPLOYEESALARY_20
{
    public static void main()
    {
    }

    public static void empsal(double basicsal)
    {
        double hra,da,grosssal;
        {
            if(basicsal<=10000)
            {
                da  = basicsal*0.8;
                hra = basicsal*0.2;
            }
            else if(basicsal<=20000)
            {
                da  = basicsal*0.9;
                hra = basicsal*0.25;
            }
            else
            {
                da  = basicsal*0.95;
                hra = basicsal*0.3;
            }
            grosssal=basicsal+hra+da;
            System.out.println("GROSS SALARY IS EQUAL TO " + grosssal);
        }
    }
}
 