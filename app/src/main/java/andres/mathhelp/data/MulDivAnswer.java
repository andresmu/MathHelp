package andres.mathhelp.data;

/**
 * Created by Andrés on 03-05-2017.
 */

public class MulDivAnswer {
    private int product, ratio;

    public MulDivAnswer(int product, int ratio) {
        this.product = product;
        this.ratio = ratio;
    }

    public int getProduct() {
        return product;
    }

    public int getRatio() {
        return ratio;
    }
}
