
package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 


public class Start implements IBasicOperations {
    public void showInfo(){
        System.out.println("showing patron info");
    }
    
    
    public void borrow(Patron p,Book b){
        
        System.out.println("Please Enter what type of user you are :");

        System.out.println("1. Student");
        System.out.println("2. Teacher");

        Scanner sc = new Scanner(System.in);

        int select1= sc.nextInt();

        String type = "";
        
        if(select1 ==1){
            
            type = "Student";
            
            System.out.println("\n\n");

            System.out.println("Please Enter your Student ID :");

            Scanner sc9 = new Scanner(System.in);

            int select9= sc9.nextInt();

            FileReader fileReader2 = null;

        BufferedReader bufferedReader2 = null ;
        
        File file = new File("D:\\java\\mini project 2\\Student\\student_records.txt");
        
        try{
            fileReader2 = new FileReader(file);
            bufferedReader2 = new BufferedReader(fileReader2);
            
            
            
            String line = "";
        String result ="";
            String searchKey = "StudentID : "+select9 ;
            
            String words[] = null;
            boolean found = false;
            outer: while((line = bufferedReader2.readLine()) != null) {
                
                words = line.split(",");
                for(String word: words) {
                    if(word.equals(searchKey)){
                        found = true;

                        result = line;

                        break outer;
                    }
                }
            }
            if(found){
                
                System.out.println("\n\n");
                
                System.out.println("!!!  Succesfully Logged In  !!");

                System.out.println("\n\n");


                System.out.println("Here is the list of Books : ");
                
                
                FileReader fileReader = null;
                
                BufferedReader bufferedReader = null ;
                
                File file2 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");
                
                try{
                    fileReader = new FileReader(file2);

                    bufferedReader = new BufferedReader(fileReader);

                    String line2 = "" ;
                    
                    while ((line2 = bufferedReader.readLine())!= null){
                        System.out.println("\n\n");
                        
                        System.out.println(line2);
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
                System.out.println("\n\n");
                
                System.out.println("Please enter the book id you want to borrow : ");

                Scanner sc10 = new Scanner(System.in);

                    int select10= sc10.nextInt();
                    
                    FileReader fileReader3 = null;
                    
                BufferedReader bufferedReader3 = null ;

                File file3 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");
                
                try{
                    fileReader3 = new FileReader(file3);
                    bufferedReader3 = new BufferedReader(fileReader3);
                    
                    
                    String line3 = "";
                    String result3 ="";
                    
                    String searchKeyy = "Book's Id : "+select10 ;
                    
                    String words3[] = null;
                    boolean found3 = false;
                    outer2: while((line3 = bufferedReader3.readLine()) != null) {
                        
                        words3 = line3.split(",");
                        for(String word: words3) {
                            if(word.equals(searchKeyy)){
                                found3 = true;
                                
                                result3 = line3;
                                
                                break outer2;
                            }
                        }
                    }
                    
                    if(found3) {
                        System.out.println("\n\n");
                        
                        System.out.println("!!!  Succesfully Borrowed the Book  !!");

                        System.out.println("\n\n");

                        File reciept = new File("D:\\java\\mini project 2\\Borrow\\Student\\borrow_records.txt");

                        File recieptmax = new File("D:\\java\\mini project 2\\Borrow\\max\\Student\\maxborrowid.txt");

                        FileWriter recieptWriter = null;

                        FileWriter recieptmaxWriter = null;

                        int recieptmaxid=0;

                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                        LocalDateTime now = LocalDateTime.now();  
                        
                        try{
                           if(recieptmax.createNewFile()){
                               FileWriter fileWriter18 = null;
                               
                               try{
                                   fileWriter18 = new FileWriter(recieptmax);
                                   
                                   recieptmaxid = 5001;
                                }
                               
                               catch(Exception es){
                                   System.out.println("Exception occured"+es);
                                }
                               
                               finally{
                                   try{
                                       fileWriter18.close();
                                    }
                                    catch(Exception ess){
                                       System.out.println("Exception occured"+ess);
                                    }
                                }
                            } 
                        }
                    }
                }
            }
        }
    }
}