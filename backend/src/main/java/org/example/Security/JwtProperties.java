package org.example.Security;

public class JwtProperties {
    public static final String SECRET ="kinam";
    public static final int EXPIRATION_TIME = 7200000; // 2 hours
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
}
