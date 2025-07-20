 import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.util.ArrayList; 

/**
 * Write a description of class CopyOfTeacherGUI here.
 *
 * @author (Pragyan Khadka)
 * @version (np01cp......)
 */
public class TeacherGUI{
    private JFrame mainFrame, tutorFrame, lecturerFrame;
    private JPanel navPanel, bottomPanel,tutorNavPanel,tutorFooterPanel, lecturerNavPanel, lecturerFooterPanel;
    private JLabel aboutusLabel ,menuLabel, welcomeLabel, welcomeLabel2,ickLogoNav, ickLogo,bottomLabel, ickLogonavtutor,tutorTeacherInfo, tutorTeacherId,tutorTeacherName,tutorAddress,tutorEmpStatus,tutorWorkingType,tutorSalary,
    turtorSpecialization,tutorAcademicQualification,tutorPerformanceIndex,tutorSetSalary, tutorTeacherId2, newTutorPerformanceIndex, newTutorSetSalary,lecturerTeacherId,lecturerTeacherName,lecturerAddress,lecturerEmpStatus,lecturerWorkingType,lecturerYearsOfExpirences,
    lecturerGradedScore, lecturerTeacherInfo,lecturerTeacherInfo2,lecturerTeacherId2,lecturerGradedScore2,lecturerYearsOfExpirences2,lecturerDepartment,tutorHomeLabel,tutorLecturerLabel,lecturerHomeLabel,lecturerTutorLabel;
    private JButton tutorButton,lecturerButton,tutorAddTutorButton,tutorSetSalaryButton,tutorClearButton,tutorDisplayButton,lecturerAddLecturerButton,lecturerGradeAssignmentButton,lecturerDisplayButton,lecturerHomeButton,lecturerClearButton,tutorRemoveTutorButton;
    private JTextField tutorTeacherIdTF,tutorTeacherNameTF,tutorAddressTF,tutorEmpStatusTF,tutorWorkingTypeTF,tutorSalaryTF,tutorSpecializationTF,tutorAcademicQualificationTF,tutorPerformanceIndexTF,tutorTeacherId2TF,lecturerGradedScore2TF,
    newTutorSetSalaryTF,newTutorPerformanceIndexTF,lecturerTeacherIdTF,lecturerTeacherNameTF,lecturerAddressTF,lecturerEmpStatusTF,lecturerWorkingTypeTF,lecturerYearsOfExpirencesTF,lecturerGradedScoreTF,lecturerTeacherId2TF,lecturerDepartmentTF,lecturerYearsOfExpirences2TF;
    private Color white, black,springGreen,darkBlue; 
    private Font welcomeFont, allFont,infoFont;
    
    //Images
    ImageIcon logo = new ImageIcon("ickLogo.png");
    ImageIcon navLogo = new ImageIcon("navicklogo.png");

    ArrayList<Teacher> teacher = new ArrayList<>();

    
    public TeacherGUI(){
        mainInterface();
    }
    
    public void mainInterface(){
        //mainInterface
        mainFrame = new JFrame("Islington College Teacher Management System");
        mainFrame.setSize(567,675);
        mainFrame.setLayout(null);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setBackground(Color.WHITE);
        
        //Colors used
        white = Color.WHITE;
        black = Color.BLACK;
        springGreen = new Color(127,153,245);
        darkBlue = new Color(46,48,146);
        
        //fonts
        welcomeFont = new Font("Monaco",Font.PLAIN,18);
        allFont = new Font("Monaco",Font.BOLD,14);
        
        
        //navigation bar
        navPanel = new JPanel();
        navPanel.setLayout(null);
        navPanel.setBounds(0,0,567,41);
        navPanel.setBackground(darkBlue);
        mainFrame.add(navPanel);
        
        //ick logo on nv bar
        ickLogoNav = new JLabel(navLogo);
        ickLogoNav.setBounds(0, 5, 60, 50 );
        navPanel.add(ickLogoNav);
        
        //About Us Label
        aboutusLabel = new JLabel("ABOUT US");
        aboutusLabel.setFont(allFont);
        aboutusLabel.setBounds(380, 18, 100, 13);
        aboutusLabel.setForeground(white);
        navPanel.add(aboutusLabel);
        
        //Menu Label
        menuLabel = new JLabel("MENU");
        menuLabel.setBounds(480, 18, 45, 13);
        menuLabel.setFont(allFont);
        menuLabel.setForeground(white);
        navPanel.add(menuLabel);
        
        //welcome Label
        welcomeLabel = new JLabel("WELCOME TO THE TEACHER MANAGEMENT");
        welcomeLabel.setBounds(75, 87, 400, 23);
        welcomeLabel.setFont(welcomeFont);
        mainFrame.add(welcomeLabel);
        
        //welcome Label2
        welcomeLabel2 = new JLabel("SYSTEM OF ISLINGTON COLLEGE");
        welcomeLabel2.setBounds(125, 115, 300, 23);
        welcomeLabel2.setFont(welcomeFont);
        mainFrame.add(welcomeLabel2);
        
        //islington college logo
        ickLogo = new JLabel(logo);
        ickLogo.setBounds(50, 160, 175, 350);
        mainFrame.add(ickLogo);
        
        //add lecturer button
        JButton lecturerButton = new JButton("Add Lecturer");
        lecturerButton.setBounds(290,270,150,30);
        lecturerButton.setBorder(null);
        lecturerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerButton.setForeground(Color.white);
        lecturerButton.setBackground(darkBlue);
        mainFrame.add(lecturerButton);
        //Action Listner to open the lecturer pannel
        lecturerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mainFrame.setVisible(false);
                lecturerInterface();
                mainFrame.dispose();
            }
        });
        
        //add tutor button
        JButton tutorButton = new JButton("Add Tutor");
        tutorButton.setBounds(290,330,150,30);
        tutorButton.setBorder(null);
        tutorButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorButton.setForeground(Color.white);
        tutorButton.setBackground(darkBlue);
        mainFrame.add(tutorButton);
        //Action Listner to open the lecturer pannel
        tutorButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                mainFrame.setVisible(false);
                tutorInterface();
                mainFrame.dispose();
            }
        });
        
        
        //bottom pannel
        bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setBounds(0,597,567,41);
        bottomPanel.setBackground(darkBlue);
        mainFrame.add(bottomPanel);
        
        //bottom Label
        bottomLabel = new JLabel("ISLINGTON COLLEGE, KAMALPOKHARI, KATHMANDU");
        bottomLabel.setBounds(130, 18, 500, 13);
        bottomLabel.setForeground(white);
        bottomPanel.add(bottomLabel);
        
        mainFrame.setVisible(true);    
    }
    public void lecturerInterface(){
        JFrame lecturerFrame = new JFrame("Add Lecturer");
        lecturerFrame.setSize(700, 850);
        lecturerFrame.getContentPane().setBackground(Color.WHITE);
        lecturerFrame.setResizable(false);
        lecturerFrame.setLayout(null);
        lecturerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //colors
        white = Color.WHITE;
        black = Color.BLACK;
        springGreen = new Color(127,153,245);
        darkBlue = new Color(46,48,146);
        
        //font
        allFont = new Font("Monaco",Font.BOLD,14);
        infoFont = new Font("Monaco",Font.PLAIN,14);
        
        // navigation panel for tutor
        JPanel lecturerNavPanel = new JPanel();
        lecturerNavPanel.setLayout(null);
        lecturerNavPanel.setBounds(0, 0, 700, 63);
        lecturerNavPanel.setBackground(darkBlue);
        lecturerFrame.add(lecturerNavPanel);
        
        //ick logo on nv bar
        ickLogonavtutor = new JLabel(navLogo);
        ickLogonavtutor.setBounds(5, 10, 60, 50 );
        lecturerNavPanel.add(ickLogonavtutor);
        
        //About Us Label
        aboutusLabel = new JLabel("About Us");
        aboutusLabel.setFont(allFont);
        aboutusLabel.setBounds(480, 21, 100, 20);
        aboutusLabel.setForeground(white);
        lecturerNavPanel.add(aboutusLabel);
        
        //Menu Label
        menuLabel = new JLabel("Menu");
        menuLabel.setBounds(580, 21, 50, 20);
        menuLabel.setFont(allFont);
        menuLabel.setForeground(white);
        lecturerNavPanel.add(menuLabel);

        //Label to go back to home page
        lecturerHomeLabel = new JLabel("Home");
        lecturerHomeLabel.setBounds(280, 21, 50, 20);
        lecturerHomeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerHomeLabel.setFont(allFont);
        lecturerHomeLabel.setForeground(white);
        lecturerNavPanel.add(lecturerHomeLabel);
        //Mouse Listener to go back to the main interface
        lecturerHomeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainInterface();
                lecturerFrame.dispose();
            }
        
        });
        
        //label to go to tutor interface
        lecturerTutorLabel = new JLabel("Tutor");
        lecturerTutorLabel.setBounds(380, 21, 75, 20);
        lecturerTutorLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerTutorLabel.setFont(allFont);
        lecturerTutorLabel.setForeground(white);
        lecturerNavPanel.add(lecturerTutorLabel);
        //Mouse Listener to go back to tutor interface from lecturer interface
        lecturerTutorLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tutorInterface();
                lecturerFrame.dispose();
            }
        
        });
        
        //tutor footer panel
        lecturerFooterPanel = new JPanel();
        lecturerFooterPanel.setLayout(null);
        lecturerFooterPanel.setBounds(0, 755, 700, 63);
        lecturerFooterPanel.setBackground(darkBlue);
        lecturerFrame.add(lecturerFooterPanel);

        //bottom Label
        bottomLabel = new JLabel("ISLINGTON COLLEGE, KAMALPOKHARI, KATHMANDU");
        bottomLabel.setBounds(220, 22, 500, 13);
        bottomLabel.setForeground(white);
        lecturerFooterPanel.add(bottomLabel);

        //teacher info Label
        JLabel lecturerTeacherInfo = new JLabel("Please enter the following lecturer's information");
        lecturerTeacherInfo.setBounds(100, 95, 300, 22);
        lecturerTeacherInfo.setFont(infoFont);
        lecturerFrame.add(lecturerTeacherInfo);
        
        //teacher ID Label
        JLabel lecturerTeacherId = new JLabel("Teacher ID :");
        lecturerTeacherId.setBounds(100, 123, 91, 22);
        lecturerTeacherId.setFont(allFont);
        lecturerFrame.add(lecturerTeacherId);
        
        //teacher ID Text Field
        lecturerTeacherIdTF = new JTextField();
        lecturerTeacherIdTF.setBounds(100, 152, 182, 32);
        lecturerFrame.add(lecturerTeacherIdTF);
        
        //Teacher Name Label
        lecturerTeacherName = new JLabel("Teacher Name :");
        lecturerTeacherName.setBounds(390, 124, 120, 22);
        lecturerTeacherName.setFont(allFont);
        lecturerFrame.add(lecturerTeacherName);
        
        //Teacher Name Text Field
        lecturerTeacherNameTF = new JTextField();
        lecturerTeacherNameTF.setBounds(390, 152, 182, 32);
        lecturerFrame.add(lecturerTeacherNameTF);

        //address Label
        lecturerAddress = new JLabel("Address :");
        lecturerAddress.setBounds(100, 200, 89, 22);
        lecturerAddress.setFont(allFont);
        lecturerFrame.add(lecturerAddress);
        
        //address text field
        lecturerAddressTF = new JTextField();
        lecturerAddressTF.setBounds(100, 227, 182, 32);
        lecturerFrame.add(lecturerAddressTF);
        
        //Employemnt Status Label
        lecturerEmpStatus = new JLabel("Employment Status :");
        lecturerEmpStatus .setBounds(390, 199, 200, 22);
        lecturerEmpStatus .setFont(allFont);
        lecturerFrame.add(lecturerEmpStatus);
        
        //Employment Status TF
        lecturerEmpStatusTF = new JTextField();
        lecturerEmpStatusTF.setBounds(390, 226, 182, 32);
        lecturerFrame.add(lecturerEmpStatusTF);

        //working type Label
        lecturerWorkingType = new JLabel("Working Type :");
        lecturerWorkingType.setBounds(100, 275, 122, 22);
        lecturerWorkingType .setFont(allFont);
        lecturerFrame.add(lecturerWorkingType );
        
        //Working Type Text Field
        lecturerWorkingTypeTF = new JTextField();
        lecturerWorkingTypeTF.setBounds(100, 302, 182, 32);
        lecturerFrame.add(lecturerWorkingTypeTF);
        
        //Graded Score Label
        lecturerGradedScore = new JLabel("Graded Score :");
        lecturerGradedScore.setBounds(390, 274, 150, 22);
        lecturerGradedScore.setFont(allFont);
        lecturerFrame.add(lecturerGradedScore);
        
        //Grded Score TextFiled
        lecturerGradedScoreTF = new JTextField();
        lecturerGradedScoreTF.setBounds(390, 302, 182, 32);
        lecturerFrame.add(lecturerGradedScoreTF);
        
        //Years of Expirences Label
        lecturerYearsOfExpirences = new JLabel("Years of Expirences :");
        lecturerYearsOfExpirences.setBounds(100, 350, 150, 22);
        lecturerYearsOfExpirences.setFont(allFont);
        lecturerFrame.add(lecturerYearsOfExpirences);
        
        //Years of Expirences TextFiled
        lecturerYearsOfExpirencesTF = new JTextField();
        lecturerYearsOfExpirencesTF .setBounds(100, 378, 182, 32);
        lecturerFrame.add(lecturerYearsOfExpirencesTF );

        //Button to add lecturer
        JButton lecturerAddLecturerButton = new JButton("Add Lecturer");
        lecturerAddLecturerButton.setBounds(350, 378, 125, 35);
        lecturerAddLecturerButton.setBackground(darkBlue);
        lecturerAddLecturerButton.setBorder(null);
        lecturerAddLecturerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerAddLecturerButton.setForeground(white);
        lecturerFrame.add(lecturerAddLecturerButton);
        lecturerAddLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lecturerTeacherIdTF.getText().isEmpty() || lecturerTeacherNameTF.getText().isEmpty() || lecturerAddressTF.getText().isEmpty() ||lecturerEmpStatusTF.getText().isEmpty() ||  lecturerWorkingTypeTF.getText().isEmpty() ||lecturerGradedScoreTF.getText().isEmpty() || lecturerYearsOfExpirencesTF.getText().isEmpty()){
                    JOptionPane.showMessageDialog(lecturerFrame, "Please fill all the text fields");
                } else {
                    try {
                        int teacherId = Integer.parseInt(lecturerTeacherIdTF.getText());
                        String teacherName = lecturerTeacherNameTF.getText();
                        String address = lecturerAddressTF.getText();
                        String empStatus = lecturerEmpStatusTF.getText();
                        String workingType = lecturerWorkingTypeTF.getText();
                        String gradedScore = lecturerGradedScoreTF.getText();
                        int yearsOfExpirences = Integer.parseInt(lecturerYearsOfExpirencesTF.getText());
                        boolean isFound = false;
                        if(teacher.size()==0){
                            Lecturer lecturer = new Lecturer( teacherId, teacherName, address, workingType, empStatus,  "", yearsOfExpirences, 0);
                            teacher.add(lecturer);
                            JOptionPane.showMessageDialog(lecturerFrame, "Lecturer added successfully");
                            
                        }
                        else{
                            //check if the card is already present 
                            //loop through array list and check teacher Id
                            for(Teacher teachers:teacher){
                                if(teachers instanceof Lecturer){
                                    //downcasting
                                    Lecturer lecturerObj = (Lecturer) teachers;
                                    if(lecturerObj.getTeacherId()==teacherId)
                                    {
                                        isFound = true;
                                    }
                                }
                            }
                            if (isFound == false){
                            //create an object of Lecturer using constructor
                            Lecturer lecturer = new Lecturer( teacherId, teacherName, address, workingType, empStatus,  "", yearsOfExpirences, 0);
                            teacher.add(lecturer);
                            JOptionPane.showMessageDialog(lecturerFrame, "Lecturer added successfully");
                            }
                            else{
                            JOptionPane.showMessageDialog(lecturerFrame, " Same Teacher ID already exist please try a new one.", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                            }

                        }
                    } catch(NumberFormatException ex1){
                        JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid input","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
        });
        //Button to display the information stored
        JButton lecturerDisplayButton = new JButton("Display");
        lecturerDisplayButton.setBounds(500, 378, 125, 35);
        lecturerDisplayButton.setBackground(darkBlue);
        lecturerDisplayButton.setBorder(null);
        lecturerDisplayButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerDisplayButton.setForeground(white);
        lecturerFrame.add(lecturerDisplayButton);
        lecturerDisplayButton.addActionListener(new ActionListener() {
        @Override
           public void actionPerformed(ActionEvent e){
               if(teacher.size()==0){
                //show error message if array list empty
                JOptionPane.showMessageDialog(lecturerFrame, "Please enter values for Displaying", "ERROR", 
                JOptionPane.ERROR_MESSAGE); 
                            
               }
               else
               {
                   //loop arrayList
                   for(Teacher teachers : teacher)
                   {
                       if(teachers instanceof Lecturer)
                       {
                           //performing downcasting
                           Lecturer lecturerObj =(Lecturer) teachers;
                           //to call the display method of Lecturer Class
                           lecturerObj.display();
                           
                           String teacherName = lecturerObj.getTeacherName();
                           String address = lecturerObj.getAddress();
                           String employmentStatus = lecturerObj.getEmploymentStatus();
                           String workingType = lecturerObj.getWorkingType();
                           String department = lecturerObj.getDepartment();
                           
                           int teacherId = lecturerObj.getTeacherId();
                           int yearsOfExpirences = lecturerObj.getYearsOfExperience();
                           int gradedScore =lecturerObj.getGradedScore();
                           
                           String allFields = "Teacher ID: " + teacherId + "\nTeacher Name: " + teacherName + "\nAddress: " + address + "\nEmployment Status: " + employmentStatus + "\nWorking Type: " + workingType 
                           + "\nDepartment: " + department + "\nYears of Experience: " + yearsOfExpirences + "\nGraded Score: " + gradedScore;
                           String specificFields = "Teacher ID: " + teacherId + "\nTeacher Name: " + teacherName + "\nAddress: " + address + "\nEmployment Status: " + employmentStatus + "\nWorking Type: " + workingType;
                           
                           if(lecturerObj.getHasGraded()==true)
                           {
                               JOptionPane.showMessageDialog(lecturerFrame, allFields,"Information of Lecturer",JOptionPane.INFORMATION_MESSAGE);
                               
                           }
                           else
                           {
                               JOptionPane.showMessageDialog(lecturerFrame, specificFields,"Details of L ecturer",JOptionPane.INFORMATION_MESSAGE);
                           }
                           
                       }
                   }
               }


          }
        });

        //teacher ID Label
        JLabel lecturerTeacherInfo2 = new JLabel("Please enter the following lecturer's information");
        lecturerTeacherInfo2.setBounds(100, 475, 300, 22);
        lecturerTeacherInfo2.setFont(infoFont);
        lecturerFrame.add(lecturerTeacherInfo2);

        //Teacher Id of setting Salary
        lecturerTeacherId2 = new JLabel("Teacher ID :");
        lecturerTeacherId2.setBounds(100, 525, 100, 22);
        lecturerTeacherId2.setFont(allFont);
        lecturerTeacherId2.setForeground(black);
        lecturerFrame.add(lecturerTeacherId2 );
    
        //text field of teacher id 
        lecturerTeacherId2TF = new JTextField();
        lecturerTeacherId2TF.setBounds(100, 550, 182, 32);
        lecturerFrame.add(lecturerTeacherId2TF);
    
        // graded score salary
        lecturerGradedScore2 = new JLabel("Graded Score :");
        lecturerGradedScore2.setBounds(390, 520, 145, 22);
        lecturerGradedScore2.setFont(allFont);
        lecturerFrame.add(lecturerGradedScore2);
    
        //graded text field
        lecturerGradedScore2TF = new JTextField();
        lecturerGradedScore2TF.setBounds(390, 550, 182, 32);
        lecturerFrame.add(lecturerGradedScore2TF);
    
        // Department Label
        lecturerDepartment = new JLabel("Department :");
        lecturerDepartment.setBounds(100, 600, 250, 22);
        lecturerDepartment.setFont(allFont);
        lecturerFrame.add(lecturerDepartment);
    
        //Department text field
        lecturerDepartmentTF = new JTextField();
        lecturerDepartmentTF.setBounds(100, 625, 182, 32);
        lecturerFrame.add(lecturerDepartmentTF);

        //Years of Expirences Label
        lecturerYearsOfExpirences2 = new JLabel("Years of Expirences :");
        lecturerYearsOfExpirences2.setBounds(390, 600, 150, 22);
        lecturerYearsOfExpirences2.setFont(allFont);
        lecturerFrame.add(lecturerYearsOfExpirences2);

        //Years of Expirence text field
        lecturerYearsOfExpirences2TF = new JTextField();
        lecturerYearsOfExpirences2TF.setBounds(390, 625, 182, 32);
        lecturerFrame.add(lecturerYearsOfExpirences2TF);

        //Button to clear the text fields of lecturer
        JButton lecturerClearButton = new JButton("Clear");
        lecturerClearButton.setBounds(200, 685, 125, 35);
        lecturerClearButton.setBackground(darkBlue);
        lecturerClearButton.setBorder(null);
        lecturerClearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerClearButton.setForeground(white);
        lecturerFrame.add(lecturerClearButton);
        lecturerClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(lecturerFrame, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (option == JOptionPane.YES_OPTION) {
                    // Clear all fields
                    lecturerTeacherIdTF.setText("");
                    lecturerTeacherNameTF.setText("");
                    lecturerAddressTF.setText("");
                    lecturerEmpStatusTF.setText("");
                    lecturerWorkingTypeTF.setText("");
                    lecturerGradedScoreTF.setText("");
                    lecturerYearsOfExpirencesTF.setText("");
                    lecturerTeacherId2TF.setText("");
                    lecturerGradedScore2TF.setText("");
                    lecturerDepartmentTF.setText("");
                    lecturerYearsOfExpirences2TF.setText("");
                }
            }
        });
        

        //Button to clear the text fields of lecturer
        JButton lecturerGradeAssignmentButton = new JButton("Grade Assignment");
        lecturerGradeAssignmentButton.setBounds(400, 685, 125, 35);
        lecturerGradeAssignmentButton.setBackground(darkBlue);
        lecturerGradeAssignmentButton.setBorder(null);
        lecturerGradeAssignmentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lecturerGradeAssignmentButton.setForeground(white);
        lecturerFrame.add(lecturerGradeAssignmentButton);
        lecturerGradeAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lecturerTeacherId2TF.getText().isBlank() || lecturerGradedScore2TF.getText().isBlank() || lecturerDepartmentTF.getText().isBlank() || lecturerYearsOfExpirences2TF.getText().isBlank()){
                    JOptionPane.showMessageDialog(lecturerFrame, "Please fill all the text fields");
                } else {
                    try {
                        int teacherId = Integer.parseInt(lecturerTeacherId2TF.getText());
                        int gradedScore = Integer.parseInt(lecturerGradedScore2TF.getText());
                        String department = lecturerDepartmentTF.getText();
                        int yearsOfExpirences = Integer.parseInt(lecturerYearsOfExpirences2TF.getText());
                        boolean isFound = false;
                        if(teacher.size()==0){
                            JOptionPane.showMessageDialog(lecturerFrame, "Please input Teacher Id first");
                        }
                        else
                        {
                            for(Teacher teachers: teacher)
                             {
                                 if(teachers instanceof Lecturer)
                                 {
                                     //preform downcasting
                                     Lecturer LecturerObj = (Lecturer) teachers;
                                     //check if teacher Id matches or not
                                     if(LecturerObj.getTeacherId() == teacherId)
                                     {
                                     // Grade the assignment for the lecturer
                                     LecturerObj.gradeAssignment(gradedScore, department, yearsOfExpirences);
                                     // Display a message indicating successful grading along with graded score
                                     JOptionPane.showMessageDialog(lecturerFrame, "Assignment graded successfully!\nTeacher Id: " + teacherId + "\nGraded Score: " + gradedScore + "\nDepartment: " + department + "\nYears of Experience: " + yearsOfExpirences);
                                    return;
                                     }
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(lecturerFrame, "Invalid teacher Id", "Error", JOptionPane.ERROR_MESSAGE);
                                 }
                           
                             }
                            if(isFound == false)
                            {
                                JOptionPane.showMessageDialog(lecturerFrame, "Teacher Id not found please enter a vaild Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            
                        }
                        
                    }catch(NumberFormatException ex1){
                        JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid input");
                    }
                }
            }
        });   
                 
        lecturerFrame.setVisible(true);
        
    }
    public void tutorInterface(){
        JFrame tutorFrame = new JFrame("Add Tutor");
        tutorFrame.setSize(700, 850);
        tutorFrame.getContentPane().setBackground(Color.WHITE);
        tutorFrame.setResizable(false);
        tutorFrame.setLayout(null);
        tutorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //colors
        white = Color.WHITE;
        black = Color.BLACK;
        springGreen = new Color(127,153,245);
        darkBlue = new Color(46,48,146);
        
        //font
        allFont = new Font("Monaco",Font.BOLD,14);
        infoFont = new Font("Monaco",Font.PLAIN,14);
        
        // navigation panel for tutor
        JPanel tutorNavPanel = new JPanel();
        tutorNavPanel.setLayout(null);
        tutorNavPanel.setBounds(0, 0, 700, 63);
        tutorNavPanel.setBackground(darkBlue);
        tutorFrame.add(tutorNavPanel);
        
        //ick logo on nv bar
        ickLogonavtutor = new JLabel(navLogo);
        ickLogonavtutor.setBounds(5, 10, 60, 50 );
        tutorNavPanel.add(ickLogonavtutor);
        
        //About Us Label
        aboutusLabel = new JLabel("About Us");
        aboutusLabel.setFont(allFont);
        aboutusLabel.setBounds(480, 21, 100, 20);
        aboutusLabel.setForeground(white);
        tutorNavPanel.add(aboutusLabel);
        
        //Menu Label
        menuLabel = new JLabel("Menu");
        menuLabel.setBounds(580, 21, 50, 20);
        menuLabel.setFont(allFont);
        menuLabel.setForeground(white);
        tutorNavPanel.add(menuLabel);

        //Label to go back to home page
        tutorHomeLabel = new JLabel("Home");
        tutorHomeLabel.setBounds(280, 21, 50, 20);
        tutorHomeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorHomeLabel.setFont(allFont);
        tutorHomeLabel.setForeground(white);
        tutorNavPanel.add(tutorHomeLabel);
        //Mouse Listener to go back to the main interface
        tutorHomeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainInterface();
                tutorFrame.dispose();
            }
        
        });

        //label to go to lecturer interface
        tutorLecturerLabel = new JLabel("Lecturer");
        tutorLecturerLabel.setBounds(380, 21, 75, 20);
        tutorLecturerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorLecturerLabel.setFont(allFont);
        tutorLecturerLabel.setForeground(white);
        tutorNavPanel.add(tutorLecturerLabel);
        //Mouse Listener to go back to Lecturer interface from tutor interface
        tutorLecturerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lecturerInterface();
                tutorFrame.dispose();
            }
        
        });

        //tutor footer panel
        tutorFooterPanel = new JPanel();
        tutorFooterPanel.setLayout(null);
        tutorFooterPanel.setBounds(0, 755, 700, 63);
        tutorFooterPanel.setBackground(darkBlue);
        tutorFrame.add(tutorFooterPanel);
        
        
        //teacher ID Label
        JLabel tutorTeacherInfo = new JLabel("Please enter the following teacher's information");
        tutorTeacherInfo.setBounds(100, 95, 300, 22);
        tutorTeacherInfo.setFont(infoFont);
        tutorFrame.add(tutorTeacherInfo);
        
        //teacher ID Label
        JLabel tutorteacherId = new JLabel("Teacher ID :");
        tutorteacherId.setBounds(100, 123, 91, 22);
        tutorteacherId.setFont(allFont);
        tutorFrame.add(tutorteacherId);
        
        //teacher ID Text Field
        tutorTeacherIdTF = new JTextField();
        tutorTeacherIdTF.setBounds(100, 152, 182, 32);
        tutorFrame.add(tutorTeacherIdTF);
        
        //Teacher Name Label
        tutorTeacherName = new JLabel("Teacher Name :");
        tutorTeacherName.setBounds(390, 124, 120, 22);
        tutorTeacherName.setFont(allFont);
        tutorTeacherName.setForeground(black);
        tutorFrame.add(tutorTeacherName);
        
        //Teacher Name Text Field
        tutorTeacherNameTF = new JTextField();
        tutorTeacherNameTF.setBounds(390, 152, 182, 32);
        tutorFrame.add(tutorTeacherNameTF);

        //address Label
        tutorAddress = new JLabel("Address :");
        tutorAddress.setBounds(100, 200, 89, 22);
        tutorAddress.setFont(allFont);
        tutorFrame.add(tutorAddress);
        
        //address text field
        tutorAddressTF = new JTextField();
        tutorAddressTF.setBounds(100, 227, 182, 32);
        tutorFrame.add(tutorAddressTF);
        
        //Employemnt Status Label
        tutorEmpStatus = new JLabel("Employment Status :");
        tutorEmpStatus.setBounds(390, 199, 200, 22);
        tutorEmpStatus.setFont(allFont);
        tutorFrame.add(tutorEmpStatus);
        
        //Employment Status TF
        tutorEmpStatusTF = new JTextField();
        tutorEmpStatusTF.setBounds(390, 226, 182, 32);
        tutorFrame.add(tutorEmpStatusTF);
        
        //working type Label
        tutorWorkingType = new JLabel("Working Type :");
        tutorWorkingType.setBounds(100, 275, 122, 22);
        tutorWorkingType .setFont(allFont);
        tutorFrame.add(tutorWorkingType );
        
        //Working Type Text Field
        tutorWorkingTypeTF = new JTextField();
        tutorWorkingTypeTF.setBounds(100, 302, 182, 32);
        tutorFrame.add(tutorWorkingTypeTF);
        
        //Salary Label
        tutorSalary = new JLabel("Salary :");
        tutorSalary.setBounds(390, 274, 86, 22);
        tutorSalary.setFont(allFont);
        tutorFrame.add(tutorSalary);
        
        //Salary TextFiled
        tutorSalaryTF = new JTextField();
        tutorSalaryTF.setBounds(390, 302, 182, 32);
        tutorFrame.add(tutorSalaryTF);
        
        //Specialization Label
        turtorSpecialization = new JLabel("Specialization :");
        turtorSpecialization.setBounds(100, 350, 150, 22);
        turtorSpecialization.setFont(allFont);
        tutorFrame.add(turtorSpecialization);
        
        //Specialization TextFiled
        tutorSpecializationTF = new JTextField();
        tutorSpecializationTF .setBounds(100, 378, 182, 32);
        tutorFrame.add(tutorSpecializationTF );
        
        //Salary Label
        tutorAcademicQualification = new JLabel("Academic Qualification :");
        tutorAcademicQualification.setBounds(390, 350, 180, 22);
        tutorAcademicQualification.setFont(allFont);
        tutorFrame.add(tutorAcademicQualification);
        
        //Salary TextFiled
        tutorAcademicQualificationTF = new JTextField();
        tutorAcademicQualificationTF.setBounds(390, 378, 182, 32);
        tutorFrame.add(tutorAcademicQualificationTF);
        
        //Specialization Label
        tutorPerformanceIndex = new JLabel("Performance Index :");
        tutorPerformanceIndex.setBounds(100, 420, 180, 22);
        tutorPerformanceIndex.setFont(allFont);
        tutorFrame.add(tutorPerformanceIndex);
        
        //Specialization TextFiled
        tutorPerformanceIndexTF = new JTextField();
        tutorPerformanceIndexTF .setBounds(100, 450, 182, 32);
        tutorFrame.add(tutorPerformanceIndexTF );
        
        //Button to add tutor
        JButton tutorAddTutorButton = new JButton("Add Tutor");
        tutorAddTutorButton.setBounds(350, 445, 125, 35);
        tutorAddTutorButton.setBackground(darkBlue);
        tutorAddTutorButton.setBorder(null);
        tutorAddTutorButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorAddTutorButton.setForeground(white);
        tutorFrame.add(tutorAddTutorButton);
        tutorAddTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    String teacherName = tutorTeacherNameTF.getText();
                    String address = tutorAddressTF.getText();
                    String empStatus = tutorEmpStatusTF.getText();
                    String workingType = tutorWorkingTypeTF.getText();
                    String specialization = tutorSpecializationTF.getText();
                    String academicQualification = tutorAcademicQualificationTF.getText();
                    int teacherId = Integer.parseInt(tutorTeacherIdTF.getText());
                    double salary = Double.parseDouble(tutorSalaryTF.getText());
                    int performanceIndex =Integer.parseInt(tutorPerformanceIndexTF.getText());
        
                    boolean isFound = false;
        
                    if (teacher.size() == 0) {
                        Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, empStatus,0, salary, specialization, academicQualification, performanceIndex);
                        teacher.add(tutor);
                        JOptionPane.showMessageDialog(tutorFrame, "Tutor added successfully");
                    } else {
                        for (Teacher teachers : teacher) {
                            if (teachers instanceof Tutor) {
                                Tutor tutorObj = (Tutor) teachers;
                                if (tutorObj.getTeacherId() == teacherId) {
                                    isFound = true;
                                }
                            }
                        }
        
                        if (isFound == false) {
                            Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, empStatus,0, salary, specialization, academicQualification, performanceIndex);
                            teacher.add(tutor);
                            JOptionPane.showMessageDialog(tutorFrame, "Tutor added successfully");
                        } else {
                            JOptionPane.showMessageDialog(tutorFrame, "Teacher ID already exists. Please enter a different one.", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(tutorFrame, "Please enter valid numbers for Teacher ID, Salary, and Performance Index.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        //set salary information Label
        JLabel tutorSetSalary = new JLabel("Please enter the following  information to set the salary");
        tutorSetSalary.setBounds(100, 520, 400, 22);
        tutorSetSalary.setFont(infoFont);
        tutorFrame.add(tutorSetSalary);
        
        
        //Teacher Id of setting Salary
        tutorTeacherId2 = new JLabel("Teacher ID :");
        tutorTeacherId2.setBounds(100, 550, 100, 22);
        tutorTeacherId2 .setFont(allFont);
        tutorTeacherId2 .setForeground(black);
        tutorFrame.add(tutorTeacherId2 );
        
        //text field of teacher id 
        tutorTeacherId2TF = new JTextField();
        tutorTeacherId2TF.setBounds(100, 575, 182, 32);
        tutorFrame.add(tutorTeacherId2TF);
        
        // New salary
        newTutorSetSalary = new JLabel("New Salary :");
        newTutorSetSalary.setBounds(390, 550, 145, 22);
        newTutorSetSalary.setFont(allFont);
        tutorFrame.add(newTutorSetSalary);
        
        //new salary text field
        newTutorSetSalaryTF = new JTextField();
        newTutorSetSalaryTF.setBounds(390, 575, 182, 32);
        tutorFrame.add(newTutorSetSalaryTF);
        
        // New salary
        newTutorPerformanceIndex = new JLabel("New Performance Index :");
        newTutorPerformanceIndex.setBounds(100, 625, 250, 22);
        newTutorPerformanceIndex.setFont(allFont);
        tutorFrame.add(newTutorPerformanceIndex);
        
        //new salary text field
        newTutorPerformanceIndexTF = new JTextField();
        newTutorPerformanceIndexTF.setBounds(100, 650, 182, 32);
        tutorFrame.add(newTutorPerformanceIndexTF);
        
        //Button to set salary of tutor
        JButton tutorSetSalaryButton = new JButton("Set Salary");
        tutorSetSalaryButton.setBounds(350, 645, 125, 35);
        tutorSetSalaryButton.setBackground(darkBlue);
        tutorSetSalaryButton.setBorder(null);
        tutorSetSalaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorSetSalaryButton.setForeground(white);
        tutorFrame.add(tutorSetSalaryButton);
        tutorSetSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tutorTeacherId2TF.getText().isBlank() || newTutorSetSalaryTF.getText().isBlank() || newTutorPerformanceIndexTF.getText().isBlank()) {
                    JOptionPane.showMessageDialog(tutorFrame, "Please fill all the text fields");
                } else {
                    try {
                        int teacherId = Integer.parseInt(tutorTeacherId2TF.getText());
                        double newSalary = Double.parseDouble(newTutorSetSalaryTF.getText());
                        int newPerformanceIndex = Integer.parseInt(newTutorPerformanceIndexTF.getText());
                        boolean isFound = false;
                        if (teacher.size() == 0) {
                            JOptionPane.showMessageDialog(tutorFrame, "Please input Teacher Id first");
                        } else {
                            for (Teacher teachers : teacher) {
                                if (teachers instanceof Tutor) {
                                    //downcasting
                                    Tutor tutorObj = (Tutor) teachers;
                                    if (tutorObj.getTeacherId() == teacherId)
                                    {
                                        isFound = true;
                                        tutorObj.setSalary(newSalary,newPerformanceIndex);
                                        JOptionPane.showMessageDialog(tutorFrame, "Salary set successfully!\nTeacher Id: " + teacherId + "\nNew Salary: " + newSalary + "\nNew Performance Index: " + newPerformanceIndex);
                                        return;
                                    }
                                } 
                            }
                            if (isFound == false) {
                                JOptionPane.showMessageDialog(tutorFrame, "Teacher Id not found please enter a valid Teacher Id!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } catch (NumberFormatException ex1) {
                        JOptionPane.showMessageDialog(tutorFrame, "Please enter valid input");
                    }
                }
            }
        });
        
        //Button to clear the text fields
        JButton tutorClearButton = new JButton("Clear");
        tutorClearButton.setBounds(500, 645, 125, 35);
        tutorClearButton.setBackground(darkBlue);
        tutorClearButton.setBorder(null);
        tutorClearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorClearButton.setForeground(white);
        tutorFrame.add(tutorClearButton);
        tutorClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(tutorFrame, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (option == JOptionPane.YES_OPTION) {
                    // Clear all fields
                    tutorTeacherIdTF.setText("");
                    tutorTeacherNameTF.setText("");
                    tutorAddressTF.setText("");
                    tutorEmpStatusTF.setText("");
                    tutorWorkingTypeTF.setText("");
                    tutorSalaryTF.setText("");
                    tutorSpecializationTF.setText("");
                    tutorAcademicQualificationTF.setText("");
                    tutorPerformanceIndexTF.setText("");
                    tutorTeacherId2TF.setText("");
                    newTutorSetSalaryTF.setText("");
                    newTutorPerformanceIndexTF.setText("");
                }
            }
        });
        
        //Button to display the information stored
        JButton tutorDisplayButton = new JButton("Display");
        tutorDisplayButton.setBounds(500, 445, 125, 35);
        tutorDisplayButton.setBackground(darkBlue);
        tutorDisplayButton.setBorder(null);
        tutorDisplayButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorDisplayButton.setForeground(white);
        tutorFrame.add(tutorDisplayButton);

        //Button to Remove tutor
        JButton tutorRemoveTutorButton = new JButton("Remove Tutor");
        tutorRemoveTutorButton.setBounds(425, 700, 125, 35);
        tutorRemoveTutorButton.setBackground(darkBlue);
        tutorRemoveTutorButton.setBorder(null);
        tutorRemoveTutorButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tutorRemoveTutorButton.setForeground(white);
        tutorFrame.add(tutorRemoveTutorButton);
        

        //bottom Label
        bottomLabel = new JLabel("ISLINGTON COLLEGE, KAMALPOKHARI, KATHMANDU");
        bottomLabel.setBounds(200, 22, 500, 13);
        bottomLabel.setForeground(white);
        tutorFooterPanel.add(bottomLabel);
        
        
        tutorFrame.setVisible(true);
    }
    public static void main (String[] args) {
    new TeacherGUI();
    }
}
