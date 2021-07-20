package im.juniq.board;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class BoardTest {
    public static final Board BOARD = Board.of("제목", "본문", "작성자");

    @Test
    void create() {
        assertThatCode(() -> Board.of("제목", "본문", "작성자")).doesNotThrowAnyException();
    }
}
