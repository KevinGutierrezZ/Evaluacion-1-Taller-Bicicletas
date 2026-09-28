import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicletas {
    private List<Bicicleta> bicicletas;
    public GestorTallerBicicletas(){this.bicicletas = new ArrayList<>();}

    public void registrarBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
        System.out.println("Bicicleta "+ bicicleta.getCodigo() + " agregado correctamente");
    }
    public List<Bicicleta> buscarPorCodigo (String criterio){
        List<Bicicleta> resultado = new ArrayList<>();
        for(Bicicleta b : bicicletas) {
            if (b.getCodigo().contains(criterio)){
                resultado.add(b);
            }
        }
        return resultado;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}
