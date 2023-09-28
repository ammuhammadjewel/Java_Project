package Java_Project;

import java.util.*;
import java.io.*;
import java.nio.*;

public interface IBasicOperations {
    
    public void borrow(Patron patron,Book book);
    public void returnBook(Patron patron,Book book);
    public void fine(Patron patron,double amount);
    
}
