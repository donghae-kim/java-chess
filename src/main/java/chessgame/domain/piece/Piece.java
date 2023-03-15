package chessgame.domain.piece;

import chessgame.domain.point.Point;

public interface Piece {
    boolean isMovable(Point source, Point target);
}
