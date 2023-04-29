public class Date 
{
    // Class fields
    private int day;
    private int month;
    private int year;

    // Accessor
    public int getDay()
    {
        return day;
    }

    // Mutator
    public void setDay(int pDay)
    {
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(pDay < 0 || pDay > 31)
                {
                    System.out.println("Invalid number of days for given month.");
                }

            case 9: case 4: case 6: case 11:
                if(pDay < 0 || pDay > 30)
                {
                    System.out.println("Invalid number of days for given month.");
                }

            case 2:
                if(isLeapYear(year))
                {
                    if(pDay < 0 || pDay > 29)
                    {
                        System.out.println("Invalid number of days for leap-year February.");
                    }
                    else
                    {
                        if(pDay < 0 || pDay > 28)
                        {
                            System.out.println("Invalid number of days for non leap-year February.");
                        }
                    }
                }

            default:
                day = pDay;
        }
    }

    // Accessor
    public int getMonth()
    {
        return month;
    }

    // Mutator
    public void setMonth(int pMonth)
    {
        if(pMonth < 0 || pMonth > 12)
        {
            System.out.println("Month cannot be less than 0 or more than 12.");
        }
        else
        {
            month = pMonth;
        }
    }

    // Accessor
    public int getYear()
    {
        return year;
    }

    // Mutator
    public void setYear(int pYear)
    {
        if(pYear < 0)
        {
            System.out.println("Year cannot be a negative number.");
        }
        else
        {
            year = pYear;
        }
    }

    // Method for isLeapYear
    public static boolean isLeapYear(int pYear)
    {
        if(pYear % 100 == 0)
        {
            if(pYear % 400 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(pYear % 4 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    // Method for getSuffix
    public String getSuffix(int pDay)
    {
        switch(pDay)
        {
            case 1: case 21: case 31:
                return "st";
            case 2: case 22:
                return "nd";
            case 3: case 23:
                return "rd";
            default:
                return "th";
        }
    }

    // Constructor with parameters
    public Date(int pDay, int pMonth, int pYear)
    {
        day = pDay;
        month = pMonth;
        year = pYear;
    }

    // Copy constructor
    public Date(Date pDate)
    {
        day = pDate.getDay();
        month = pDate.getMonth();
        year = pDate.getYear();
    }

    // Default constructor
    public Date()
    {
        day = 1;
        month = 1;
        year = 2023;
    }

    // toString Accessor
    public String toString()
    {
        String dateString;
        
        dateString = "Date is " + day + "/" + month + "/" + year;
        return dateString;
    }

    // equals Accessor
    public boolean equals(Object inObject)
    {
        boolean isEqual = false;
        Date inDate = new Date();
        if(inObject instanceof Date)
        {
            if(day == inDate.getDay())
            {
                if(month == inDate.getMonth())
                {
                    if(year == inDate.getYear())
                    {
                        isEqual = true;
                    }
                }
            }
        }
        return isEqual;
    }
}
