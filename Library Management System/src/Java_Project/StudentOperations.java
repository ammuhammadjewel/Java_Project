package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;

class StudentOperations {
    Student s;
    String studentID;
    int filewritercount = 1;
    
    public void insertStudent(Student s){
        this.s = s;
        
        File file01 = new File("D:\\java\\mini project 2\\Student\\max\\studentmaxid.txt");
        File file02 = new File("D:\\java\\mini project 2\\Student\\max\\studentidmaxid.txt");
        
        FileReader fileReader = null;
        BufferedReader bufferedReader = null ;
        FileReader fileReader02 = null;
        BufferedReader bufferedReader02 = null ;
        
        int maxStudentId = 0;
        int studentidmaxId = 0;
        
        boolean exists1 = false;
        boolean exists2 = false;
        
        exists1 = file01.exists();
        exists2 = file02.exists();
        
        
        
        
        try{
            if(file01.createNewFile()){
                FileWriter fileWriter16 = null;
                
                //BufferedWriter fileWriter10 = null;
                
                try{
                    fileWriter16 = new FileWriter(file01);
                    //fileWriter10 = new BufferedWriter(fileWriter16);
                    s.setId(1);
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
                    String line = "" ;
                    
                    while ((line = bufferedReader.readLine())!= null){
                        
                        maxStudentId=Integer.parseInt(line)+1;
                        s.setId(maxStudentId);
                    }
                }
                catch(Exception e){
                    System.out.println("Exception Occured"+e);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception occured"+e);
        }
        
        
        
        
        
        
        
        try{
            if(file02.createNewFile()){
                FileWriter fileWriter13 = null;
                BufferedWriter fileWriter11 = null;
                
                try{
                    fileWriter13 = new FileWriter(file02);
                    fileWriter11 = new BufferedWriter(fileWriter13);
                    s.setStudentId("1001");
                }
                catch(Exception ex){
                    System.out.println("Exception occured"+ex);
                }
                finally{
                    try{
                        fileWriter11.close();
                        fileWriter13.close();
                    }
                    catch(Exception exs){
                        System.out.println("Exception occured"+exs);
                    }
                }
            }
        }
        
        
        
        catch(Exception e){
            System.out.println("Exception occured"+e);
        }
        
        
        
        
        
        if(exists2){
            try{
                fileReader02 = new FileReader(file02);
                bufferedReader02 = new BufferedReader(fileReader02);
                String line = "" ;
                
                while ((line = bufferedReader02.readLine())!= null){
                    studentidmaxId=Integer.parseInt(line)+1;
                    s.setStudentId(""+studentidmaxId);
                }
            }
            catch(Exception e){
                System.out.println("Exception Occured"+e);
            }
        }
        FileWriter filewriter = null;

        FileWriter filewriter02 = null;

        FileWriter filewriter03 = null;

        Scanner input = new Scanner(System.in);

        File file03 = new File("D:\\java\\mini project 2\\Student\\student_records.txt");
        
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
            
            String str = "\nId :  "+Integer.toString(s.getId());
            
            System.out.println("\nPlease Enter Your Name : ");
            Scanner input2 = new Scanner(System.in);
            String name1=input2.nextLine();
            s.setName(name1);
            String str1 =",Name: "+s.getName();


            System.out.println("\nPlease Enter Your DepartmentName : ");
            Scanner input3 = new Scanner(System.in);
            String name2=input3.nextLine();
            s.setDepartmentName(name2);
            String str2 = ",Department Name : "+s.getDepartmentName();

            System.out.println("\nPlease Enter Your Email : ");
            Scanner input4 = new Scanner(System.in);
            String name3=input4.nextLine();
            s.setEmail(name3);
            String str3 = ",Email : " +s.getEmail();


            System.out.println("\nPlease Enter Your Contact No : ");
            Scanner input5 = new Scanner(System.in);
            String name4=input5.nextLine();
            s.setContactNo(name4);
            String str4 = ",Contact No : "+s.getContactNo();


            System.out.println("\nPlease Enter Your Address : ");
            Scanner input6 = new Scanner(System.in);
            String name5=input6.nextLine();
            s.setAddress(name5);
            String str5 = ",Address : "+s.getAddress();


            System.out.println("\nPlease Enter Your Amount : ");
            Scanner input7 = new Scanner(System.in);
            int d=input7.nextInt();
            double d1= d;
            s.setAmount(d1);
            String str6 = ",Amount : "+s.getAmount();
            
            String str7 = ",StudentID : "+s.getStudentId();
            
            System.out.println("\nPlease Enter Your GuardianName : ");
            Scanner input9 = new Scanner(System.in);
            String name7=input9.nextLine();
            s.setGuardianName(name7);
            String str8 = ",Guardian's Name : " +s.getGuardianName();


            System.out.println("\nPlease Enter Your Guardian's Contact No : ");
            Scanner input10 = new Scanner(System.in);
            String name8=input10.nextLine();
            s.setGuardianContactNo(name8);
            String str9 = ",Guardian's Contact No : " +s.getGuardianContactNo();
            
            System.out.println("\n\n");


            System.out.println("!!! Successfully recorded !!!");

            System.out.println("\n\n");


            System.out.println("Your Student id is :"+studentidmaxId);

            System.out.println("\n");

            System.out.println("Your Patron id is :"+maxStudentId);
            
            
            
            filewriter.write(str);
            filewriter.write(str7);
            filewriter.write(str1);
            filewriter.write(str2);
            filewriter.write(str3);
            filewriter.write(str4);
            filewriter.write(str5);
            filewriter.write(str6);
            
            filewriter.write(str8);
            filewriter.write(str9);


            String str20 = ""+s.getId();

            String str21 = ""+s.getStudentId();

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
    
    
    
    public void removeStudent(Student s){
        
    }
    public Student getStudent(int studentID){
        FileReader fileReader2 = null;
        BufferedReader bufferedReader2 = null ;
        
        File file = new File("D:\\java\\mini project 2\\Student\\student_records.txt");

        try{

        fileReader2 = new FileReader(file);
        bufferedReader2 = new BufferedReader(fileReader2);
        
        
        
        
        String line = "";
            String searchKey = "StudentID : "+studentID ;
            
            String words[] = null;
            boolean found = false;
            while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey))
                        found = true;
                }
                if(found) {

                    System.out.println("\n\n");

                    System.out.println("Successfully Found !!!");


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
        return s;
    }
    
    
    public void showAllStudents(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null ;
        
        File file = new File("D:\\java\\mini project 2\\Student\\student_records.txt");
        
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
