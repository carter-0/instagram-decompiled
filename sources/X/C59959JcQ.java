package X;

/* renamed from: X.JcQ  reason: case insensitive filesystem */
public final /* synthetic */ class C59959JcQ implements Runnable {
    public final /* synthetic */ LE9 A00;

    public /* synthetic */ C59959JcQ(LE9 le9) {
        this.A00 = le9;
    }

    public final void run() {
        LE9 le9 = this.A00;
        C344207rU r2 = le9.A00;
        if (r2 != null) {
            le9.A00 = null;
            le9.A01 = null;
            le9.A08 = false;
            le9.A04.removeCallbacks(le9.A06);
            r2.A04();
        }
    }
}
