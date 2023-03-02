package com.example.challenge.controller;

import com.example.challenge.domain.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BoardController {

    @RequestMapping("/testBoardList")
    public String testBoardList(Model model) {
        List<Board> boardList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            Board board = new Board();
            board.setId(new Long(i));
            board.setTitle("제목 " + i);
            board.setContent("내용 " + i);
            board.setWriter("작성자 " + i);
            board.setCreateDate(new Date());
            board.setCnt(0L);
            boardList.add(board);
        }
        model.addAttribute("boardList", boardList);
        return "testBoardList";
    }
}
