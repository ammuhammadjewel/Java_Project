package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;

class Student extends Patron {
    
    String studentId;
    String guardianName;
    String guardianContactNo;
    
    public void setStudentId(String studentId){

        this.studentId = studentId;
    }


    public void setGuardianName(String guardianName){

        this.guardianName = guardianName;
    }


    public void setGuardianContactNo(String guardianContactNo){

        this.guardianContactNo = guardianContactNo;
    }


    public String getStudentId(){

        return studentId;
    }


    public String getGuardianName(){

        return guardianName;
    }


    public String getGuardianContactNo(){

        return guardianContactNo;
    }

    public void showInfo(){


    }
    
    
}
