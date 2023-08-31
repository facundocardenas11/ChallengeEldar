package com.eldar.challenge.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CalculadoraTasa {
    public double calcularTasa(String marca) {
        switch (marca) {
            case "VISA":
                LocalDate fechaActual = LocalDate.now();
                double tasaVisa = (double) fechaActual.getYear() / fechaActual.getMonthValue();
                return tasaVisa;
            case "NARA":
                int diaMes = LocalDate.now().getDayOfMonth();
                double tasaNara = diaMes * 0.5;
                return tasaNara;
            case "AMEX":
                int mesActual = LocalDate.now().getMonthValue();
                double tasaAmex = mesActual * 0.1;
                return tasaAmex;
            default:
                throw new IllegalArgumentException("Marca de tarjeta no válida: " + marca);
        }
    }
}
