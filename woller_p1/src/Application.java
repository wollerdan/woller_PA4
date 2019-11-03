import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException
    {
        DuplicateRemover dr = new DuplicateRemover(); //open DuplicateRemover class
        dr.remove("problem1.txt"); //set remove's datafile to the problem1.txt
        dr.write("unique_words.txt"); //set for write-to data file
    }
}