package com.naver.board.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.board.domain.BoardVO;
import com.naver.board.service.BoardService;

@Controller
public class BoardController {

	@Inject
	private BoardService boardService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String selectAll(Model model, HttpServletRequest req) throws Exception{
		
		String val = req.getParameter("table");
		List<BoardVO> boardYear = boardService.selectAll(val);
		model.addAttribute("boardYear", boardYear);
		
		return "home";
	}
	
	@RequestMapping(value="/boardOne", method=RequestMethod.GET)
	public String selectOne(Model model, HttpServletRequest req) throws Exception{
		
		String val = req.getParameter("table");
		BoardVO boardOne = boardService.selectOne(val);
		model.addAttribute("boardOne", boardOne);
		
		return "home";
	}
	
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String selectYear(Model model, HttpServletRequest req) throws Exception{
		
		String year = req.getParameter("year");
		String name = req.getParameter("name");
		List<BoardVO> boardYear = boardService.selectYear(year, name);
		model.addAttribute("boardYear", boardYear);
		
		return "home";
	}
	
	
}
