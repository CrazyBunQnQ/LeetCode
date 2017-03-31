package com.crazybunqnq.test;

import com.crazybunqnq.easy.*;
import com.crazybunqnq.utils.TimeUtil;

public class MainTest {

	public static void main(String[] args) {
		TimeUtil.setCurrentTime();
		ReverseInteger.test();
		System.out.println(TimeUtil.runTime());
	}

}
