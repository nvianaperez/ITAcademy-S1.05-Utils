package S5_N1_E4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DirExercise4.readTxt(new File(args[0]));
//        DirExercise4.readTxt(new File("file.txt"));
    }
}

//Desde el directorio del paquete
//javac -d . *.java
//java S5_N1_E4.Main "C:\_PROGRAMMING\BackEnd_ITAcademy\Sprint1_S5\src\main\java\S5_N1_E4\file.txt"