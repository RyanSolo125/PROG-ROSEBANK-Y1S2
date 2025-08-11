package org.example;

public abstract class Staff implements iStaff{

        public int staffNumber;
        public String staffLocation;



    protected Staff(int staffNumber,String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;

    }

    //getters
    public int getStaffNumber(){
        return staffNumber;
    }
    public String getStaffLocation(){
      return staffLocation;
    }



}


