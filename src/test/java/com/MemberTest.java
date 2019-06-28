package com;

import java.util.Arrays;
import java.util.Collection;

import javax.xml.crypto.Data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MemberTest {
	
	private int money;
	private int point;
	
	public MemberTest(int money, int point) {
		this.money = money;
		this.point = point;
	}

	@Parameters
	public static Collection<Object[]> Parameters(){
		Object[][] objects = new Object[][]{
			{60,60},
			{156,180},
			{200,300}
			
		};
		return Arrays.asList(objects);
	}

	@Test
	public void should_add_60_points_when_recharg_60(){
		Member member = new Member();
		
		member.recharge(money);
		
		Assert.assertEquals(point, member.getPoint());
	}
	
	
	
}
