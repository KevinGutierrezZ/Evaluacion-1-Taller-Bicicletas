public class Main {
public static void main(String[] args){

    BicicletaElectrica be1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
    BicicletaElectrica be2 = new BicicletaElectrica("BIC-E02", 2022, 24.0,45, true);
    BicicletaMontania bm1 = new BicicletaMontania("BIC-M01", 2021, 13.5, 2);
    BicicletaMontania bm2 = new BicicletaMontania("BIC-M02", 2020, 12.0, 1);

    be1.activarGarantiaExtendida();
    GestorTallerBicicletas gestor = new GestorTallerBicicletas();
    gestor.registrarBicicleta(be1);
    gestor.registrarBicicleta(be2);
    gestor.registrarBicicleta(bm1);
    gestor.registrarBicicleta(bm2);

    System.out.println();
    System.out.println("Busqueda por codigo 'BIC-E01': ");
    for (Bicicleta b : gestor.buscarPorCodigo("BIC-E01")){
        System.out.println(b);
    }

    System.out.println();
    System.out.println("Listado completo de bicicletas registradas");
    for (Bicicleta b : gestor.getBicicletas()){
        System.out.println(b + ", costo mantencion: "+ b.calcularCostoMantencion());
    }

    }
}
