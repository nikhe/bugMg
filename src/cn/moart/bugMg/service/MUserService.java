package cn.moart.bugMg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.moart.bugMg.bean.MUser;
import cn.moart.bugMg.dao.MUserDao;

@Service
public class MUserService {
	@Autowired
	private MUserDao dao;
	
	/**
	 * 检索所有的User
	 */
	@Cacheable(value="userListCache")
	public List<MUser> getAll() {
		System.out.println("userlist,cache");
		return dao.getAll();
	}
}
