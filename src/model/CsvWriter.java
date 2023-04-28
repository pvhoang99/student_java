package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "ten,diem";


    public static void writeCsvFile(String fileName, List<Student> students) {

        if (students.isEmpty()) {
            return;
        }

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName, false);

            for (Student student : students) {
                fileWriter.append(student.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}