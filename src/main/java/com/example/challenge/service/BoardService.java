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

    public List<Board> getBoardList(Board board) {
        return (List<Board>) boardRepository.findAll();
    }
}
