package im.juniq.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceIntegrationTest {
    @Autowired
    private BoardService boardService;

    @Test
    void save() {
        assertThat(boardService.save(BoardTest.BOARD)).isEqualTo(BoardTest.BOARD);
    }
}
