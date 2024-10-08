package X;

/* renamed from: X.TBv  reason: case insensitive filesystem */
public final class C12881TBv implements Runnable {
    public final /* synthetic */ 26B A00;

    public C12881TBv(26B r1) {
        this.A00 = r1;
    }

    public final void run() {
        26B r2 = this.A00;
        r2.A04.A01();
        r2.A05.A00();
        C250773m2 r1 = r2.A0F;
        r2.A0F = null;
        if (r1 != null) {
            r1.stop();
        }
        26B.A02(C2603845k.DISCONNECTED, r2);
    }
}
