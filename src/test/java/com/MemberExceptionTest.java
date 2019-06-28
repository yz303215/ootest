package com;

import org.junit.Test;

public class MemberExceptionTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void should_throws_ille_exception_when_recharge_0_yuan() {
		Member member = new Member();
		
		member.recharge(0);
	}
}
