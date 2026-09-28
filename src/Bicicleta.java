public abstract class Bicicleta {

    private String codigo;
    private int anioFabricacion;
    private double peso;

    public Bicicleta(String codigo, int anioFabricacion, double peso) {
        setCodigo(codigo);
        setAnioFabricacion(anioFabricacion);
        setPeso(peso);
    }

    public String getCodigo() {
        return codigo;
    }
//Validaciones atravez de setter
    public void setCodigo(String codigo) {
        if (codigo == null||codigo.isBlank()){
            throw new IllegalArgumentException("El codigo no puede ser nulo ni vacio");
        }
        this.codigo = codigo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

//Validaciones atravez de setter
    public void setAnioFabricacion(int anioFabricacion) {
        if(anioFabricacion < 2000 || anioFabricacion > 2026){
            throw new IllegalArgumentException("El año de fabricacion debe ser entre 2000 y 2026");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }
//Validaciones atravez de setter
    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("El peso no puede ser cero o menos");
        }
        this.peso = peso;
    }
    public abstract double calcularCostoMantencion();

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Año: " + anioFabricacion;
    }
}
