package TrabajoGrupal_0.FabricaChocolate;

public class FabricaChocolateNegro implements FabricaChocolatera {

    @Override
    public Chocolate crearChocolate() {
        return new ChocolateNegro() ;
    }
    
}
