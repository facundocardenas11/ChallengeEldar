package com.eldar.challenge.service;

public class Operacion {
    private TarjetaCredito tarjeta;
    private double monto;

    public Operacion(TarjetaCredito tarjeta, double monto) {
        this.tarjeta = tarjeta;
        this.monto = monto;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public boolean esValida() {
        return monto < 1000;
    }

    public boolean tarjetasSonDistintas(TarjetaCredito otraTarjeta) {
        return !tarjeta.equals(otraTarjeta);
    }

    public double obtenerTasa() {
        CalculadoraTasa calculadoraTasa = new CalculadoraTasa();
        return calculadoraTasa.calcularTasa(tarjeta.getMarca());
    }
}