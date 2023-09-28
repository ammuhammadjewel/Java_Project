
package Java_Project;
import java.util.*;
import java.io.*;
import java.nio.*;

public class BookOperations {
    Book book;
    String bookId;
    Author author;
    Publisher publisher;
    
    public void intsertBook(Book book, Author authur){
        this.book = book;
        authur = new Author();
        publisher = new Publisher();
        
        FileReader fileReader = null;
        BufferedReader bufferedReader = null ;
        FileReader fileReader02 = null;
        BufferedReader bufferedReader02 = null ;
        FileReader fileReader03 = null;
        BufferedReader bufferedReader03 = null ;
        
        int maxBookId=0;
        int maxAuthorId=0;
        int maxPublisherId=0;
        
        FileWriter filewriter = null;
        FileWriter filewriter02 = null;
        FileWriter filewriter03 = null;
        FileWriter filewriter04 = null;
        
        File file01 = new File("D:\\java\\mini project 2\\Book\\max\\bookmaxid.txt");
        File file02 = new File("D:\\java\\mini project 2\\Book\\max\\authormaxid.txt");
        File file03 = new File("D:\\java\\mini project 2\\Book\\max\\publishermaxid.txt");
        
        try{
            if(file01.createNewFile()){
                FileWriter fileWriter16 = null;
                
                try{
                    fileWriter16 = new FileWriter(file01);
                    book.setId(1001);
                }
                catch(Exception es){
                    System.out.println("Something went wrong."+es);
                }
                
                finally{
                    try{
                        fileWriter16.close();
                    }
                    catch(Exception ess){
                        System.out.println("Something went wrong."+ess);
                    }
                }
            }
            else{
                FileReader fileReader24 = null;
                BufferedReader bufferedReader24=null;
                
                try{
                    fileReader24 = new FileReader(file01);
                    bufferedReader24 = new BufferedReader(fileReader24);
                    String line = "";
                    
                    while((line = bufferedReader24.readLine())!=null){
                        maxBookId = Integer.parseInt(line)+1;
                        book.setId(maxBookId);
                    }
                }
                catch(Exception esss){
                    System.out.println("Exception occured"+esss);
                }
            }
        }
       catch(Exception exs){
           System.out.println("Exception Occured"+exs);
       }
        
        try{
            if(file02.createNewFile()){
                FileWriter fileWriter17 = null;
                
                try{
                  fileWriter17 = new FileWriter(file02);
                  author.setId(1);
                }
                catch(Exception es){
                    System.out.println("Exception occured"+es);
                }
                finally{
                    try{
                        fileWriter17.close();
                    }
                    catch(Exception ess){
                        System.out.println("Exception occured"+ess);
                    }
                }
            }
            else{
                FileReader fileReader25 = null;
                BufferedReader bufferedReader25=null;
                
                try{
                    fileReader25 = new FileReader(file02);
                    bufferedReader25 = new BufferedReader(fileReader25);
                    String line = "";
                    
                    while ((line = bufferedReader25.readLine())!=null){
                        maxAuthorId = Integer.parseInt(line)+1;
                        author.setId(maxAuthorId);
                    }
                }
                catch(Exception esss){
                    System.out.println("Exception occured"+esss);
                }
            }
        }
        catch(Exception exs){
            System.out.println("Exception Occured"+exs);
        }
        try{
            if(file03.createNewFile()){
                FileWriter fileWriter18 = null;
                
                try{
                    fileWriter18 = new FileWriter(file03);
                    publisher.setId(1);
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
            else{
                FileReader fileReader26 = null;
                BufferedReader bufferedReader26=null;
                
                try{
                    fileReader26 = new FileReader(file03);
                    bufferedReader26 = new BufferedReader(fileReader26);
                    String line = "";
                    
                    while((line = bufferedReader26.readLine())!=null){
                        maxPublisherId = Integer.parseInt(line)+1;
                        publisher.setId(maxPublisherId);
                    }
                }
                catch(Exception esss){
                    System.out.println("Exception occured"+esss);
                }
            }
        }
        catch(Exception exs){
            System.out.println("Exception Occured"+exs);
        }
        
        
        
        
        
        
        Scanner input = new Scanner(System.in);
        File file04 = new File("D:\\java\\mini project 2\\Book\\book_records.txt");
        
        try{
            file04.createNewFile();
        }
        catch(Exception e){
            System.out.println("Exception occured"+e);
        }
        
        try{
            filewriter = new FileWriter(file04,true);
            
            filewriter02 = new FileWriter(file01);
            filewriter03 = new FileWriter(file02);
            filewriter04 = new FileWriter(file03);
            
            filewriter02.write(""+book.id);
            filewriter03.write(""+author.id);
            filewriter04.write(""+publisher.id);

            String bookid = "\nBook's Id : " +book.id;
            String authorid = ",Author's Id : " +author.id;
            String publisherid = ",Publisher's Id : " +publisher.id;
            
            System.out.println("\nPlease Enter Your Book Title: ");
            Scanner input1 = new Scanner(System.in);
            String name1=input1.nextLine();
            book.setTitle(name1);
            String str1 = ",Book's Title : " +book.title;
            
            System.out.println("\nPlease Enter Your Subtitle : ");
            Scanner input2 = new Scanner(System.in);
            String name2=input2.nextLine();
            book.setSubTitle(name2);
            String str2 = ",Book's Subtitle : " +book.subtitle;


            System.out.println("\nPlease Enter Your Book Price : ");
            Scanner input3 = new Scanner(System.in);
            int name3=input3.nextInt();
            double d1= name3;
            book.setPrice(d1);
            String str3 = ",Book's Price : " +book.price;


            System.out.println("\nPlease Enter Your Author's Name : ");
            Scanner input4 = new Scanner(System.in);
            String name4=input4.nextLine();
            author.setName(name4);
            String str4 = ",Author's Name : " +author.getName();


            System.out.println("\nPlease Enter Your Author's Email : ");
            Scanner input5 = new Scanner(System.in);
            String name5=input5.nextLine();
            author.setEmail(name5);
            String str5 = ",Author's Email : " +author.getEmail();



            System.out.println("\nPlease Enter Your Publisher's Name : ");
            Scanner input6 = new Scanner(System.in);
            String name6=input6.nextLine();
            publisher.setName(name6);
            String str6 = ",Publisher's Name : " +publisher.getName();



            System.out.println("\nPlease Enter Your Publisher's ContactNo : ");
            Scanner input7 = new Scanner(System.in);
            String name7=input7.nextLine();
            publisher.setContactNo(name7);
            String str7 = ",Publisher's ContactNo : " +publisher.getContactNo();
            
            System.out.println("\n\n");
            
            System.out.println("!!! Successfully recorded !!!");
            
            System.out.println("\n\n");
            
            System.out.println("Your Book id is :"+maxBookId);
            
            System.out.println("\n");
            
            System.out.println("Your Author id is :"+maxAuthorId);
            
            System.out.println("\n");
            
            System.out.println("Your Publisher id is :"+maxPublisherId);
            
            filewriter.write(bookid);
            filewriter.write(str1);
            filewriter.write(str2);
            filewriter.write(str3);
            filewriter.write(authorid);
            filewriter.write(str4);
            filewriter.write(str5);
            filewriter.write(publisherid);
            filewriter.write(str6);
            filewriter.write(str7);
        }
        catch(Exception e){
            System.out.println("Exception here"+e);
        }
        
        finally{
            try{
                filewriter.close();
                filewriter02.close();
                filewriter03.close();
                filewriter04.close();
            }
            catch(Exception e){
                System.out.println("Exception occured"+e);
            }
        }
    }
    public Book getBook(int bookId){
        FileReader fileReader2 = null;
        BufferedReader bufferedReader2 = null ;
        
        File file = new File("D:\\java\\mini project 2\\Book\\book_records.txt");
        
        try{
            fileReader2 = new FileReader(file);
            bufferedReader2 = new BufferedReader(fileReader2);
            
            String line = "";
            String searchKey = "Book'ss Id: "+bookId;
            
            String words[] = null;
            boolean found = false;
            while((line = bufferedReader2.readLine()) !=null){
                
               words = line.split(",");
               for(String word: words){
                   if(word.equals(searchKey))
                       found = true;
               }
               if(found){
                   System.out.println("\n\n");
                   System.out.println("Successfully found");
                   
                   System.out.println("\n\n");
                   System.out.println(" "+line);
                   
                   found = false;
               }
            }
        }
        catch(Exception es){
            System.out.println("Something went wrong."+es);
        }
        finally{
            try{
               fileReader2.close();
               bufferedReader2.close();
            }
            catch(Exception es){
                System.out.println("Something went wrong."+es);
            }
        }
        return book;
    }
    
    public void showAllBooks(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null ;
        File file = new File("D:\\java\\mini project 2\\Book\\book_records.txt");
        
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            
            while ((line = bufferedReader.readLine())!= null){
                System.out.println("\n\n");
                System.out.println(line);
            }
        }
        catch(Exception es){
            System.out.println("Something went wrong."+es);
        }
        finally{
            try{
                fileReader.close();
                bufferedReader.close();
            }
            catch(Exception es){
                System.out.println("Something went wrong."+es);
            }
        }
    }
}
