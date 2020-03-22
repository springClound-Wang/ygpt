/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.jsuser.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * js_userEntity
 * @author 星颜
 * @version 2020-03-21
 */
@Table(name="${_prefix}user", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="name", attrName="name", label="name", queryType=QueryType.LIKE),
	}, orderBy="a.id DESC"
)
public class JsUser extends DataEntity<JsUser> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	
	public JsUser() {
		this(null);
	}

	public JsUser(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="name长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}