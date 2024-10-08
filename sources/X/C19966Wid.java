package X;

/* renamed from: X.Wid  reason: case insensitive filesystem */
public final /* synthetic */ class C19966Wid implements Runnable {
    public final /* synthetic */ WMA A00;

    public /* synthetic */ C19966Wid(WMA wma) {
        this.A00 = wma;
    }

    public final void run() {
        WMA wma = this.A00;
        if (!wma.A01) {
            C290325f8 r1 = wma.A00;
            if (r1 != null) {
                r1.ECN(wma.A02);
            }
            wma.A03.A0A.remove(wma);
            wma.A01 = true;
        }
    }
}
