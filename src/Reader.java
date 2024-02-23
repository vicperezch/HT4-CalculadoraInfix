package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Victor Pérez
 * @since 23/02/2023
 * Clase que lee el archivo de texto con la expresión infix
 */
public class Reader {
    private File file;

    /**
     * Constructor de clase
     * @param fileName Nombre del archivo a leer
     */
    Reader(String fileName) {
        file = new File(fileName);
    }

    
    /**
     * Lee la operación en el archivo .txt
     * @return Operación del archivo
     */
    public String readFile() {
        String infix = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String line;
            while ((line = br.readLine()) != null) {
                infix = line;
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return infix;
    }
}
