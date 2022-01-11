package Lab10;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {

    @Test
    void testInvalidExtension() {
        assertThrows(NotACSVFileException.class, () ->
                new CSVReader("./src/Lab10/tests/palindrome.plr", ",").read());
    }
    @Test
    void testImageFile() {
        assertThrows(NotACSVFileException.class, () ->
                new CSVReader("./src/Lab10/tests/image.csv", ",").read());
    }

    @Test
    void testFileNotFound() {
        assertThrows(FileNotFoundException.class, () ->
                new CSVReader("./src/Lab10/tests/hhhhh.csv", ",").read());
    }

    @Test
    void testEmptyField() {
        assertThrows(EmptyFieldException.class, () ->
                new CSVReader("./src/Lab10/tests/emptyfields.csv", ",").read());
    }

}