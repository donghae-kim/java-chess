package chessgame.domain.piece;

import chessgame.domain.Team;

public class Rook implements Piece {
    private static final String ORIGINAL_NAME = "r";

    private final String name;

    private Rook(String name) {
        this.name = name;
    }

    public static Rook from(Team team) {
        return new Rook(team.calculate(ORIGINAL_NAME));
    }

    @Override
    public String toString() {
        return name;
    }
}