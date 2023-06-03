public class Student
{
    private String name;
    private int studentID;
    private double mark;

    // Acccessor for 'name' class field.
    public String getName()
    {
        return name;
    }

    // Mutator for 'name' class field.
    public void setName(String pName)
    {
        if(pName == "")
        {
            System.out.println("Name cannot be blank.");
        }
        else
        {
            name = pName;
        }
    }

    // Accessor for 'studentID' class field.
    public int getStudentID()
    {
        return studentID;
    }

    // Mutator for 'studentID' class field.
    public void setStudentID(int pStudentID)
    {
        if(pStudentID < 10000000 || pStudentID > 99999999)
        {
            System.out.println("Invalid student ID entered.");
        }
        else
        {
            studentID = pStudentID;
        }
    }

    // Accessor for 'mark' class field.
    public double getMark()
    {
        return mark;
    }

    // Mutator for 'mark' class field.
    public void setMark(double pMark)
    {
        if(pMark < 0 || pMark > 100)
        {
            System.out.println("Invalid mark entered.");
        }
        else
        {
            mark = pMark;
        }
    }

    // Constructor with parameters
    public Student(String pName, int pStudentID, double pMark)
    {
        if(pName == "")
        {
            System.out.println("Name cannot be blank.");
        }
        else
        {
            name = pName;
        }

        if(pStudentID < 10000000 || pStudentID > 99999999)
        {
            System.out.println("Invalid student ID entered.");
        }
        else
        {
            studentID = pStudentID;
        }

        if(pMark < 0 || pMark > 100)
        {
            System.out.println("Invalid mark entered.");
        }
        else
        {
            mark = pMark;
        }
    }

    // Copy constructor
    public Student(Student pStudent)
    {
        name = pStudent.getName();
        studentID = pStudent.getStudentID();
        mark = pStudent.getMark();
    }

    // Default constructor
    public Student()
    {
        name = "John Doe";
        studentID = 10000000;
        mark = 100;
    }

    // 'toString' accessor method
    public String toString()
    {
        String studentString;

        studentString = "Name is: " + name +
                        "\nStudent ID is: " + studentID +
                        "\nMark is " + mark;

        return studentString;
    }

    // 'equals' accessor method
    public boolean equals(Object inObject)
    {
        boolean isEqual = false;
        Student inStudent = null;

        if(inObject instanceof Student)
        {
            inStudent = (Student)inObject;
            if(name.equals(inStudent.getName()))
            {
                if(studentID == inStudent.getStudentID())
                {
                    if(mark == inStudent.getMark())
                    {
                        isEqual = true;
                    }
                }
            }
        }
        return isEqual;
    }

    // Regular method to return grade equivalent of mark.
    public String getGrade()
    {
        String grade = "";

        if(mark >= 0 && mark <= 49.99)
        {
            grade = "N";  // Fail
        }
        else if(mark >= 50 && mark <= 62.99)
        {
            grade = "P"; // Pass
        }
        else if(mark >= 63 && mark <= 72.99)
        {
            grade = "C"; // Credit
        }
        else if(mark >= 73 && mark <= 82.99)
        {
            grade = "D"; // Distinction
        }
        else if(mark >= 83 && mark <= 100)
        {
            grade = "HD"; // High Distinction
        }

        return grade;
    }

    // Regular method to return object as String in a CSV-formatted row.
    public String toFileString()
    {
        String csvName = name;
        int csvStudentID = studentID;
        double csvMark = mark;

        String csvFormat = csvName + "," + csvStudentID + "," + csvMark;

        return csvFormat;
    }
}