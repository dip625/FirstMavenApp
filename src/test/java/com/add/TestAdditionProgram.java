package com.add;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestAdditionProgram {
	
	@Test
	public void testAddMethod1() {
		AdditionProgram addObj = new AdditionProgram();
		//int addMEthod1 = addObj.addMEthod1(3, 4);
		//Assert.assertEquals(0, addMEthod1);
	}
	
	@Test
	public void testAdditionSErviceMethod() {
		AdditionService service =  mock(AdditionService.class);
		when(service.getSum()).thenReturn(24);
		
		AdditionProgram addObj = new AdditionProgram();
		AdditionService additionService = addObj.getAdditionService();
		additionService.addMEthod1(12, 12);
		
		Assert.assertEquals(service.getSum(), additionService.getSum());
		
	}
}
