package X;

/* renamed from: X.QgZ  reason: case insensitive filesystem */
public final class C8081QgZ extends SIE {
    public final C8076QgU A00;

    public C8081QgZ(C8076QgU qgU) {
        super(qgU);
        this.A00 = qgU;
    }

    public final boolean A04(SIE sie) {
        boolean A04 = super.A04(sie);
        if (!(sie instanceof C8081QgZ) || !A04) {
            return false;
        }
        C8076QgU qgU = this.A00;
        SST sst = qgU.A01;
        C8076QgU qgU2 = ((C8081QgZ) sie).A00;
        if (0qQ.A0K(sst, qgU2.A01)) {
            return C51971G9r.A1Z(qgU.A00, qgU2.A00, false);
        }
        return false;
    }
}
