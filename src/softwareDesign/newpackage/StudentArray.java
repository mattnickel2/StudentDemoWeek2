/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareDesign.newpackage;

/**
 * - Create an array of students and print their names
 * @author Matthew
 */
public class StudentArray 
{
    
    
    
    public static void main(String[] args)
    {
        Student [] studentList = new Student[6];
        Student student1 = new Student("1", "Jim Halpert");
        studentList[0] = student1;
        studentList[1] = new Student("2", "Michael Scott");
        studentList[2] = new Student("3", "Pam Beesley");
        studentList[3] = new Student("4", "Dwight Schrute");
        studentList[4] = new Student("5", "Toby Flenderson");
        studentList[5] = new Student("6", "Kevin Malone");
        
        
        for(int i=0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getStudentID()+" "+studentList[i].getStudentName());
        }
    }
    
}
