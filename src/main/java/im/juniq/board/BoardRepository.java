package im.juniq.board;

public interface BoardRepository {
    Board save(Board board);

    class Fake implements BoardRepository {
        @Override
        public Board save(Board board) {
            return Board.of("제목", "본문");
        }
    }
}
