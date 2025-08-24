package TrabajoGrupal_0.FabricaChocolate;

public class Chocolatero implements Runnable {
    private FabricaChocolatera fabrica; 
    private String nombre;

    
    public Chocolatero (String nombre, FabricaChocolatera fab){
        this.fabrica=fab;
        this.nombre= nombre;

    }
    
    @Override
    public void run() {
        Chocolate chocolate = fabrica.crearChocolate();
        System.out.println(nombre + " toma turno en la fabrica de chocolate");
        chocolate.preparar(nombre);
    }
    
}
