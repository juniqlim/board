package im.juniq.board;

import java.util.Collections;
import java.util.List;

public interface BoardRepository {
    Board save(Board board);

    List<Board> findAll();

    class Fake implements BoardRepository {
        private static final Board BOARD = Board.of("제목", "본문", "작성자");

        @Override
        public Board save(Board board) {
            return BOARD;
        }

        @Override
        public List<Board> findAll() {
            return Collections.singletonList(BOARD);
        }
    }
}
