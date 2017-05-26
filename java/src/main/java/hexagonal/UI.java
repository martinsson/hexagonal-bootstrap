package hexagonal;

public interface UI {
    String askForInput();

    void giveFeedback(String message);
}
