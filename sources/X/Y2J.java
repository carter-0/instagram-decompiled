package X;

public final /* synthetic */ class Y2J implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C22037XuL A01;

    public /* synthetic */ Y2J(C22037XuL xuL, int i) {
        this.A01 = xuL;
        this.A00 = i;
    }

    public final void run() {
        int i;
        C22037XuL xuL = this.A01;
        int i2 = this.A00;
        C22000Xq8 xq8 = xuL.A01;
        if (i2 == -3) {
            i = 4;
        } else if (i2 != -2) {
            i = 1;
            if (i2 == -1) {
                C22000Xq8.A00(xq8, -1);
            } else if (i2 != 1) {
                STH.A03(C66579MXk.A00(204), 002.A0O(Pxd.A00(601), i2));
                return;
            } else {
                C22000Xq8.A01(xq8, 2);
                C22000Xq8.A00(xq8, 1);
                return;
            }
        } else {
            C22000Xq8.A00(xq8, 0);
            i = 3;
        }
        C22000Xq8.A01(xq8, i);
    }
}
