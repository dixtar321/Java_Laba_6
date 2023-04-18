package funcs;
import java.io.*;

public class EncodingConverter {

    public static void main(String[] args) {
    if (args.length != 4) {
    System.out.println("Usage: java EncodingConverter in.txt out.txt sourceEncoding targetEncoding");
    System.exit(1);
    }
    
    String inFile = args[0];
    String outFile = args[1];
    String sourceEncoding = args[2];
    String targetEncoding = args[3];
    
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile), sourceEncoding));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), targetEncoding))) {
    
    String line;
    while ((line = reader.readLine()) != null) {
    writer.write(line);
    writer.newLine();
    }
    
    } catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
    System.exit(1);
    } catch (UnsupportedEncodingException e) {
    System.out.println("Unsupported encoding: " + e.getMessage());
    System.exit(1);
    } catch (IOException e) {
    System.out.println("Error reading/writing file: " + e.getMessage());
    System.exit(1);
    }
    
    System.out.println("Conversion completed successfully.");
    }
    
    }