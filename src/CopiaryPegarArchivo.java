import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaryPegarArchivo {
    public static void main(String[] args) {

        //declaramos un lector y un escritor
        try (BufferedReader lector = new BufferedReader(new FileReader("origen.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("destino.txt"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }

            System.out.println("archivo copiado");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());

        }
    }
}
