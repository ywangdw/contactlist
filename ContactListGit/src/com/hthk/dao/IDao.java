package com.hthk.dao;

import java.util.List;
import com.hthk.entity.Contact;

public interface IDao {
	
	public boolean add();
	public boolean delete();
	public boolean update();
	public List<Contact> list();
 
}
