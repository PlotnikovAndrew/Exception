package ru.otus.HW.HOMEWORK_6;

import java.io.File;
import java.time.*;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writer(){
        File file = new File("/home/andrey/otus/HW/java-basic-22-09/HOMEWORK/HOMEWORK_6/Exception/src/ru/otus/HW/HOMEWORK_6/notes.txt");


        try(FileWriter writer = new FileWriter(file, true)) {
            LocalDate d = LocalDate.now();
            String text = "Exception " + d;
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
