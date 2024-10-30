package com.iiht.forum.postmicro.dto;


import java.util.List;


public class PostDetailListDto {
	private Integer userId;
	private List<PostDetailDto> postDetailDtos;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<PostDetailDto> getPostDetailDtos() {
		return postDetailDtos;
	}
	public void setPostDetailDtos(List<PostDetailDto> postDetailDtos) {
		this.postDetailDtos = postDetailDtos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postDetailDtos == null) ? 0 : postDetailDtos.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostDetailListDto other = (PostDetailListDto) obj;
		if (postDetailDtos == null) {
			if (other.postDetailDtos != null)
				return false;
		} else if (!postDetailDtos.equals(other.postDetailDtos))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
}
