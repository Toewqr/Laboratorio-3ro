package TrabajoGrupal_0;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class mainFabrica {

    public static void main(String[] args) {

        FabricaAuto fabricaA = new FabricaAuto(); 

        FabricaCamion fabricaCamion = new FabricaCamion();

        FabricaMoto fabricaMoto = new FabricaMoto(); 




       ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1); //Probamos con uno, dos y tres


    scheduler.scheduleAtFixedRate(() -> {fabricaCamion.ensamblar();
            System.out.println("Ejecutado a las: " + LocalTime.now());}
, 0, 3, TimeUnit.SECONDS);


    scheduler.scheduleAtFixedRate(() -> {fabricaA.ensamblar();
            System.out.println("Ejecutado a las: " + LocalTime.now());
    }, 0, 1, TimeUnit.SECONDS);

    
    scheduler.scheduleAtFixedRate(() -> {fabricaMoto.ensamblar();
            System.out.println("Ejecutado a las: " + LocalTime.now());
    }, 0, 2, TimeUnit.SECONDS);








   
        
    }

    
    // aca deberiamos implementar la clase schedule para que haga autos y motos y camiones bla
}
