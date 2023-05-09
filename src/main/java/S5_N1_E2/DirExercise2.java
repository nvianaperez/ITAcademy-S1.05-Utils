package S5_N1_E2;

import java.io.File;
import java.util.Arrays;

public class DirExercise2 {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1) {
            System.out.println("Error: has de passar només un directori");
        } else {
            listTreeDirectory(args[0]);
        }
    }

    private static void listTreeDirectory(String arg) {
        File directory = new File(arg);
              File[] files = directory.listFiles();
        Arrays.sort(files);

        for (File file : files) {
            String lastDateUpdated = String.valueOf(file.lastModified());

            if (file.isDirectory()) {
                System.out.println("D ---> " + file.getName() + " -------- " + lastDateUpdated);
                listTreeDirectory(file.getAbsolutePath()); //recursively
            } else {
                System.out.println("F ---> " + file.getName() + " -------- " + lastDateUpdated);
            }
        }


    }
}
