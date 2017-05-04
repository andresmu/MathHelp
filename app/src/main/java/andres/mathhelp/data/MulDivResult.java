package andres.mathhelp.data;

/**
 * Created by Andrés on 03-05-2017.
 */

public class MulDivResult extends MulDivAnswer {
    public MulDivResult(int prduct, int ratio) {
        super(prduct, ratio);
    }

    public String result(){
        return productResult() + ratioResult();
    }

    private String productResult(){
        if (getProduct() == 9){
            return "Tu Multiplicación es ¡Correcta! 3x3 es igual a 9 y ";
        } else {
            return "Tu Multiplicación da Error, tienes problemas al multiplicar y ";
        }
    }

    private String ratioResult(){
        if (getRatio() == 1){
            return "tu División es ¡Correcta! un numero dividido por si mismo da siempre 1 ";
        } else{
            return "tu División da Error, tienes problemas al dividir";
        }
    }
}
