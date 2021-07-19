package im.juniq.board;

import static im.juniq.board.BoardTest.BOARD;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BoardServiceTest {
    @Test
    void save() {
        BoardService boardService = new BoardService(new BoardRepository.Fake());
        Board savedBoard = boardService.save(BOARD);
        Board findedBoard = boardService.findAll().stream()
            .findFirst()
            .orElseThrow(() -> new IllegalStateException());

        assertThat(savedBoard).isEqualTo(findedBoard);
    }
}
