package com.isell.core.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

/**
 * 基础加密组件
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public final class Coder {
    public static final String KEY_SHA = "SHA-1";
    
    public static final String KEY_MD5 = "MD5";
    
    private static final String UTF8 = "utf-8";
    
    /**
     * MAC算法可选以下多种算法
     * 
     * <pre>
     * HmacMD5 
     * HmacSHA1 
     * HmacSHA256 
     * HmacSHA384 
     * HmacSHA512
     * </pre>
     */
    public static final String KEY_MAC = "HmacMD5";
    
    /**
     * BASE64解密
     * 
     * @param key
     * @return
     */
    public static byte[] decryptBASE64(String key) {
        return Base64.decodeBase64(key);
    }
    
    /**
     * BASE64加密
     * 
     * @param key key
     * @return
     */
    public static String encryptBASE64(String key) {
        try {
            return new String(Base64.encodeBase64(key.getBytes(UTF8)));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * BASE64加密
     * 
     * @param key
     * @return
     */
    public static String encryptBASE64(byte[] key) {
        return new String(Base64.encodeBase64(key));
    }
    
    /**
     * MD5加密，返回String
     * 
     * @param data data
     * @return 加密后的字符串
     */
    public static String encodeMd5(String data) {
        return Hex.encodeHexString(encryptMD5(data));
    }
    
    /**
     * MD5加密
     * 
     * @param data
     * @return
     */
    public static byte[] encryptMD5(String data) {
        try {
            return encryptMD5(data.getBytes(UTF8));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * MD5加密
     * 
     * @param data
     * @return
     */
    public static byte[] encryptMD5(byte[] data) {
        try {
            MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
            md5.update(data);
            return md5.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * SHA1加密
     * 
     * @param data
     * @return
     */
    public static byte[] encryptSHA1(byte[] data) {
        try {
            MessageDigest sha = MessageDigest.getInstance(KEY_SHA);
            sha.reset();
            sha.update(data);
            return sha.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * SHA1加密，返回String
     * 
     * @param data data
     * @return 加密后的字符串
     */
    public static String encodeSHA1(String data) {
        try {
            return Hex.encodeHexString(encryptSHA1(data.getBytes(UTF8)));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * 初始化HMAC密钥
     * 
     * @return
     */
    public static String initMacKey() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_MAC);
            SecretKey secretKey = keyGenerator.generateKey();
            return encryptBASE64(secretKey.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * HMAC加密
     * 
     * @param data
     * @param key
     * @return
     */
    public static byte[] encryptHMAC(byte[] data, String key) {
        
        SecretKey secretKey = new SecretKeySpec(decryptBASE64(key), KEY_MAC);
        try {
            Mac mac = Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            return mac.doFinal(data);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * encodeUrl
     * 
     * @param url url
     * @return encodeUrl
     */
    public static String encodeUrl(String url) {
        try {
            return URLEncoder.encode(url, UTF8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * deodeUrl
     * 
     * @param url url
     * @return encodeUrl
     */
    public static String deodeUrl(String url) {
        try {
            return URLDecoder.decode(url, UTF8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
