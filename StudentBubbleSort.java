// This is similar to my 'BubbleSoort.java' program on Github. The only difference is it is a
// bubble sort algorithm for objects. The 'BubbleSort.java' program could only sort primitive
// data types (mainly numerical values). This program sorts the ATTRIBUTES of objects. In the
// case of this program, it sorts the students by their student ID. You can change the
// attribute being sorted by simply changing the getter (accessor) on line 34.

// NOTE: The Student.java class is the class in which this program depends on.

import java.util.*;

public class StudentBubbleSort
{
    public static void main(String[] args) 
    {
        Student student1 = new Student("Muadz", 10000012, 100);
        Student student2 = new Student("Yaasir", 10000001, 100);
        Student student3 = new Student("Safiyyah", 10000005, 100);
        Student student4 = new Student("Maryam", 10000009, 100);

        Student[] studentArray = {student1, student2, student3, student4};


        System.out.println("The array unsorted is: " + Arrays.toString(studentArray));
        bubbleSort(studentArray);
        System.out.println("The array sorted is: " + Arrays.toString(studentArray));
    }

    public static Student[] bubbleSort(Student[] pArray)
    {
        Student temp;

        for(int pass = 0; pass <= (pArray.length - 1) - 1; pass++)
        {
            for(int i = 0; i <= (pArray.length - 1 - pass) - 1; i++)
            {
                if(pArray[i].getStudentID() > pArray[i+1].getStudentID())
                {
                    temp = pArray[i];
                    pArray[i] = pArray[i+1];
                    pArray[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(pArray));
        }

        return pArray;
    }
}