package org.cap.bankapp.test;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class BankAppTestCase {

	private AccountServiceImpl accountService;

	@Mock
	private AccountDao accountDao;
	
	@Before
	public void setUp(){
		
	}
	
	
	@Test
	public void test() {
		accountService = new AccountServiceImpl();
		
	
		
	}
   
}
