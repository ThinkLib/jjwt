package io.jsonwebtoken.security;

/**
 * @since 0.10.0
 */
@SuppressWarnings("deprecation")
public class SignatureException extends io.jsonwebtoken.SignatureException {

    public SignatureException(String message) {
        super(message);
    }

    public SignatureException(String message, Throwable cause) {
        super(message, cause);
    }
}
