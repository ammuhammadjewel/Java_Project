package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;


abstract class Patron{
    
    String id;
    String name;
    String departmentName;
    String email;
    String contactNo;
    String address;
    double amount;
    
    public void setId(String id){

        this.id = id;
    }


    public void setName(String name){

        this.name=name;
    }


    public void setDepartmentName(String departmentName){

        this.departmentName = departmentName;
    }


    public void setEmail(String email){

        this.email = email;
    }


    public void setContactNo(String contactNo){

        this.contactNo= contactNo;
    }



    public void setAddress(String address){

        this.address=address;
    }


    public void setAmount(double amount){

        this.amount = amount;
    }

    public String getId(){

        return id;
    }


    public String getName(){

        return name;
    }


    public String getDepartmentName(){

        return departmentName;
    }


    public String getEmail(){

        return email;
    }


    public String getContactNo(){

        return contactNo;
    }


    public String getAddress(){

        return address;
    }


    public double getAmount(){

        return amount;
    }


    abstract void showInfo();
}

    
    
    /**
    
    public Patron(String id, String name, String departmentName, String address, double amount){
        this.id = id;
        this.name = name;
        this.departmentName = departmentName;
        this.email = email;
        this.contactNo = contactNo;
        this.address = address;
        this.amount = amount;
    }
    abstract void showInfo();
}

/*
    String id;
    String name;
    String departmentName;
    String email;
    String contactNo;
    String address;
    double amount;

    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setContactNo(String contactNo){
        this.contactNo= contactNo;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public String getEmail(){
        return email;
    }

    public String getContactNo(){
        return contactNo;
    }

    public String getAddress(){
        return address;
    }

    public double getAmount(){
        return amount;
    }

    abstract void showInfo();
}
*/