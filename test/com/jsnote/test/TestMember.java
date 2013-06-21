package com.jsnote.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jsnote.dao.MemberDAO;
import com.jsnote.model.Member;

/**
 * Test Case
 * 
 * @author JISU LEE
 */
public class TestMember {
	
	private static MemberDAO memberDAO;

	@BeforeClass
	public static  void runBeforeClass() {
		memberDAO = new MemberDAO();
	}

	@AfterClass
	public static void runAfterClass() {
		memberDAO = null;
	}

	/**
	 * {@link com.jsnote.dao.MemberDAO#selectAll()}을 테스트하는 메서드
	 */
	@Test
	public void testSelectAll() {
		List<Member> list = memberDAO.selectAll();
		assertNotNull(list);
		assertEquals(15, list.size());
	}

	/**
	 * {@link com.jsnote.dao.MemberDAO#selectById(int)}을 테스트하는 메서드
	 */
	@Test
	public void testSelectById() {
		
		Member actual = new Member(1, "Member01", "(02) 123-4567", "member01@jsnote.com");
		
		Member expected = memberDAO.selectById(1);
		
		assertNotNull(expected);
		assertEquals(actual, expected);
		assertNotSame(actual, expected);
	}

	/**
	 * {@link com.jsnote.dao.MemberDAO#update(com.jsnote.model.Member)}을 테스트하는 메서드
	 */
	@Test
	public void testUpdate() {

		Member actual = new Member(2, "Member02-Updated", "(02) 765-4321", "member02-updated@jsnote.com");
		
		Member expected = memberDAO.selectById(2);
		expected.setEmail("member02-updated@jsnote.com");
		expected.setName("Member02-Updated");
		expected.setPhone("(02) 765-4321");
		memberDAO.update(expected);
		expected = memberDAO.selectById(2);
	
		assertNotNull(expected);
		assertEquals(actual, expected);
		assertNotSame(actual, expected);
	}

	/**
	 * {@link com.jsnote.dao.MemberDAO#insert(com.jsnote.model.Member)}을 테스트하는 메서드
	 */
	@Test
	public void testInsert() {
		
		Member actual = new Member();
		actual.setName("Member16");
		actual.setPhone("(02) 123-4567");
		actual.setEmail("member16@jsnote.com");
		memberDAO.insert(actual);
		
		assertEquals(16, actual.getId());
		
		Member expected = memberDAO.selectById(actual.getId()); 
		
		assertEquals(actual, expected);
		assertNotSame(actual, expected);
	}

	/**
	 * {@link com.jsnote.dao.MemberDAO#delete(int)}을 테스트하는 메서드
	 */
	@Test
	public void testDelete() {
		
		memberDAO.delete(15);
		
		Member expected = memberDAO.selectById(15);
		
		assertNull(expected);
	}

}
