package com.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLinkList {

	LinkList<Integer> l;
	
	@Before
	public void setUp(){
		l = new LinkList<Integer>();
		l.add(10);
	}
	
	@Test
	public void testAdd() {
		Assert.assertTrue(l.add(20));
		Assert.assertTrue(l.size == 2);
		System.out.println(l);
	}
	
	@Test
	public void testFirst() {
		Assert.assertTrue(new Integer(10).equals( l.first.element));
		System.out.println(l);
	}
	
	@Test
	public void testRemoveFirst() {
		l.add(2000);
		Assert.assertTrue(l.remove(10));
		Assert.assertTrue(l.size == 1);
		System.out.println(l);
	}
	
	@Test
	public void testRemoveMiddle() {
		l.add(2000);
		l.add(4000);
		Assert.assertTrue(l.remove(2000));
		System.out.println(l);
	}

}
