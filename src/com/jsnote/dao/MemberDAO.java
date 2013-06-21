package com.jsnote.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jsnote.model.Member;

/**
 * Member DAO
 * 
 * @author JISU LEE
 */
public class MemberDAO {
	
	private SqlSessionFactory sqlSessionFactory; 
	
	public MemberDAO(){
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
	

	/**
	 * 데이터베이스로부터 모든 멤버를 리턴함
	 */
	@SuppressWarnings("unchecked")
	public List<Member> selectAll(){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			List<Member> list = session.selectList("Member.getAll");
			return list;
		} finally {
			session.close();
		}
	}

	/**
	 * 데이터베이스로부터 아이디로 검색한 한 명의 멤버를 리턴함
	 * @param id primary key value
	 */
	public Member selectById(int id){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			Member contact = (Member) session.selectOne("Member.getById",id);
			return contact;
		} finally {
			session.close();
		}
	}

	/**
	 * 데이버베이스에서 멤버 한 명의 정보 수정
	 */
	public void update(Member member){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			session.update("Member.update", member);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 데이터베이스에 새로운 멤버 추가
	 */
	public void insert(Member member){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			session.insert("Member.insert", member);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 데이터베이스에서 아이디로 검색한 멤버 삭제
	 */
	public void delete(int id){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			session.delete("Member.deleteById", id);
			session.commit();
		} finally {
			session.close();
		}
	}
}
