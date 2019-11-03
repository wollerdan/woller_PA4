import java.io.*;
import java.util.*;

public class DuplicateCounter
{
    HashMap<String, Integer> wordCounter; //set map for string and count
    public DuplicateCounter()
    {
        wordCounter = new HashMap<String, Integer>(); //set wordCounter to the Map
    }

    public void count(String dataFile)
    {
        try {

            Scanner scnr = new Scanner(new File(dataFile)); //set file scanner
            String curword;

            while(scnr.hasNext()) //keep going as long as there is a next work
            {
                curword = scnr.next(); //set curword to current word on list

                if (!wordCounter.containsKey(curword)) //if list doesn't currently have the word, add it and give it 1
                    wordCounter.put(curword, 1);
                else
                    wordCounter.put(curword, wordCounter.get(curword) + 1); //if already added, increase count by 1
            }

            scnr.close(); //close scanner

        }
        catch(FileNotFoundException error)
        {
            System.out.println(error.getMessage()); //display file not found
        }
    }

    public void write(String dataFile)
    {
        try {
            PrintWriter outWriter = new PrintWriter(new File(dataFile)); //set printerwriter to datafile
            for(String wordList : wordCounter.keySet()) //for each entry in map list
            {
                outWriter.println(wordList + " " + wordCounter.get(wordList)); //write the word and count
            }

            outWriter.close(); //close file stream

        }
        catch(FileNotFoundException error)
        {
            System.out.println(error.getMessage()); //display file not found
        }
    }
}
