package TrabajoGrupal_0.FabricaChocolate;

import java.util.concurrent.Semaphore;

public class FabricaChocolateNegro implements FabricaChocolatera {

    private ChocolateNegro chocolateN;
    private Semaphore sem = new Semaphore(1);

    public void prepararMezcla(String n) {

        System.out.println(n + " Prepara la mezcla de chocolate blanco ");
    }

    public void ponerMolde(String n) {

        System.out.println(n + " Coloca la mezcla de chocolate blanco en el molde.");
    }

    public void finalizar(String n) {

        try {
            System.out.println(n + " termina la tanda de chocolate blanco. :)");

            sem.acquire();
            chocolateN = new ChocolateNegro();
            chocolateN.envolver(n);
            sem.release();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
