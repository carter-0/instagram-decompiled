package X;

/* renamed from: X.Qgd  reason: case insensitive filesystem */
public final class C8085Qgd extends SIE {
    public final C8079QgX A00;

    public C8085Qgd(C8079QgX qgX) {
        super(qgX);
        this.A00 = qgX;
    }

    public final boolean A04(SIE sie) {
        boolean A04 = super.A04(sie);
        if (!(sie instanceof C8085Qgd) || !A04) {
            return false;
        }
        C8079QgX qgX = this.A00;
        C13889TjC tjC = qgX.A00;
        C8079QgX qgX2 = ((C8085Qgd) sie).A00;
        if (!0qQ.A0K(tjC, qgX2.A00) || qgX.A02 != qgX2.A02) {
            return false;
        }
        return true;
    }
}
