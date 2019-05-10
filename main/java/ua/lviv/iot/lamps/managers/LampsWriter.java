package ua.lviv.iot.lamps.managers;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.lamps.models.*;

/*
public class LampsWriter {
    
   public void writeToFile(List<Lamps> lamps)
            throws IOException {
        File file = new File("lamps.txt");
     
        try (FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bufferedWriter = new BufferedWriter(osw);) {
                   
                bufferedWriter.write(lamps.get(0).getHeaders());
                bufferedWriter.newLine();
                
                for (int i = 0;i < lamps.size();i++) {
                
                bufferedWriter.write(lamps.get(i).toCSv());
                bufferedWriter.newLine();
           
            }
        }
    }
    }*/


