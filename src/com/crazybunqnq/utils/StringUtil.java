package com.crazybunqnq.utils;

/**
 * 字符串工具集合
 *
 * Created by CrazyBun on 2016/6/30.
 */
public class StringUtil {
	/**
	 * 反转字符串，效率比StringBuffer.reverse快一倍
	 * 
	 * @param s
	 * @return
	 */
	public static String stringReverse(String s) {
		char[] word = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);
	}
}
