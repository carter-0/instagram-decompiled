package X;

public final class WLB implements C20890X2u {
    public final int A00;
    public final Object A01;

    public WLB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [X.XBn, X.WLG, java.lang.Object] */
    public final C21046XBn ASY(C21046XBn xBn) {
        switch (this.A00) {
            case 0:
                C21046XBn xBn2 = xBn;
                C20890X2u[] x2uArr = (C20890X2u[]) this.A01;
                int length = x2uArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        return xBn2;
                    }
                    xBn2 = x2uArr[length].ASY(xBn2);
                }
            case 1:
                return new WLI(xBn, (X6A[]) this.A01);
            default:
                ? obj = new Object();
                obj.A00 = xBn;
                obj.A01 = (VQ7) this.A01;
                return obj;
        }
    }
}
