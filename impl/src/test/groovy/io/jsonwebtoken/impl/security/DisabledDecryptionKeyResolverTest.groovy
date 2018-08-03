package io.jsonwebtoken.impl.security

import io.jsonwebtoken.impl.security.DisabledDecryptionKeyResolver
import org.junit.Test

import static org.junit.Assert.assertNull

class DisabledDecryptionKeyResolverTest {

    @Test
    void test() {
        assertNull DisabledDecryptionKeyResolver.INSTANCE.resolveDecryptionKey(null)
    }
}
