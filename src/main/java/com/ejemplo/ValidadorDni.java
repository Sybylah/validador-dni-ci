package com.ejemplo;

public class ValidadorDni {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static void main(String[] args) {
        String dni = "12345678Z";

        boolean resultado = esValido(dni);
        System.out.println(resultado);
    }

    public static boolean esValido(String dni) {
        if (dni == null) {
            return false;
        }

        dni = dni.trim();

        if (!dni.matches("\\d{8}[A-Z]")) {
            return false;
        }

        int numero = Integer.parseInt(dni.substring(0, 8));
        char letraCalculada = LETRAS.charAt(numero % 23);
        char letraDni = dni.charAt(8);

        return letraCalculada == letraDni;
    }
}

