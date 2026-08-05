import java.io.*;

public class Inverter {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        inverter(teclado);
    }

    public static void inverter(BufferedReader teclado) throws IOException {
        char letra;
        letra = (char) teclado.read();
        if (letra != '\n') {
            inverter(teclado);
            System.out.print(letra);
        }
    }
}