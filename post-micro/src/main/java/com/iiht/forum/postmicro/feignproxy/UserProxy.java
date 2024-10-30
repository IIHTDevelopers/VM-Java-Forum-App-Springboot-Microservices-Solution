package com.iiht.forum.postmicro.feignproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iiht.forum.postmicro.dto.UserDetailDto;



@FeignClient(name = "") 
public interface UserProxy {
	@GetMapping("/user-micro/api/user/get/{id}")
	public ResponseEntity<UserDetailDto> getUserDetails(@PathVariable("id") String id);
}
