package com.tsr.dao;

import com.tsr.pojo.Admin;

public interface AdminMapper {
	
	
	public Admin findAdmin(Long phone, String password);

	public Admin findAdminById(Integer id);

	public void updateAdmin(Admin admins);

}
