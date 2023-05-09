package S5_N1_E3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DirExercise3 {

    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1) {
            System.out.println("Error: has de passar només un directori");
        } else {
            List<String> listTree = new ArrayList<>();
            listTreeDirectory(args[0], listTree);
            writeTxt(listTree);
        }
    }

    public static void listTreeDirectory(String arg, List<String> listTree) {
        File directory = new File(arg);
        File[] files = directory.listFiles();
        Arrays.sort(files);

        for (File file : files) {
            long lastModified = file.lastModified();
            Date date = new Date(lastModified);
            String lastDateUpdated = date.toString();
            if (file.isDirectory()) {
                listTree.add("D --> "+file.getName()+" -------- "+lastDateUpdated);
                listTreeDirectory(file.getAbsolutePath(), listTree); //recursively
            } else {
                listTree.add("F --> "+file.getName()+" -------- "+lastDateUpdated);
            }
        }
    }

    public static void writeTxt (List<String> listTree) {
        String pathFile = "C:\\_PROGRAMMING\\BackEnd_ITAcademy\\Sprint1_S5\\src\\main\\java\\S5_N1_E3\\treeFile.txt";
        File f = new File(pathFile);
        try(FileWriter fr = new FileWriter(f); BufferedWriter b = new BufferedWriter(fr)) {
            for ( String line : listTree ) {
                b.write(line + "\n");
//                b.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
