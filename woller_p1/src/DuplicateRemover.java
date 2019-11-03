import java.io.*;
import java.util.*;

public class DuplicateRemover {

    private Set<String> uniqueWords; //set of strings to hold words from problem1.txt

    public void remove(String dataFile) throws FileNotFoundException
    {
        uniqueWords = new HashSet<String>(); //set to remove duplicates
        String curword;
        Scanner scnr = new Scanner(new File(dataFile)); //scan path to problem file

        while(scnr.hasNext()) //scan through each line for word
        {
            curword = scnr.next(); //set current word
            uniqueWords.add(curword); //add word if unique to string set
        }

        scnr.close(); //close file scan
    }

    public void write(String dataFile) throws FileNotFoundException
    {
        PrintWriter wordPutterMagic = new PrintWriter(new File(dataFile)); //open print writer

        for(String writeWords: uniqueWords) //for each entry of the unique set
        {
            wordPutterMagic.println(writeWords); //write to open file
        }

        wordPutterMagic.close(); //close open file
    }
}
