package chessgame.point;

public enum Rank {
    A("a"),
    B("b"),
    C("c"),
    D("d"),
    E("e"),
    F("f"),
    G("g"),
    H("h");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }
}
