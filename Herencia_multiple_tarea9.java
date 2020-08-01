package herencia_multiple_tarea9;
/**
 *
 * @author Gabriel Diaz
 */
interface Automovil {
public default void Numero_llantas() {
System.out.println("El numero de llantas es: 4");
   }
}
interface Motocicleta {

    public default void Numero_llantas() {
System.out.println("El numero de llantas es: 2");
   }
}
public class Herencia_multiple_tarea9 implements Automovil, Motocicleta{
@Override
public void Numero_llantas() {
Automovil.super.Numero_llantas();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema: Simulacion del accionamiento de un airbag mediante "
            + "un indicador auditivo y visual (buzer, led), además le permita "
            + "determinar el tiempo en que se mantiene accionado\n");
        Herencia_multiple_tarea9 carro=new Herencia_multiple_tarea9();
        carro.Numero_llantas();
    }

}
