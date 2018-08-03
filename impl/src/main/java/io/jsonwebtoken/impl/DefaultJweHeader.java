package io.jsonwebtoken.impl;

import io.jsonwebtoken.JweHeader;
import io.jsonwebtoken.security.KeyManagementAlgorithmName;

import java.util.Map;

public class DefaultJweHeader extends DefaultHeader<JweHeader> implements JweHeader {

    public DefaultJweHeader() {
        super();
    }

    public DefaultJweHeader(Map<String, Object> map) {
        super(map);
    }

    @Override
    public String getAlgorithm() {
        return getString(ALGORITHM);
    }

    @Override
    public JweHeader setAlgorithm(String alg) {
        setValue(ALGORITHM, alg);
        return this;
    }
}
