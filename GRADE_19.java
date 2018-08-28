/*
 * QUES-19:JAVA program to enter student marks and find percentage and grade
 */
class GRADE_19
{
    public static void main()
    {
        grade(50,40,60,70,80);
        grade(99,95,95.5,99.0,91);
    }

    public static void grade(double phy,double chem,double bio,double maths,double comp )
    {
        double per;
        per=(phy+chem+bio+maths+comp)/5.0;
        System.out.println("PERCENTAGE " + per);

        if(per>=90)
        {
            System.out.println("GRADE A");
        }
        else if(per>=80)
        {
            System.out.println("GRADE B");
        }
        else if(per>=70)
        {
            System.out.println("GRADE C");
        }
        else if(per>=60)
        {
            System.out.println("GRADE D");
        }
        else if(per>=50)
        {
            System.out.println("GRADE E");
        }
        else if(per>=40)
        {
            System.out.println("GRADE F");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}

    
