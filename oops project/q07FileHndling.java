import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class q07FileHndling
{ 
    //Reading a File Method
    public static List<String> readFileInList(String fileName) 
    { 
    
      List<String> lines = Collections.emptyList(); 
      try
      { 
        lines = 
         Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
      } 
    
      catch (IOException e) 
      { 
        e.printStackTrace(); 
      } 
      return lines; 
    } 
    
    //Modifing a File method
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
    //Deleting a File Method
    public static void deleteFile() {
    	try
        { 
            Files.deleteIfExists(Paths.get("testFile2.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    }
 
    //Creating a File Methods
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("testFile1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
    }
 
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }
 
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
    
    
    //Main Method
    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
        
        List l = readFileInList("testFile1.txt"); 
         Iterator<String> itr = l.iterator(); 
        while (itr.hasNext()) 
          System.out.println(itr.next()); 
      
        modifyFile("testFile2.txt", "85", "95");
        System.out.println("done");
        
        deleteFile();
        
    }
}