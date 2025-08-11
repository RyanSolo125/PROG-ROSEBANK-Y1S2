
package com.mycompany.student;

import javax.swing.JOptionPane;
import javax.swing.*;

public class Student{

    private String studentNo;
    private String studentName;
    private int mark1;
    private int mark2;
    private int assignmentMark;
    private int examMark;
    
        
    //getters
    public String getStudentNo(){
        return studentNo;
    }
        
     public String getStudentName(){
        return studentName;
    }
     
      public int getMark1(){
        return mark1;
    }
      
       public int getMark2(){
       return mark2;
    }
       
       public int getAssignmentMark(){
       return assignmentMark;
    }
       
       public int getExamMark(){
       return examMark;
    }
       
       
       
    //setters
       
    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }
    
     public void setStudentName(String studentName){
        this.studentName = studentName;
    }
     
     public void setMark1(int mark1){
        this.mark1 = mark1;
    }
      
     public void setMark2(int mark2){
        this.mark2 = mark2;
    }
       
     public void setAssignmentMark(int assignmentMark){
        this.assignmentMark = assignmentMark;
    }
        
     public void setExamMark(int examMark){
        this.examMark = examMark;
    }
     
     
    //calculations
     
     public void calculateDpMark(int mark1, int mark2, int assignmentMark, int examMark){
         double dpMark = (mark1 + mark2 + assignmentMark)/3;
     }
     
     
     public void calculateFinalMark(int examMark, int dpMark){
         double finalMark = (examMark * 0.6) + (dpMark * 0.3);
         
          if (finalMark >= 75) {
            JOptionPane.showMessageDialog(null,"Pass with distinction");
        } else if (finalMark >= 50) {
            JOptionPane.showMessageDialog(null,"Pass");
        } else if (finalMark >= 47) {
            JOptionPane.showMessageDialog(null, "Supplementary");
        } else {
            JOptionPane.showMessageDialog(null, "Fail");
        }
     }
     
     
     
    
}
