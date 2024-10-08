package X;

/* renamed from: X.PXP  reason: case insensitive filesystem */
public final class C73130PXP implements Runnable {
    public final /* synthetic */ N1T A00;

    public C73130PXP(N1T n1t) {
        this.A00 = n1t;
    }

    public final void run() {
        Float f = N1T.A0F;
        if (f != null) {
            N1T n1t = this.A00;
            n1t.A09.setX(f.floatValue());
        }
        Float f2 = N1T.A0G;
        if (f2 != null) {
            N1T n1t2 = this.A00;
            n1t2.A09.setY(f2.floatValue());
        }
    }
}
