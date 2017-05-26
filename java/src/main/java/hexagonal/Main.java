package hexagonal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        UI consoleUI = new ConsoleUI(writer, reader);

        Application application = new Application(consoleUI);
        application.start();

    }
}
