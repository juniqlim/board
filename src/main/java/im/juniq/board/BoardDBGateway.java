package im.juniq.board;

import java.util.List;
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

    @Override
    public List<Board> findAll() {
        return boardJpaRepository.findAll();
    }
}
