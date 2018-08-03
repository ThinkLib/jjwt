package io.jsonwebtoken.impl

import io.jsonwebtoken.JweHeader
import org.junit.Test

import static org.junit.Assert.*

class DefaultJweHeaderTest {

    @Test
    void testAlgorithm() {
        JweHeader header = new DefaultJweHeader()
        header.setAlgorithm('foo')
        assertEquals 'foo', header.getAlgorithm()

        header = new DefaultJweHeader([alg: 'bar'])
        assertEquals 'bar', header.getAlgorithm()
    }
}
