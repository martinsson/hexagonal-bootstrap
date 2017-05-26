package hexagonal;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class ConsoleUITest {
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Test
    public void askUserForInput() throws Exception {
        ConsoleUI ui = newUi();

        ui.askForInput();

        String capturedOutput = out.toString();
        Assert.assertEquals("What do you want?\n", capturedOutput);
    }

    @Test
    public void askingForInputReturnsTheAnswer() throws Exception {
        String userAnswer = "Some Answer";
        ConsoleUI ui = newUi(userAnswer);

        String answer = ui.askForInput();

        Assert.assertEquals("Some Answer", answer);
    }

    @Test
    public void giveFeedback() throws Exception {
        ConsoleUI ui = newUi();

        ui.giveFeedback("The answer is 42.");

        String capturedOutput = out.toString();
        Assert.assertEquals("The answer is 42.\n", capturedOutput);
    }

    private ConsoleUI newUi() {
        String unimportantUserAnswer = "";
        return newUi(unimportantUserAnswer);
    }

    private ConsoleUI newUi(String userAnswer) {
        String EOL = "\n";
        StringReader in = new StringReader(userAnswer + EOL);
        PrintWriter writer = new PrintWriter(out);
        BufferedReader reader = new BufferedReader(in);
        return new ConsoleUI(writer, reader);
    }

}
