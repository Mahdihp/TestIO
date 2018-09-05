import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LineReader {


    private String sourcePath;
    private String destinationPath;


    public LineReader(String sourcePath, String destinationPath) {
        this.sourcePath = sourcePath;
        this.destinationPath = destinationPath;
    }

    public void showReversLine2() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(sourcePath, "rw");

        String line;
        String strAll = "";
        while ((line = randomAccessFile.readLine()) != null) {
            strAll += line + "\n";
        }
        String[] split = strAll.split("\n");
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(destinationPath, "rw");
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.println(split[i]);
            randomAccessFile2.writeChars(split[i] + '\n');
        }
    }

    public void showReverseLine() throws IOException {
        FileReader fileReader = new FileReader(sourcePath);
        int ch;
        String strChar = "";
        while (-1 != (ch = fileReader.read())) {
            strChar += (char) ch;
        }
        String[] split = strChar.split("\n");
        FileWriter fileWriter = new FileWriter(destinationPath);
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.println(split[i]);
            fileWriter.write(split[i] + "\n");
        }

        fileWriter.close();
        fileReader.close();
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getDestinationPath() {
        return destinationPath;
    }

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }
}
