import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static BufferedReader reader;

    public static List<CSVRecord> parse(File file) throws Exception{
        reader = new BufferedReader(new FileReader(file));
        List<CSVRecord> result = new ArrayList<CSVRecord>();
        String sCurrentLine;

        reader.readLine();      // Skipping first line
        while ((sCurrentLine = reader.readLine()) != null) {
            result.add(new CSVRecord(sCurrentLine.split(",")));
        }

        return result;
    }



}
