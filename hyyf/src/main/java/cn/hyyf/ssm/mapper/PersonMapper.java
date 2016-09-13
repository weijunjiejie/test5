package cn.hyyf.ssm.mapper;

import java.util.List;

import cn.hyyf.ssm.domain.Person;

public interface PersonMapper {
	public List<Person> listAll();
	
	public int addRecord(Person p);
	
	public int saveOrUpdate(Person p);
	
	public Person getDetail(String id);
}
