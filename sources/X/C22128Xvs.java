package X;

/* renamed from: X.Xvs  reason: case insensitive filesystem */
public final class C22128Xvs implements Y95 {
    public final /* synthetic */ Y95 A00;
    public final /* synthetic */ XtE A01;

    public C22128Xvs(Y95 y95, XtE xtE) {
        this.A01 = xtE;
        this.A00 = y95;
    }

    public final /* bridge */ /* synthetic */ Object Ezi(XtE xtE) {
        if (xtE.A07()) {
            Exception A03 = xtE.A03();
            C21496Xcu xcu = new C21496Xcu();
            xcu.A01(A03);
            return xcu.A00;
        } else if (xtE.A06()) {
            return XtE.A06;
        } else {
            return xtE.A02(this.A00, XtE.A0A);
        }
    }
}
