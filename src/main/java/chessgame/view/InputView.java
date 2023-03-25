package chessgame.view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public String readCommand() {
        return scanner.nextLine();
    }

    public String readGameName() {
        return scanner.nextLine();
    }
}
