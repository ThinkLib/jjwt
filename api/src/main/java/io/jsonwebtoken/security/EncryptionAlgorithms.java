package io.jsonwebtoken.security;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Classes;
import io.jsonwebtoken.lang.Collections;

import java.util.List;

public final class EncryptionAlgorithms {

    static final String HMAC = "io.jsonwebtoken.impl.security.HmacAesEncryptionAlgorithm";
    static final Class[] HMAC_ARGS = new Class[]{String.class, SignatureAlgorithm.class};

    static final String GCM = "io.jsonwebtoken.impl.security.GcmAesEncryptionAlgorithm";
    static final Class[] GCM_ARGS = new Class[]{String.class, int.class};

    private static EncryptionAlgorithm hmac(EncryptionAlgorithmName name, SignatureAlgorithm alg) {
        return Classes.newInstance(HMAC, HMAC_ARGS, name.getValue(), alg);
    }

    private static EncryptionAlgorithm gcm(EncryptionAlgorithmName name, int keyLen) {
        return Classes.newInstance(GCM, GCM_ARGS, name.getValue(), keyLen);
    }

    //prevent instantiation
    private EncryptionAlgorithms() {
    }

    public static final EncryptionAlgorithm A128CBC_HS256 = hmac(EncryptionAlgorithmName.A128CBC_HS256, SignatureAlgorithm.HS256);

    public static final EncryptionAlgorithm A192CBC_HS384 = hmac(EncryptionAlgorithmName.A192CBC_HS384, SignatureAlgorithm.HS384);

    public static final EncryptionAlgorithm A256CBC_HS512 = hmac(EncryptionAlgorithmName.A256CBC_HS512, SignatureAlgorithm.HS512);

    public static final EncryptionAlgorithm A128GCM = gcm(EncryptionAlgorithmName.A128GCM, 16);

    public static final EncryptionAlgorithm A192GCM = gcm(EncryptionAlgorithmName.A192GCM, 24);

    public static final EncryptionAlgorithm A256GCM = gcm(EncryptionAlgorithmName.A256GCM, 32);

    public static List<EncryptionAlgorithm> VALUES =
        Collections.of(A128CBC_HS256, A192CBC_HS384, A256CBC_HS512, A128GCM, A192GCM, A256GCM);
}
