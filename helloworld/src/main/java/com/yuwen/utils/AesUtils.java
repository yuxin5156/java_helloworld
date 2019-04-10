package com.yuwen.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Aes加密帮助类
 * 
 * @author Administrator
 *
 */
public class AesUtils {

	private static String sKey = "abcdef0123456789";
	private static String ivParameter = "0123456789abcdef";

	/**
	 * 加密
	 * 
	 * @param text 明文
	 * @return
	 * @throws InvalidAlgorithmParameterException
	 * @throws NoSuchPaddingException
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws InvalidKeyException
	 */
	public static String encrypt(String text)
			throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {
		return encrypt(sKey, text);
	}

	/**
	 * 加密
	 * 
	 * @param key  密钥
	 * @param text 明文
	 * @return
	 * @throws InvalidAlgorithmParameterException
	 * @throws NoSuchPaddingException
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws InvalidKeyException
	 */
	public static String encrypt(String key, String text)

			// 处理key
			throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {
		return encrypt(key, ivParameter, text);
	}

	/**
	 * 加密
	 * 
	 * @param key  密钥
	 * @param iv   密钥向量
	 * @param text 明文
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws NoSuchPaddingException
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidAlgorithmParameterException
	 * @throws InvalidKeyException
	 */
	public static String encrypt(String key, String iv, String text)
			throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		Cipher cipher;
		cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] raw = sKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		IvParameterSpec ivps = new IvParameterSpec(iv.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivps);
		byte[] encrypted = cipher.doFinal(text.getBytes("utf-8"));
		String result = Base64.getEncoder().encodeToString(encrypted);
		return result;
	}

	public static String decrypt(String text) {

		return decrypt(sKey, text);
	}

	public static String decrypt(String key, String text) {

		return decrypt(key, ivParameter, text);
	}

	public static String decrypt(String key, String iv, String text) {

		return "";
	}

	public static void main(String[] args)
			throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {
		System.out.println(encrypt("123456"));
	}
}
