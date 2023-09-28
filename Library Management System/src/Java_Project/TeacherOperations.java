package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;

class TeacherOperations {
    
    Teacher t;
    String teacherId;
    
    public void insertTeacher(Teacher t){
        this.t = t;
        
        File file01 = new File("D:\\java\\mini project 2\\Teacher\\max\\teachermaxid.txt");

        File file02 = new File("D:\\java\\mini project 2\\Teacher\\max\\teacheridmaxid.txt");
        
        
        FileReader fileReader = null;
        BufferedReader bufferedReader = null ;
        FileReader fileReader02 = null;
        BufferedReader bufferedReader02 = null ;
        int maxTeacherId = 0;
        int teacheridmaxId = 0;
        
        try{
            if(file01.createNewFile()){
                FileWriter fileWriter16 = null;
                
                try{
                    fileWriter16 = new FileWriter(file01);
                    t.setId(1);
                }
                catch(Exception ex){
                    System.out.println("Exception occured"+ex);
                }
                
                finally{
                    try{
                        fileWriter16.close();
                    }
                    catch(Exception exs){
                        System.out.println("Exception occured"+exs);
                    }
                }
            }
            else{
                try{
                    fileReader = new FileReader(file01);
                    bufferedReader = new BufferedReader(fileReader);
                    
                    String line = "";
                    
                    while ((line = bufferedReader.readLine())!= null){
                       maxTeacherId = Integer.parseInt(line)+1;
                       
                       t.setId(maxTeacherId);
                    }
                }
                
                catch(Exception e){
                    System.out.println("Exception Occured"+e);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception"+e);
        }
        
        try{
            if(file02.createNewFile()){
                t.setTeacherId("1001");
            }
            
            else{
                try{
                    fileReader02 = new FileReader(file02);
                    bufferedReader02 = new BufferedReader(fileReader02);
                    String line = "";
                    
                    while ((line = bufferedReader02.readLine())!= null){
                        teacheridmaxId = Integer.parseInt(line)+1;
                        t.setTeacherId(""+teacheridmaxId);
                    }
                }
                
                catch(Exception e){
                    System.out.println("Exception Occured"+e);
                }
            }
        }
        
        catch(Exception es){
            System.out.println("Exception"+es);
        }
        
        
        
        FileWriter filewriter = null;
        FileWriter filewriter02 = null;
        FileWriter filewriter03 = null;

        Scanner input = new Scanner(System.in);

        File file03 = new File("D:\\java\\mini project 2\\Teacher\\teacher_records.txt");

        try{
            file03.createNewFile();
        }
        
        catch(Exception e){
            System.out.println("Exception occured"+e);
        }
        
        try{
            filewriter = new FileWriter(file03,true);

            filewriter02 = new FileWriter(file01);
            filewriter03 = new FileWriter(file02);

            

            
            String str = "\nId :  "+Integer.toString(t.getId());

            System.out.println("\nPlease Enter Your Name : ");
            Scanner input2 = new Scanner(System.in);
            String name1=input2.nextLine();
            t.setName(name1);
            String str1 =",Name: "+t.getName();


            System.out.println("\nPlease Enter Your DepartmentName : ");
            Scanner input3 = new Scanner(System.in);
            String name2=input3.nextLine();
            t.setDepartmentName(name2);
            String str2 = ",Department Name : "+t.getDepartmentName();

            System.out.println("\nPlease Enter Your Email : ");
            Scanner input4 = new Scanner(System.in);
            String name3=input4.nextLine();
            t.setEmail(name3);
            String str3 = ",Email : " +t.getEmail();


            System.out.println("\nPlease Enter Your Contact No : ");
            Scanner input5 = new Scanner(System.in);
            String name4=input5.nextLine();
            t.setContactNo(name4);
            String str4 = ",Contact No : "+t.getContactNo();


            System.out.println("\nPlease Enter Your Address : ");
            Scanner input6 = new Scanner(System.in);
            String name5=input6.nextLine();
            t.setAddress(name5);
            String str5 = ",Address : "+t.getAddress();


            System.out.println("\nPlease Enter Your Amount : ");
            Scanner input7 = new Scanner(System.in);
            int d=input7.nextInt();
            double d1= d;
            t.setAmount(d1);
            String str6 = ",Amount : "+t.getAmount();
            
            String str7 = ",TeacherID : "+t.getTeacherId();
            
            System.out.println("\n\n");
            
            System.out.println("!!! Successfully recorded !!!");
            
            System.out.println("\n\n");
            
            System.out.println("Your Teacher id is :"+teacheridmaxId);

            System.out.println("\n");

            System.out.println("Your Patron id is :"+maxTeacherId);
            
            filewriter.write(str);
            filewriter.write(str7);
            filewriter.write(str1);
            filewriter.write(str2);
            filewriter.write(str3);
            filewriter.write(str4);
            filewriter.write(str5);
            filewriter.write(str6);
            
            String str20 = ""+t.getId();

            String str21 = ""+t.getTeacherId();

            filewriter02.write(str20);

            filewriter03.write(str21);
            
        }
        
        catch(Exception e){
            System.out.println("Exception occured"+e);
        }
        
        finally{
            try{
               filewriter.close();
               filewriter02.close();
                filewriter03.close(); 
            }
            catch(Exception e){
                System.out.println("Exception occured"+e);
            }
        }
    }
    public Teacher getTeacher(int teacherID){
        FileReader fileReader2 = null;
        BufferedReader bufferedReader2 = null ;
        
        File file = new File("D:\\java\\mini project 2\\Teacher\\teacher_records.txt");

        try{
            fileReader2 = new FileReader(file);
            bufferedReader2 = new BufferedReader(fileReader2);
            
            
            
            String line = "";
            String searchKey = "TeacherID : "+teacherID ;
            
            String words[] = null;
            boolean found = false;
            while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words){
                    if(word.equals(searchKey))
                        found = true;
                }
                if(found) {
                    System.out.println("\n\n");
                    System.out.println("Successfully Found!!!");

                    System.out.println("\n\n");
                    System.out.println(""+line);
                    
                    found = false;
                }
            }
        }
        catch(Exception e){
            System.out.println("exception occured"+e);
        }
        finally{
            try{
                fileReader2.close();
                bufferedReader2.close();
            }
            catch(Exception e){
                System.out.println("exception occured"+e);
            }
        }
        return t;
    }
    
    public void showAllTeachers(){
       FileReader fileReader = null;
       BufferedReader bufferedReader = null ;
       
       File file = new File("D:\\java\\mini project 2\\Teacher\\teacher_records.txt");

        try{
           fileReader = new FileReader(file);
           bufferedReader = new BufferedReader(fileReader);
           String line = "" ;
           
           while ((line = bufferedReader.readLine())!= null){
               System.out.println("\n\n");
               System.out.println(line);
           }
        }
        catch(Exception e){
            System.out.println("Exception Occured"+e);
        }
        finally{
            try{
                fileReader.close();
                bufferedReader.close();
            }
            catch(Exception e){
                System.out.println("Exception Occured"+e);
            }
        }
    }
}
