package S5_N1_E1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DirExercise1 {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1) {
            System.out.println("Error: has de passar un directori");
        } else {
            try {
                listDirectory(args[0]);
            } catch (Exception e) {
                System.out.println("El directori no existeix o es buit");
            }
        }
    }

    private static void listDirectory(String arg) throws Exception {
        File directory = new File(arg);
        if(directory.listFiles() == null) {
            throw new Exception();
        }
        File[] files = directory.listFiles();
        Arrays.sort(files);
        for (File file : files) {
            System.out.println(file.getName());
        }

    }

}
