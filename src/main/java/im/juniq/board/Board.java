package im.juniq.board;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String createdBy;
    private LocalDateTime createdAt;

    protected Board() {
    }

    private Board(String title, String content, String createdBy) {
        this.title = title;
        this.content = content;
        this.content = createdBy;
        this.createdAt = LocalDateTime.now();
    }

    public static Board of(String title, String content, String createdBy) {
        return new Board(title, content, createdBy);
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
        return id == board.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }
}
