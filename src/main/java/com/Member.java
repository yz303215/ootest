package com;

import java.util.logging.Logger;

public class Member {
	private static final Logger LOGGER = Logger.getLogger(Member.class.getName());
	private int point;
	
	
	
	public void recharge(int money) {
		if (money == 60) {
			point += 60;
		}else if (money == 156) {
			point += 180;
		}else  {
			LOGGER.info("充值金额不合法");
			throw new IllegalArgumentException("充值金额不合法");
		}
		LOGGER.info("充值成功");
	}

	public int getPoint() {
		return point;
	}

}
