package TrabajoGrupal_0.FabricaChocolate;

public class ChocolateBlanco implements Chocolate {

    @Override
    public void preparar(String n) {
        System.out.println(n +" esta Preparando chocolate Blanco 🍶");
        System.out.println(n+" produjo un chocolate Blanco 🍶");       
    }
    
}
