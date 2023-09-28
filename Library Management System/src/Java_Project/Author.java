package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;

public class Author {
    String name;
    String id;
    String email;
    
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }

    void setId(int maxAuthorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
