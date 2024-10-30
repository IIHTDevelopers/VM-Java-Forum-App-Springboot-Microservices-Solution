package com.iiht.forum.usermicro.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.iiht.forum.usermicro.dto.RegisterDto;
import com.iiht.forum.usermicro.dto.UserDetailDto;
import com.iiht.forum.usermicro.entity.UserDetail;

public interface UserService {

	UserDetailDto login(String emailId, String password);
	UserDetailDto register(RegisterDto registerDto);
	boolean checkAlreadyInUse(String emailId);
	UserDetailDto getUserDetails(Integer id);
	List<UserDetailDto> getRegisteredUserList();
}
