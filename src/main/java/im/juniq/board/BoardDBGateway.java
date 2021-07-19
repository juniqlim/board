package im.juniq.board;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDBGateway implements BoardRepository {
    private final BoardJpaRepository boardJpaRepository;

    public BoardDBGateway(BoardJpaRepository boardJpaRepository) {
        this.boardJpaRepository = boardJpaRepository;
    }

    @Override
    public Board save(Board board) {
        return boardJpaRepository.save(board);
    }
}
