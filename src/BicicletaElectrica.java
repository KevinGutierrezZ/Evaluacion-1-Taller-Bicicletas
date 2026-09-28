public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida{

    private double autonomiaKilometros;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;


    private static final double costoBase = 45000;
    public BicicletaElectrica(String codigo, int anioFabricacion, double peso, double autonomiaKilometros,
                              boolean bateriaCertificada) {
        super(codigo, anioFabricacion, peso);
        setAutonomiaKilometros(autonomiaKilometros);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaExtendidaActiva = false;
    }

    public double getAutonomiaKilometros() {
        return autonomiaKilometros;
    }

    public void setAutonomiaKilometros(double autonomiaKilometros) {
        if (autonomiaKilometros <= 0){
            throw new IllegalArgumentException("La autonomia no puede ser cero o inferior");
        }
        this.autonomiaKilometros = autonomiaKilometros;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

// Calculando costo
    @Override
    public double calcularCostoMantencion() {
        double costo = costoBase;
        if (!bateriaCertificada) {
            costo += costo * 0.25;
            }
        return costo;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendidaActiva = true;
    }

}
