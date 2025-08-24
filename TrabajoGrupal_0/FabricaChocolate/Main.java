package TrabajoGrupal_0.FabricaChocolate;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
                // Dos fábricas distintas
        FabricaChocolatera fabricaNegra = new FabricaChocolateNegro();
        FabricaChocolatera fabricaBlanca = new FabricaChocolateBlanco();

        // Chocolateros que usan cada fábrica
        Chocolatero juan = new Chocolatero ("Juan",fabricaNegra);
       
        Chocolatero maria = new Chocolatero ("Maria",fabricaBlanca);
         Chocolatero ignacio = new Chocolatero ("Ignacio",fabricaBlanca);
         Chocolatero zoe = new Chocolatero ("Zoe",fabricaBlanca);




        // Scheduler
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        scheduler.scheduleAtFixedRate(juan, 0, 3, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(maria, 0, 6, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(ignacio, 0, 6, TimeUnit.SECONDS);
         scheduler.scheduleAtFixedRate(zoe, 0, 6, TimeUnit.SECONDS);


         scheduler.schedule(() -> {
            System.out.println("Fin de la producción");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);

    }
    
}
