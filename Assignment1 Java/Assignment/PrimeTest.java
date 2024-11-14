package Assignment_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void isPrime() {
        assertTrue(Prime.isPrime(20));
        assertTrue(Prime.isPrime(31));
        assertFalse(Prime.isPrime(42));
        assertTrue(Prime.isPrime(53));
        assertFalse(Prime.isPrime(7));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(0));

    }
}