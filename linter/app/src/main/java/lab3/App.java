/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class App {

    public static void main(String[] args) throws IOException {
//        String ttt = File.separator;
        String basePath = new File("").getCanonicalPath();
//        String path = new File("src/main/resources/gates.js")
//                .getAbsolutePath();
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Path p1 = Paths.get(basePath+"/app/src/main/resources/gates.js");
//        if (ttt.equals("\\")){

//        }else{
//            p1 = Paths.get(basePath+"/src/main/resources/gates.js");
//        }
        System.out.println(p1);
        missingSemicolon(p1);
    }

    public static HashMap<String, Integer> missingSemicolon(Path p1){
        int errorNum = 0;
        int lineNum = 0;
        try {
            File file = new File(String.valueOf(p1));    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters
            String line;

            while ((line = br.readLine()) != null) {
                lineNum = lineNum + 1;
                if (!line.contains(";")
                        && !line.endsWith("}")
                        && !line.endsWith("{")
                        && !line.contains("if")
                        && !line.contains("else")
                        && !line.startsWith("//")
                        && !line.isBlank()
                ) {
                    errorNum = errorNum + 1;
                    System.out.println("Line " + lineNum + ": Missing semicolon.");
                }
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources

        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String, Integer> lines= new HashMap<>();

        lines.put("ErrorCount", errorNum);
        lines.put("LineCount", lineNum);

        return lines;
    }
}