package hexagonal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ConsoleUI implements UI {
    private PrintWriter writer;
    private BufferedReader reader;

    public ConsoleUI(PrintWriter writer, BufferedReader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public String askForInput() {
        writer.println("What do you want?");
        writer.flush();
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void giveFeedback(String message) {
        writer.println(message);
        writer.flush();
    }
}
