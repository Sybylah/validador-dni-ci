
package com.ejemplo;

    public class ValidadorDniApp {

        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Uso: java -jar validador-dni.jar DNI");
                return;
            }

            String dni = args[0];
            boolean resultado = ValidadorDni.esValido(dni);

            if (resultado) {
                System.out.println("DNI válido");
            } else {
                System.out.println("DNI no válido");
            }
        }
    }


