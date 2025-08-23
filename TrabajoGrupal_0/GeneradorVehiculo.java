package TrabajoGrupal_0;


public class GeneradorVehiculo  implements Runnable{

    FabricaVehiculos fabrica;
    int tiempo;



    public GeneradorVehiculo(FabricaVehiculos unaFabrica, int tiempo){



    this.fabrica = unaFabrica;
    this.tiempo = tiempo;

    }

    public void run(){


        while(true){



            fabrica.crearMotor();


        }







    }




    
}
