package TrabajoGrupal_0.FabricaChocolate;

abstract class Chocolate {

    protected String tipo = "";

    void envolver(String nombre){

     System.out.println(nombre + " envuelve la tanda de chocolates " + this.tipo);

    }



    

}
