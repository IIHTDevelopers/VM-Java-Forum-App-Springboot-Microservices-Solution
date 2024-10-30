package com.iiht.forum.usermicro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.iiht.forum.usermicro.entity.UserDetail;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetail, Integer>{
	List<UserDetail> findByEmailIdAndPassword(String emailId, String password);
	List<UserDetail> findByEmailId(String emailId);
}
