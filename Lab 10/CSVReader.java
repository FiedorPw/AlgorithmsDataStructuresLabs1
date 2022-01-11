package Lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private final List<String[]> rows = new ArrayList<>();
    private final String fileName;
    private final String separator;

    public CSVReader(String fileName, String separator) {
        this.fileName = fileName;
        this.separator = separator;
    }

    public List<String[]> read() throws IOException, NotACSVFileException, EmptyFieldException, FileNotFoundException {
        if (!fileName.startsWith(".csv", fileName.length() - 4))
            throw new NotACSVFileException("Not a CSV File!");
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(fileName));
        String line = "";
        while ((line = br.readLine()) != null) {
            rows.add(line.split(separator));
            boolean containsSeparator = false;
            for (int i = 0; i < line.length(); i++) {
                boolean b = line.charAt(i) == separator.charAt(0);
                if (b && (i == 0 || i == line.length() - 1)) {
                    containsSeparator = true;
                    throw new EmptyFieldException("Contains an empty field!");
                } else if (b) {
                    containsSeparator = true;
                    if (line.charAt(i - 1) == separator.charAt(0) || line.charAt(i + 1) == separator.charAt(0))
                        throw new EmptyFieldException("Contains an empty field!");
                }
            }
            if (!containsSeparator)
                throw new NotACSVFileException("Not a CSV File!");
        }
        for (int i = 1; i < rows.size(); i++) {
            if (rows.get(i - 1).length != rows.get(i).length)
                throw new NotACSVFileException("Not a CSV File!");
        }
        return rows;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String[] row : rows) {
            for (String value : row) {
                sb.append(value).append(":");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, NotACSVFileException, EmptyFieldException {
        CSVReader csvReader = new CSVReader("plika.csv", ",");
        csvReader.read();
        System.out.println(csvReader);
    }
}
