package com.phyling.util;

import com.phyling.service.system.menu.impl.MenuService;
import com.phyling.service.system.role.impl.RoleService;
import com.phyling.service.system.user.UserManager;


/**
 * 说明：获取Spring容器中的service bean
 *@author com.phyling ming
 * com.phyling
 */
public final class ServiceHelper {
	
	public static Object getService(String serviceName){
		//WebApplicationContextUtils.
		return Const.WEB_APP_CONTEXT.getBean(serviceName);
	}
	
	public static UserManager getUserService(){
		return (UserManager) getService("userService");
	}
	
	public static RoleService getRoleService(){
		return (RoleService) getService("roleService");
	}
	
	public static MenuService getMenuService(){
		return (MenuService) getService("menuService");
	}
}
