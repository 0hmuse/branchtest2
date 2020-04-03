package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.Member100Vo;

public class Member100Manager {

	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static List<Member100Vo> listAll(){
		SqlSession session = factory.openSession();
		List<Member100Vo> list = session.selectList("member.selectAll");
		session.close();
		return list;
	}
	
	public static Member100Vo selectMemner(String username){
		SqlSession session = factory.openSession();
		Member100Vo m = session.selectOne("member.selectMember", username);
		session.close();
		return m;
	}
	
	public static int insertMember(Member100Vo m){
		SqlSession session = factory.openSession();
		int re = session.insert("member.insert",m);
		session.commit();
		session.close();
		return re;
	}
}
