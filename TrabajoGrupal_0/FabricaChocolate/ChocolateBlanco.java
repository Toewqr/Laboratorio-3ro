package TrabajoGrupal_0.FabricaChocolate;

public class ChocolateBlanco implements Chocolate {

    @Override
    public void preparar() {
        System.out.println(Thread.currentThread().getName() +" esta Preparando chocolate Blanco 🍶");
        System.out.println(Thread.currentThread().getName() +" produjo un chocolate Blanco 🍶");       
    }
    
}
