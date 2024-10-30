package com.iiht.forum.postmicro.service;

import java.util.List;

import com.iiht.forum.postmicro.dto.CommentDetailDto;
import com.iiht.forum.postmicro.dto.CommentDto;

public interface CommentService {
	public CommentDetailDto addComment(CommentDto comment, Integer postId, Integer userId);
	public CommentDetailDto getComment(Integer commentId);
	public Integer addLike(Integer commentId);
	public List<CommentDetailDto> getComments(Integer postId);
}
