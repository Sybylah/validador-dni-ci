
package com.ejemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorDniTest {

    @Test
    void dniCorrecto() {
        assertTrue(ValidadorDni.esValido("12345678Z"));
    }

    @Test
    void letraIncorrecta() {
        assertFalse(ValidadorDni.esValido("12345678A"));
    }

    @Test
    void minusculasAceptadas() {
        assertTrue(ValidadorDni.esValido("12345678z"));
    }

    @Test
    void longitudIncorrecta() {
        assertFalse(ValidadorDni.esValido("1234Z"));
    }

    @Test
    void letraCalculadaCorrectamente() {
        assertTrue(ValidadorDni.esValido("00000000T"));
    }
}

