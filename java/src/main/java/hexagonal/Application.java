package hexagonal;

public class Application {
    private UI ui;

    public Application(UI ui) {
        this.ui = ui;
    }

    public void start() {
        String usersInput = ui.askForInput();

        ui.giveFeedback("You answered " + usersInput);
    }
}
