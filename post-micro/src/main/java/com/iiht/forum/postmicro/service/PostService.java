package com.iiht.forum.postmicro.service;



import com.iiht.forum.postmicro.dto.PostDetailDto;
import com.iiht.forum.postmicro.dto.PostDetailListDto;
import com.iiht.forum.postmicro.dto.PostDto;

public interface PostService {

	public PostDetailDto addPost(PostDto post, Integer userId);
	public PostDetailDto getPost(Integer postId);
	public Integer addLike(Integer postId);
	public PostDetailListDto getPosts(Integer userId);
}
