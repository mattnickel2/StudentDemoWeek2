/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareDesign.newpackage;

/**
 *
 * @author Matthew
 */
public class Student  {
    
    private String studentID;
    private String studentName;
    private String program;
    
    public Student(String givenID, String givenName, String givenProgram)
    {
            studentID = givenID;
            studentName = givenName;
            program = givenProgram;
    }
    
    public void setStudentID(String givenID)
    {
        studentID = givenID;
    }
    
    public String getStudentID() 
    {
        return studentID;
    }
    
    public void setStudentName(String givenName)
    {
        studentName = givenName;
    }
    
    public String getStudentName() 
    {
        return studentName;
    }
        
    public void setProgram(String givenProgram)
    {
        program = givenProgram;
    }
    
    public String getProgram() 
    {
        return program;
    }
    
 
}


    