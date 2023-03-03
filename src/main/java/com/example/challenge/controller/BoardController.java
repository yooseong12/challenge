package com.example.challenge.controller;

import com.example.challenge.domain.Board;
import com.example.challenge.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/getBoardList")
    public String getBoardList(Model model) {
        List<Board> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "getBoardList";
    }

    @RequestMapping("/insertBoardView")
    public String insertBoardView() {
        return "insertBoard";
    }

    @RequestMapping("/insertBoard")
    public String insertBoard(Board board) {
        boardService.insertBoard(board);
        return "redirect:getBoardList";
    }

    @RequestMapping("/getBoard")
    public String getBoard(Board board, Model model) {
        model.addAttribute("board", boardService.getBoard((board)));
        return "getBoard";
    }

    @RequestMapping("/updateBoardView")
    public String updateBoardView(Board board, Model model) {
        model.addAttribute("board", boardService.getBoard((board)));
        return "updateBoard";
    }

    @RequestMapping("/updateBoard")
    public String updateBoard(Board board) {
        boardService.updateBoard(board);
        return "forward:getBoardList";
    }

    @RequestMapping("/deleteBoard")
    public String deleteBoard(Board board) {
        boardService.deleteBoard(board);
        return "forward:getBoardList";
    }
}
