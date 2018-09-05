import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
//        LineReader lineReader = new LineReader(
//                "/home/mahdi/IdeaProjects/TestIO/readme.txt",
//                "/home/mahdi/IdeaProjects/TestIO/readme2.txt");
////        lineReader.showReverseLine();
//        lineReader.showReversLine2();
        String path = "/home/mahdi/IdeaProjects";
        File file = new File(path);

        double result = ((folderSize(file) / 1024) / 1024);
        System.out.println(result + "MB");

    }




    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }



}
