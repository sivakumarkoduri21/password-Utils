package com.siva.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class SecurityUtils {

int id=100;
	public static String encode(String plainText) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(plainText.getBytes());
	}

	public static String decode(String planinText) {

		Decoder decoder = Base64.getDecoder();
		byte[] decoderText = decoder.decode(planinText);
		return new String(decoderText);
	}
	
	public static void main(String[] args) {
		String s=SecurityUtils.encode("sivakumar");
		System.out.println(s);
		String s1=SecurityUtils.decode("c2l2YWt1bWFy");
		System.out.println(s1);
	}
}
