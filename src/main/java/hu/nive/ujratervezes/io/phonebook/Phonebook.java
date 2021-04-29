package hu.nive.ujratervezes.io.phonebook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {

        File file = new File(output);

        try {
            if (contacts == null) {
                throw new IllegalArgumentException();
            }

            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                bufferWriter.write(entry.getKey() + ": " + entry.getValue());
                bufferWriter.newLine();
            }

            bufferWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}