package org.example;


public class StaffHiring extends Staff {


    protected StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);

    }

    @Override
    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return  "HIRE STAFF: YES";
        } else {
            return "HIRE STAFF: NO";
        }
    }

    public String PrintStaffHiringProcess() {

        System.out.print("STAFF HIRING REPORT" + "\n");
        System.out.print("*******************" + "\n");

        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println(getStaffHiringProcess());
        return getStaffLocation() + getStaffNumber()+getStaffHiringProcess();

    }
}
