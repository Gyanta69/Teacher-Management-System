/*Lecturer class is made which inherits the properties of teacher class.The term extend is 
used to apply the inheritance property in java
here   Lecturer is a subclass and Teacher is a superclass*/ 
public class Lecturer extends Teacher
{
    private String department;//Declaring private instance variables for the program
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //declaring constructure for the lecturer class
    public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,String department,int yearsOfExperience, int workingHours)
    {
    //super keyword  is used to call the constructor of the super class
     super(teacherId,teacherName,address,workingType,employmentStatus);
     // super is used to call the variable working hours from super class (Teacher) and we have set the working hour of the lecturer to 0
     super.setWorkingHours(workingHours);
     //this keyword is used to specify that you are  working with the declared instance variable rather than a local one
     this.gradedScore=0;
     this.department= department;
     this.yearsOfExperience=yearsOfExperience;
     this.hasGraded=false;
    }
    //getter method for instance variable department
    public String getDepartment()
    {
        return this.department;    
    }
    //getter method for instance variable yearsOfExpirences
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;    
    }
    //getter method for instance variable gradedScored
    public int getGradedScore()
    {
        return this.gradedScore;    
    }
    //getter method for instance variable hasGraded
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    //setter method for instance variable gradedScore
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }

    public void gradeAssignment(int gradedScore,String department,int yearsOfExperience)
    {
        {
            if(yearsOfExperience >= 5 && this.department.equals(department))//here equal keyword is used to denote that the parameter department of constructor gradeAssignment is equal to the instance variable department
            {   
                    if (gradedScore >= 70){
                        System.out.println("The grade scored is A");   
                    }
                    else if (gradedScore >= 60){
                        System.out.println("The grade scored is B");   
                    }
                    else if (gradedScore >= 50){
                        System.out.println("The grade scored is C");   
                    }
                    else if (gradedScore >= 40){
                        System.out.println("The grade scored is D");  
                    }
                    else{
                        System.out.println("The grade scored is E");   
                    }
                    //setting hasGraded as true as mentioned by the question
                    setGradedScore(gradedScore);
                    this.hasGraded=true;
            }
            else{
                    //output of the program if the grade is not assigned
                    System.out.println("The Grade is not assigned");
                }
        }
    } 
    public void display() 
    {
     /*here super keyword is used to call the display method of Teacher class which displays
     * the  teacher Id, teacher name, address, working type, working hours, and employment status*/
     super.display();
     System.out.println("Department of lecturer: " + getDepartment());
     // getDepartment() method is used to print the department of lecturer
     System.out.println("Years of Experience of lecturer: " +getYearsOfExperience());
     //getYearsOfExperience() is used to print the years of expirence of lecturer
     
     /*This if else condition is used to give the output as the obtained
     * grade or if the grade is assigned yet or not*/
    if (hasGraded) 
    {
        System.out.println("Your graded marks is :"+ getGradedScore());
    } else
    {
        System.out.println("Grades are not assigned yet");
    }
    }
}
    
    
    

