package Hwork2;

import java.io.File;

public class task2_1 {
    public static void main(String[] args) {
        detectFileExtensions();
    }

    public static void detectFileExtensions() {
        File folder = new File(".");
        File[] files = folder.listFiles();

        if (files != null) {
            int count = 1;
            for (File file : files) {
                if (file.isFile()) {
                    String filename = file.getName();
                    int dotIndex = filename.lastIndexOf(".");
                    if (dotIndex != -1 && dotIndex < filename.length() - 1) {
                        String extension = filename.substring(dotIndex + 1);
                        System.out.println(count + " Расширение файла: " + extension);
                        count++;
                    }
                }
            }
        }
    }
    
}
