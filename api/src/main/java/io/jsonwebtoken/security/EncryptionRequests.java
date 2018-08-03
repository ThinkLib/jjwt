package io.jsonwebtoken.security;

import io.jsonwebtoken.lang.Classes;

public final class EncryptionRequests {

    private EncryptionRequests(){} //prevent instantiation

    public static EncryptionRequestBuilder builder() {
        return Classes.newInstance("io.jsonwebtoken.impl.security.DefaultEncryptionRequestBuilder");
    }
}
