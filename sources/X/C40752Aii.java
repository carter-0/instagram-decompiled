package X;

/* renamed from: X.Aii  reason: case insensitive filesystem */
public final /* synthetic */ class C40752Aii implements Runnable {
    public final /* synthetic */ 274 A00;

    public /* synthetic */ C40752Aii(274 r1) {
        this.A00 = r1;
    }

    public final void run() {
        274 r1 = this.A00;
        29n r0 = r1.A0c;
        if (r0 != null) {
            r0.A00.evictAll();
        }
        r1.A07();
        2SC.A00(2SC.A05);
    }
}
