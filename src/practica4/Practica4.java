
package practica4;

public class Practica4 {

    public static void main(String[] args) {
        CartaFrancesa carta1 = new CartaFrancesa(5,CartaFrancesa.DIAMANTES);
        CartaFrancesa carta2 = new CartaFrancesa(3,CartaFrancesa.PICAS);
        CartaFrancesa carta3 = new CartaFrancesa(1,CartaFrancesa.CORAZONES);
    
        /*mostrando por la salida estándar el texto correspondiente a cada una,
        así como su código.*/
        System.out.println(carta1.toString());
        System.out.println(carta1.toCodigo());
        System.out.println(carta2.toString());
        System.out.println(carta2.toCodigo());
        System.out.println(carta3.toString());
        System.out.println(carta3.toCodigo());
        
    }  
}
