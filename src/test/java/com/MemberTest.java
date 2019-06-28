package com;

import org.junit.Assert;
import org.junit.Test;

public class MemberTest {

	@Test
	public void should_add_60_points_when_recharg_60(){
		Member member = new Member();
		
		member.recharge(60);
		
		Assert.assertEquals(60, member.getPoint());
	}
	
	@Test
	public void should_add_180_when_recharge_156(){
		Member member = new Member();
		
		member.recharge(156);
		
		Assert.assertEquals(180, member.getPoint());
	}
}
