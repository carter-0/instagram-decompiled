package X;

/* renamed from: X.PHg  reason: case insensitive filesystem */
public final class C72726PHg implements C74474PvU {
    public final /* synthetic */ C74474PvU A00;
    public final /* synthetic */ C69111Neq A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ C62320sa A03;

    public C72726PHg(C74474PvU pvU, C69111Neq neq, C62320sa r3, C62320sa r4) {
        this.A00 = pvU;
        this.A01 = neq;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void DZL() {
        C74474PvU pvU = this.A00;
        if (pvU != null) {
            pvU.DZL();
        }
        this.A02.invoke();
    }

    public final void Di4() {
        C74474PvU pvU = this.A00;
        if (pvU != null) {
            pvU.Di4();
        }
        this.A03.invoke();
    }

    public final void onDismiss() {
        Integer num;
        C74474PvU pvU = this.A00;
        if (pvU != null) {
            pvU.onDismiss();
        }
        C69111Neq neq = this.A01;
        C71111Ocu ocu = neq.A0E;
        N9C n9c = neq.A04;
        if (n9c == null || (num = n9c.A02) == null) {
            num = AnonymousClass05K.A00;
        }
        ocu.A03(new PPW(num, false));
    }

    public final void onShow() {
        Integer num;
        C74474PvU pvU = this.A00;
        if (pvU != null) {
            pvU.onShow();
        }
        C69111Neq neq = this.A01;
        C71111Ocu ocu = neq.A0E;
        N9C n9c = neq.A04;
        if (n9c == null || (num = n9c.A02) == null) {
            num = AnonymousClass05K.A00;
        }
        ocu.A03(new PPW(num, true));
    }
}
