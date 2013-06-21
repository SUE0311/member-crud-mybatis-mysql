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
	 * �����ͺ��̽��κ��� ��� ����� ������
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
	 * �����ͺ��̽��κ��� ���̵�� �˻��� �� ���� ����� ������
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
	 * ���̹����̽����� ��� �� ���� ���� ����
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
	 * �����ͺ��̽��� ���ο� ��� �߰�
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
	 * �����ͺ��̽����� ���̵�� �˻��� ��� ����
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
