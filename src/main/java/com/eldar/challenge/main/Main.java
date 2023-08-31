package com.eldar.challenge.main;

import com.eldar.challenge.service.Operacion;
import com.eldar.challenge.service.TarjetaCredito;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------.");
        TarjetaCredito visa = new TarjetaCredito("VISA", "1234567890123456", "Facundo Cardenas", LocalDate.of(2023, 12, 31));
        TarjetaCredito nara = new TarjetaCredito("NARA", "9876543210987654", "Sebastian Acosta", LocalDate.of(2023, 8, 31));
        TarjetaCredito amex = new TarjetaCredito("AMEX", "5678901234567890", "Gabriel Kloker", LocalDate.of(2023, 9, 30));

        Operacion operacion = new Operacion(visa, 500);

        System.out.println(operacion.obtenerTasa());

        System.out.println("----------------------------------------------------------------------------.");

        // Crear una instancia de TarjetaCredito
        TarjetaCredito visaTwo = new TarjetaCredito("VISA", "1234567890123456", "Facundo Cardenas", LocalDate.of(2023, 12, 31));

        // Invocar el método para obtener la información completa
        String informacionCompleta = visaTwo.obtenerInformacionCompleta();

        // Mostrar la información completa por consola
        System.out.println("Información de la Tarjeta:\n" + informacionCompleta);


        System.out.println("----------------------------------------------------------------------------.");
        TarjetaCredito visaThree = new TarjetaCredito("VISA", "1234567890123456", "Facundo Cardenas", LocalDate.of(2023, 12, 31));

        if (visaThree.esValidaParaOperar()) {
            System.out.println("La tarjeta es válida para operar.");
        } else {
            System.out.println("La tarjeta no es válida para operar.");
        }
    }
}

