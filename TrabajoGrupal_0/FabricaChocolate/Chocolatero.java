package TrabajoGrupal_0.FabricaChocolate;

public class Chocolatero implements Runnable {
    private FabricaChocolatera fabrica; 
    private String nombre;
  

    
    public Chocolatero (String nombre, FabricaChocolatera fab){
        this.fabrica=fab;
        this.nombre = nombre;

    }
 
    public void run() {

        try {
            fabrica.prepararMezcla(nombre);
            Thread.sleep(500);
            fabrica.ponerMolde(nombre);
            Thread.sleep(500);
            fabrica.terminarTanda(nombre);

        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}
