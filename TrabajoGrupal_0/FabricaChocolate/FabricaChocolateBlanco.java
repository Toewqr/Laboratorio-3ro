package TrabajoGrupal_0.FabricaChocolate;

public class FabricaChocolateBlanco implements FabricaChocolatera{

    @Override
    public Chocolate crearChocolate() {
        return (Chocolate) new ChocolateBlanco() ;
    }
    
}
