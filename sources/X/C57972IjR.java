package X;

/* renamed from: X.IjR  reason: case insensitive filesystem */
public final class C57972IjR implements Runnable {
    public final /* synthetic */ C299275ur A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C71077Oaw A03;
    public final /* synthetic */ boolean A04;

    public C57972IjR(C299275ur r1, C277014uI r2, C277014uI r3, C71077Oaw oaw, boolean z) {
        this.A04 = z;
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = oaw;
        this.A01 = r3;
    }

    public final void run() {
        if (this.A04) {
            C299275ur r0 = this.A00;
            C277014uI r2 = this.A02;
            C299275ur.A00(r0.A00, AnonymousClass6Tm.A01, r2);
            return;
        }
        this.A03.A02(this.A00, this.A01);
    }
}
