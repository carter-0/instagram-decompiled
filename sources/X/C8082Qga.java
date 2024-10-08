package X;

/* renamed from: X.Qga  reason: case insensitive filesystem */
public final class C8082Qga extends SIE {
    public final C8078QgW A00;

    public C8082Qga(C8078QgW qgW) {
        super(qgW);
        this.A00 = qgW;
    }

    public final boolean A04(SIE sie) {
        boolean A04 = super.A04(sie);
        if (!(sie instanceof C8082Qga) || !A04) {
            return false;
        }
        C8078QgW qgW = this.A00;
        C13889TjC tjC = qgW.A02;
        C8078QgW qgW2 = ((C8082Qga) sie).A00;
        if (!0qQ.A0K(tjC, qgW2.A02) || !0qQ.A0K(qgW.A00, qgW2.A00)) {
            return false;
        }
        return C51971G9r.A1Z(qgW.A01, qgW2.A01, false);
    }
}
