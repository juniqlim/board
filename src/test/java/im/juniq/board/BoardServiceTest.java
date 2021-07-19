package im.juniq.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BoardServiceTest {
    @Test
    void save() {
        BoardService boardService = new BoardService(new BoardRepository.Fake());
        assertThat(boardService.save(BoardTest.BOARD)).isEqualTo(BoardTest.BOARD);
    }
}
