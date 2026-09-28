public class BicicletaMontania extends Bicicleta{

    private static final double costoBase = 30000;
    private int cantidadSuspenciones;

    public BicicletaMontania(String codigo, int anioFabricacion, double peso, int cantidadSuspenciones) {
        super(codigo, anioFabricacion, peso);
        setCantidadSuspenciones(cantidadSuspenciones);
}

    public int getCantidadSuspenciones() {
        return cantidadSuspenciones;
    }
//Validaciones atravez de setter
    public void setCantidadSuspenciones(int cantidadSuspenciones) {
        if (cantidadSuspenciones <= 0){
            throw new IllegalArgumentException("La cantidad de suspenciones no puede ser menor o igual a cero");
        }
        this.cantidadSuspenciones = cantidadSuspenciones;
    }
//Calculando costo
    @Override
    public double calcularCostoMantencion() {
        double costo = costoBase;
        if (cantidadSuspenciones > 1){
            costo += costo * 0.15;
        }
        return costo;
    }
}
