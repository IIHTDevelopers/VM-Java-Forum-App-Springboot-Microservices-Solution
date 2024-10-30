package com.iiht.forum.postmicro.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.iiht.forum.postmicro.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{
	List<Comment> findByPostId(Integer postId);
}
