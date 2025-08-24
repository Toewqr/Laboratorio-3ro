package TrabajoGrupal_0.FabricaChocolate;

public class ChocolateNegro implements Chocolate {

    @Override
    public void preparar() {
        System.out.println(Thread.currentThread().getName() +" esta Preparando chocolate Negro 🍫");
        System.out.println(Thread.currentThread().getName() +"  produjo un chocolate Negro 🍫");
    }
    
}
