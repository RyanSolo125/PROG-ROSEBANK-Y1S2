
package com.mycompany.student;


public class PartTime extends Student implements iStudent{
    
    private int attendancePercent;
    
    
    public int getAttendancePercent(){
        return attendancePercent;
    }
    
    public void setAttendanceHours(int attendancePercent){
        this.attendancePercent = attendancePercent;
    }

    @Override
    public void calculateDpMark() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calculateFinalMark() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAttendancePercent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
