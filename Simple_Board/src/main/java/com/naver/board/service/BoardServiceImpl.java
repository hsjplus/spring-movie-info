package com.naver.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.board.dao.BoardDao;
import com.naver.board.domain.BoardVO;

// ���񽺴ܿ��� Service�� ������̼��Ѵ�
// root-context.xml�� bean�� �߰��ȴ�
@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDao boardDao;

	@Override
	public List<BoardVO> selectAll(String val) throws Exception {
		
		return boardDao.selectAll(val);
	}
	
}