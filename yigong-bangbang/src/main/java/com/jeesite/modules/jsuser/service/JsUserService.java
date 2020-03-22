/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.jsuser.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.jsuser.entity.JsUser;
import com.jeesite.modules.jsuser.dao.JsUserDao;

/**
 * js_userService
 * @author 星颜
 * @version 2020-03-21
 */
@Service
@Transactional(readOnly=true)
public class JsUserService extends CrudService<JsUserDao, JsUser> {
	
	/**
	 * 获取单条数据
	 * @param jsUser
	 * @return
	 */
	@Override
	public JsUser get(JsUser jsUser) {
		return super.get(jsUser);
	}
	
	/**
	 * 查询分页数据
	 * @param jsUser 查询条件
	 * @param jsUser.page 分页对象
	 * @return
	 */
	@Override
	public Page<JsUser> findPage(JsUser jsUser) {
		return super.findPage(jsUser);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param jsUser
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(JsUser jsUser) {
		super.save(jsUser);
	}
	
	/**
	 * 更新状态
	 * @param jsUser
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(JsUser jsUser) {
		super.updateStatus(jsUser);
	}
	
	/**
	 * 删除数据
	 * @param jsUser
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(JsUser jsUser) {
		super.delete(jsUser);
	}
	
}