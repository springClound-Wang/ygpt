/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.jsuser.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.jsuser.entity.JsUser;

/**
 * js_userDAO接口
 * @author 星颜
 * @version 2020-03-21
 */
@MyBatisDao
public interface JsUserDao extends CrudDao<JsUser> {
	
}