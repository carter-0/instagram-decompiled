package X;

/* renamed from: X.Qgb  reason: case insensitive filesystem */
public final class C8083Qgb extends SIE {
    public final C8075QgT A00;

    public C8083Qgb(C8075QgT qgT) {
        super(qgT);
        this.A00 = qgT;
    }

    public final boolean A04(SIE sie) {
        boolean A04 = super.A04(sie);
        if (!(sie instanceof C8083Qgb) || !A04) {
            return false;
        }
        return C51971G9r.A1Z(this.A00.A00, ((C8083Qgb) sie).A00.A00, false);
    }
}
