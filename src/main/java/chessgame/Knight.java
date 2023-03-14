package chessgame;

public class Knight {
    private static final String ORIGINAL_NAME = "n";

    private final String name;

    private Knight(String name) {
        this.name = name;
    }

    public static Knight from(Team team) {
        return new Knight(team.calculate(ORIGINAL_NAME));
    }

    @Override
    public String toString() {
        return name;
    }
}
