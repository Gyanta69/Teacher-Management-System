/*Tutor class is made which inherits the properties of teacher class.The term extend is 
used to apply the inheritance property in java
here   Tutor is a subclass and Teacher is a superclass*/ 
public class Tutor extends Teacher
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    //constructors for the Tutor class
    public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHours,double salary,String specialization,String academicQualifications,int performanceIndex){
        //calling the constructor of Teacher class
        super(teacherId,teacherName,address,workingType,employmentStatus);
        //This calls the setWorkingHours method of teacher class and sets the  workinghour of tutor 
        super.setWorkingHours(workingHours);
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualifications=academicQualifications;
        this.performanceIndex=performanceIndex;
        //setting the isCertified to false
        this.isCertified=false;
        
    }
    //making of getter methods
    public double getSalary(){
        return this.salary;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public String getAcademicQualifications(){
        return this.academicQualifications;
    }
    public int getPerformanceIndex(){
        return this.performanceIndex;
    }
    public boolean getIsCertified(){
        return this.isCertified;
    }
    //creating a method to set new salary and new performing index
    public void setSalary(double newSalary,int newPerformanceIndex)
    {
        //assigning the conditions as menthioned by the questions
        if(newPerformanceIndex > 5 && this.getWorkingHours()>20 ){
            float appraisal =0;//here appraisal is a local variable i.e variable within this method
            if(newPerformanceIndex > 5 && newPerformanceIndex <= 7){
                 appraisal=0.05F;
            }
            else if(newPerformanceIndex >= 8 && newPerformanceIndex <= 9){
                 appraisal=0.10F;
            }
            else if(newPerformanceIndex >= 10){
                appraisal=0.20F;
            }
            this.salary = newSalary + appraisal * this.salary;
            this.isCertified=true;    
        }
        else{
            System.out.println("Not certified yet. So, your salary won't be approved. ");
        }
    }
    //method to remove the tutor class if the tutor hasn't been certified yet.
    public void removeTutor()
    {
        if(isCertified == false){  
            this.salary=0;
            this.specialization=null;
            this.academicQualifications=null;
            this.performanceIndex=0;
            this.isCertified=false; 
        }
    }
    
    public void display()
    {
       /*this condition checks weather is Certified is true or false if false then it will call the
        medthod of the teacher class and display it as and output but if it is true then it will print the 
        salary,specialization,academicqualification,performingindex along with the deatails 
        of the super class Teacher */
       if(isCertified ==false){
            super.display();      
        }
       else{
            System.out.println("Your salary is :" + this.getSalary());
            System.out.println("Your specialization:" + this.getSpecialization());
            System.out.println("Your academicQualifications:" + this.getAcademicQualifications());
            System.out.println("Your performance index is:" + this.getPerformanceIndex());
            super.display();
        }
    }
}
  
