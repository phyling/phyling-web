package com.phyling.util;

import java.util.UUID;

/**
 * 说明：UuidUtil
 * @author com.phyling ming
 * com.phyling
 */
public class UuidUtil {

	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
	public static void main(String[] args) {
		System.out.println(get32UUID());
	}
}

