
package practica4;

import javax.swing.JOptionPane;

public class CartaFrancesa {
    private int numero;
    private int palo;
    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;

    public CartaFrancesa(int numero, int palo) {
        if(numero>=0 && numero<13){
            this.numero = numero;
            this.palo = palo;
        }else{
            JOptionPane.showMessageDialog(null, "Debes indicar "
                    + "valores numericos enteros en el rango 0-12",
                    null,JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }
    
    public String toString(){
        if(numero == 0){
            switch(palo){
                case 0:
                    return "AS de Treboles";
                case 1:
                    return "AS de Diamantes";
                case 2:
                    return "AS de Corazones";
                case 3:
                    return "AS de Picas";
                case 4:
                    return "1 de Comodín";
                 default:
                    return null;
            }
        }else{
            if(numero == 10){
                switch(palo){
                    case 0:
                        return "J de Treboles";
                    case 1:
                        return "J de Diamantes";
                    case 2:
                        return "J de Corazones";
                    case 3:
                        return "J de Picas";
                    case 4:
                        return "J de Comodín";
                     default:
                        return null;
                }
            }
            if(numero == 11){
                switch(palo){
                    case 0:
                        return "Q de Treboles";
                    case 1:
                        return "Q de Diamantes";
                    case 2:
                        return "Q de Corazones";
                    case 3:
                        return "Q de Picas";
                    case 4:
                        return "Q de Comodín";
                     default:
                        return null;
                }
            }
            if(numero == 12){
                switch(palo){
                    case 0:
                        return "K de Treboles";
                    case 1:
                        return "K de Diamantes";
                    case 2:
                        return "K de Corazones";
                    case 3:
                        return "K de Picas";
                    case 4:
                        return "K de Comodín";
                     default:
                        return null;
                }
            }
            if(numero>0 && numero<10)
                switch(palo){
                    case 0:
                        return 1+numero + " de Treboles";
                    case 1:
                        return 1+numero + " de Diamantes";
                    case 2:
                        return 1+numero + " de Corazones";
                    case 3:
                        return 1+numero + " de Picas";
                    case 4:
                        return 1+numero + " de Comodín";
                     default:
                        return null;
                }
            return null;
        }
    }
    public String toCodigo(){
        switch(palo){
            case 0:
                return "T"+(numero);
            case 1:
                return "D"+(numero);
            case 2:
                return "C"+(numero);
            case 3:
                return "P"+(numero);
            case 4:
                return "J"+(numero);
             default:
                return null;
        }
    }
}

