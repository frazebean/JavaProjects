public class DateTest 
{
    public static void main(String[] args)
    {
        Date date1 = new Date();
        Date date2 = new Date(date1);
        Date date3 = new Date(26, 10, 2004);
        Date date4 = new Date();
        date4.setDay(3);
        date4.setMonth(5);
        date4.setYear(2001);

        if(date3.equals(date4))
        {
            System.out.println("They are equal.");
        }
        else
        {
            System.out.println("They are not equal.");
        }
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
        System.out.println(date4.toString());

        System.out.println(Date.isLeapYear(2032));
    }
}
