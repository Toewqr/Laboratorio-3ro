package TrabajoGrupal_0.FabricaChocolate;
import java.util.concurrent.Semaphore;

abstract class FabricaChocolatera {
    protected String tipoCh = "";
    protected Semaphore sem = new Semaphore(1);
    protected Chocolate chocolate;

    public void prepararMezcla(String n){
        System.out.println( n + " Esta preparando la mezcla de chocolate " + this.tipoCh);
        //El this. simula el "Self" de pharo

    }
    public void ponerMolde(String n){

           System.out.println(n + " Coloca la mezcla de chocolate " + this.tipoCh+ " en el molde.");

    }
    public void terminarTanda(String n){

          try {
            System.out.println(n + " termina la tanda de chocolate  " + this.tipoCh + ". :)");

            this.sem.acquire();

            this.chocolate.envolver(n);
            //Cada fábrica tiene su propio semaforo y su propio chocolate 
            this.sem.release();

        } catch (Exception e) {
            // TODO: handle exception
        }





    }


} 