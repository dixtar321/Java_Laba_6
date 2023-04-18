import funcs.FormattedInput;
import funcs.EncodingConverter;

import java.io.File;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main{
    public static void main(String[] args) {
    // Пример использования scanf
    FormattedInput fi = new FormattedInput();

    Object[] values = fi.scanf("%d %s %c");
    int intValue = (int) values[0];
    String stringValue = (String) values[1];
    char charValue = (char) values[2];

    System.out.println("scanf result: " + intValue + " " + stringValue + " " + charValue);

    // Пример использования sscanf
    FormattedInput fi_2 = new FormattedInput();
    String input = "42 hello w";

    Object[] parsedValues = fi_2.sscanf("%d-%s-%c", input); //split %
    int parsedIntValue = (int) parsedValues[0];
    String parsedStringValue = (String) parsedValues[1];
    char parsedCharValue = (char) parsedValues[2];
    System.out.println("sscanf result: " + parsedIntValue + " " + parsedStringValue + " " + parsedCharValue);

    //Пример использования EncodingConverter
    // String inputFileName = "input.txt";
    // String outputFileName = "output.txt";
    // String inputEncoding = "Windows-1251";
    // String outputEncoding = "UTF-8";
    // String massage = "Hello World! Привет мир";

    // File inputFile = new File(inputFileName);
    // try (Writer writer = new OutputStreamWriter(new FileOutputStream(inputFile), inputEncoding)) {
    //     writer.write(massage);
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }

    //EncodingConverter.main(new String[] {});

    // File outputFile = new File(outputFileName);
    // try (Reader reader = new InputStreamReader(new FileInputStream(outputFile), outputEncoding)) {
    //     char[] buffer = new char[(int)outputFile.length()];
    //     reader.read(buffer);
    //     String output = new String(buffer);

    //     System.out.println(output);
    //     System.out.println(massage);

    //     if (output.equals(massage)) {
    //         System.out.println("Test passed!");
    //     } else {
    //         System.out.println("Test failed: output is not as expected.");
    //     }
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }
}
}