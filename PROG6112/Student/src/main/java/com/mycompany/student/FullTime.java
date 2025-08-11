
package com.mycompany.student;


public class FullTime extends Student implements iStudent{
    
    private int attendanceHours;
    
    
    public int getAttendanceHours(){
        return attendanceHours;
    }
    
    public void setAttendanceHours(int attendanceHours){
       this.attendanceHours = attendanceHours;
    }

    @Override
    public void calculateDpMark() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calculateFinalMark() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAttendanceHours() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
}
