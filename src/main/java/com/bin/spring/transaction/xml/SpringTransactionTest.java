package com.bin.spring.transaction.xml;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTransactionTest {
	
	private ApplicationContext ctx = null ;
	
//	private BookShopDao bookShopDao = null ;
	private BookShopService bookShopService = null ;
	private Cashier cashier = null ;
	{
		ctx = new ClassPathXmlApplicationContext("transaction.xml") ;
//		bookShopDao = ctx.getBean(BookShopDao.class) ;
		bookShopService = ctx.getBean(BookShopService.class) ;
		cashier = ctx.getBean(Cashier.class) ;
	}
	
	@Test
	public void testPurchase(){
		bookShopService.purchase("AA", "1001");
	}
	
	/**
	 * 
	 */
	@Test
	public void testTransationalCashier(){
		cashier.checkout("AA", Arrays.asList("1001","1002"));
	}
	
	
	

}
