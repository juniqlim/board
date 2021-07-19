package im.juniq.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("IntegrationTest")
class BoardServiceIntegrationTest {
    @Autowired
    private BoardService boardService;

    @Test
    void save() {
        Board savedBoard = boardService.save(BoardTest.BOARD);
        Board findedBoard = boardService.findAll().stream()
            .findFirst()
            .orElseThrow(() -> new IllegalStateException());

        assertThat(findedBoard).isEqualTo(savedBoard);
    }
}
