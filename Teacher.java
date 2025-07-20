 public class Teacher// making a class named Teacher
{
    //declaring variables of teacher class
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private double workingHours;
    //making of constructor Teacher
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)// making constructors as indicated by the questions
    
    {
        //working with the instance variables
        this.teacherId=teacherId;
        this.teacherName=teacherName;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
    }
    //setting of getter method for the private instance variables
    public int getTeacherId()
    {
        return this.teacherId;
    }
     public String getTeacherName()
     {
        return this.teacherName;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getWorkingType()
    {
        return this.workingType;
    }

    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }

    public double getWorkingHours()
    {
        return this.workingHours;
    }
        public void setWorkingHours( double workingHours)//setter method to assign the value of workingHours
    {
        this.workingHours = workingHours;
    }
   
    public void display()//This method doesn't return but display the following outputs
    {
        //checking the requirements of the question weather working hour is assigned or not and giving off a suitabe output
        if(getWorkingHours()== 0)
        {
        System.out.println("Working houris not assigned!");
        }
        else{
        System.out.println("TeacherId is:" + getTeacherId());
        System.out.println("TeacherName is:" + getTeacherName());
        System.out.println("Address is: " + getAddress());
        System.out.println("WorkingType is: " + getWorkingType());
        System.out.println("EmploymentStatus is: " + getEmploymentStatus());
        
       }
      
    }
}

