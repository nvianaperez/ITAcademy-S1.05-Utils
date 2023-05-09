package S5_N1_E4;

//import S5_N1_E3.DirExercise3;


import java.io.*;

public class DirExercise4 {

    public static void readTxt(File file) {

        try (FileReader f = new FileReader(file); BufferedReader b = new BufferedReader(f)){
            while (b.readLine() != null) {
                if(!b.readLine().isEmpty()) {
                    System.out.println(b.readLine());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static void readTxtInputStream() {

        InputStream inputStream = DirExercise4.class.getResourceAsStream("file.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try(inputStreamReader; bufferedReader) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
//    ToDo: resolver la Exception in thread "main" java.lang.NullPointerException

}
