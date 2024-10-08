package X;

/* renamed from: X.Wns  reason: case insensitive filesystem */
public final class C20253Wns implements Runnable {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C15329Uae A01;

    public C20253Wns(1Xj r1, C15329Uae uae) {
        this.A00 = r1;
        this.A01 = uae;
    }

    public final void run() {
        U4D u4d;
        1Xj r2 = this.A00;
        if (r2 != null && (u4d = this.A01.A02) != null) {
            u4d.A01 = Uw7.PLAYING;
            u4d.A00 = r2;
            0fE.A00(u4d, 1818280790);
        }
    }
}
