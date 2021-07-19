package im.juniq.board;

import java.util.Objects;

public class Board {
    private String title;
    private String content;

    private Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Board of(String title, String content) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Board board = (Board) o;
        return Objects.equals(title, board.title) && Objects.equals(content, board.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }
}
