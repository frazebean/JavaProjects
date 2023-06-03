// This is a program that performs secondary sorting on dates. Secondary sorting is
// basically when you sort multiple values. In the case of this program, it sorts
// day, month and year of a date into the correct order. The sorting algorithm used in this
// program is bubble sort. Insertion sort can also be used. Just don't use selection sort
// as it does not retain the order of key-values.

import java.util.*;

public class SecondarySorting
{
    public static void main(String[] args) 
    {
        Date date1 = new Date(26, 10, 2004);
        Date date2 = new Date(2, 10, 2004);
        Date date3 = new Date(21, 11, 2010);
        Date date4 = new Date(17, 5, 2013);
        Date date5 = new Date(1, 5, 1979);
        Date date6 = new Date(20, 7, 1979);
        Date date7 = new Date(4, 6, 2023);
        Date date8 = new Date(3, 6, 2023);

        Date[] dateArray = {date1, date2, date3, date4, date5, date6, date7, date8};

        System.out.println("The unsorted array is: " + Arrays.toString(dateArray));
        bubbleSortDay(dateArray);
        bubbleSortMonth(dateArray);
        bubbleSortYear(dateArray);
        System.out.println("The sorted array is: " + Arrays.toString(dateArray));
    }

    public static Date[] bubbleSortDay(Date[] pArray)
    {
        Date temp;

        for(int pass = 0; pass <= (pArray.length - 1) - 1; pass++)
        {
            for(int i = 0; i <= (pArray.length - 1 - pass) - 1; i++)
            {
                if(pArray[i].getDay() > pArray[i+1].getDay())
                {
                    temp = pArray[i];
                    pArray[i] = pArray[i+1];
                    pArray[i+1] = temp;
                }
            }
        }

        return pArray;
    }
    public static Date[] bubbleSortMonth(Date[] pArray)
    {
        Date temp;

        for(int pass = 0; pass <= (pArray.length - 1) - 1; pass++)
        {
            for(int i = 0; i <= (pArray.length - 1 - pass) - 1; i++)
            {
                if(pArray[i].getMonth() > pArray[i+1].getMonth())
                {
                    temp = pArray[i];
                    pArray[i] = pArray[i+1];
                    pArray[i+1] = temp;
                }
            }
        }

        return pArray;
    }
    public static Date[] bubbleSortYear(Date[] pArray)
    {
        Date temp;

        for(int pass = 0; pass <= (pArray.length - 1) - 1; pass++)
        {
            for(int i = 0; i <= (pArray.length - 1 - pass) - 1; i++)
            {
                if(pArray[i].getYear() > pArray[i+1].getYear())
                {
                    temp = pArray[i];
                    pArray[i] = pArray[i+1];
                    pArray[i+1] = temp;
                }
            }
        }

        return pArray;
    }
}