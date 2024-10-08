package X;

/* renamed from: X.5gw  reason: invalid class name and case insensitive filesystem */
public final class C291305gw implements Runnable {
    public final /* synthetic */ 274 A00;
    public final /* synthetic */ C291295gv A01;

    public C291305gw(274 r1, C291295gv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        274 r5 = this.A00;
        C291295gv r4 = this.A01;
        2BM r3 = r5.A0J;
        if (r3 != null) {
            27B.A01("HeroManager", "execute warmup request vid=%s", new Object[]{r4.A00.A0K.A0G});
            r3.A03(r5, r4);
        }
    }
}
