package com;

public class Member {

	private int point;
	
	public void recharge(int money) {
		if (money == 60) {
			point += 60;
		}else if (money == 156) {
			point += 180;
		}
	}

	public int getPoint() {
		return point;
	}

}
