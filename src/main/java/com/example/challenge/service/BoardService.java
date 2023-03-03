package com.example.challenge.service;

import com.example.challenge.domain.Board;
import com.example.challenge.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> getBoardList() {
        return (List<Board>) boardRepository.findAll();
    }


    public void insertBoard(Board board) {
        boardRepository.save(board);
    }

    public Board getBoard(Board board) {

        Board findBoard = boardRepository.findById(board.getId()).get();
        findBoard.setCnt(findBoard.getCnt()+1);
        boardRepository.save(findBoard);

        return findBoard;
    }

    public void updateBoard(Board board) {
        Board findBoard = boardRepository.findById(board.getId()).get();

        findBoard.setTitle(board.getTitle());
        findBoard.setContent(board.getContent());

        boardRepository.save(findBoard);
    }

    public void deleteBoard(Board board) {
        boardRepository.deleteById(board.getId());
    }
}
