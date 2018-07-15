import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<CSVRecord> parsedFile = null;
        final List<Record> records = new ArrayList<Record>();
        try{
            parsedFile = Parser.parse(new File("C:\\Users\\Pavlo\\projects\\csv\\salaries\\2018_june_raw.csv"));
        } catch(Exception e) {

        }
        parsedFile.forEach(record -> records.add(new Record(record.getValues())));
        System.out.println(records.get(2).getCity());
        records.remove(0);

        Collections.sort(records, Comparator.comparing(Record::getSalary));
        records.forEach(record -> {
            if(record.getJobTitle().equals("QA Tech Lead"))
                System.out.println("Salary: " + record.getSalary() + ", Job title: " + record.getJobTitle());
        });
    }
}
