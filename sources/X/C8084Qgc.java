package X;

/* renamed from: X.Qgc  reason: case insensitive filesystem */
public final class C8084Qgc extends SIE {
    public final C8077QgV A00;

    public C8084Qgc(C8077QgV qgV) {
        super(qgV);
        this.A00 = qgV;
    }

    public final boolean A04(SIE sie) {
        boolean A04 = super.A04(sie);
        if (!(sie instanceof C8084Qgc) || !A04) {
            return false;
        }
        C8077QgV qgV = this.A00;
        C13889TjC tjC = qgV.A00;
        C8077QgV qgV2 = ((C8084Qgc) sie).A00;
        if (0qQ.A0K(tjC, qgV2.A00)) {
            return C51971G9r.A1Z(qgV.A01, qgV2.A01, false);
        }
        return false;
    }
}
