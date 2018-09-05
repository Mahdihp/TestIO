import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LineReader lineReader = new LineReader(
                "/home/mahdi/IdeaProjects/TestIO/readme.txt",
                "/home/mahdi/IdeaProjects/TestIO/readme2.txt");
        lineReader.showReverseLine();
    }
}
