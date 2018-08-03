package io.jsonwebtoken.security

import io.jsonwebtoken.impl.security.DefaultEncryptionRequestBuilder
import io.jsonwebtoken.lang.Classes
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

import static org.junit.Assert.assertTrue

/**
 * This test class is for cursory API-level testing only (what is available to the API module at build time).
 *
 * The actual implementation assertions are done in the impl module.
 */
@RunWith(PowerMockRunner)
@PrepareForTest([Classes, EncryptionRequests])
class EncryptionRequestsTest {

    @Test
    void testPrivateCtor() { //for code coverage only
        new EncryptionRequests()
    }

    @Test
    void testBuilder() {
        assertTrue EncryptionRequests.builder() instanceof DefaultEncryptionRequestBuilder
    }
}
