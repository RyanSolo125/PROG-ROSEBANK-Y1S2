package com.mycompany.student;



import javax.swing.JOptionPane;
import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        
    String studentNo = JOptionPane.showInputDialog("Enter your student number: ");
    String studentName = JOptionPane.showInputDialog("Enter your full name: ");
    int mark1 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 1: "));
    int mark2 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 2: "));
    int assignmentMark = Integer.parseInt(JOptionPane.showInputDialog("Enter assignment mark: "));
    int examMark = Integer.parseInt(JOptionPane.showInputDialog("Enter exam mark: "));
    
    
    FullTime fulltime = new FullTime();
    fulltime.getStudentNo();
    fulltime.getStudentName();
    fulltime.getAttendanceHours();
    fulltime.getAssignmentMark();
    fulltime.getMark1();
    fulltime.getMark2();
    fulltime.getExamMark();
    fulltime.setAttendanceHours();
    
    
    
    PartTime parttime = new PartTime();
    parttime.getStudentNo();
    parttime.getStudentName();
    parttime.getAttendancePercent();
    parttime.getAssignmentMark();
    parttime.getMark1();
    parttime.getMark2();
    parttime.getExamMark();
    parttime.setAttendancePercent();
    
    }
   
  
    
   
        
        
    

}
    
    
    

