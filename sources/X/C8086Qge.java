package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Qge  reason: case insensitive filesystem */
public final class C8086Qge extends SIE {
    public final C8080QgY A00;

    public static void A01(C8092Qgk qgk, C8080QgY qgY, ImmutableList.Builder builder) {
        qgk.A01(new C8086Qge(qgY), 1);
        builder.add(new C8098Qgq(qgk));
    }

    public static void A00(C8092Qgk qgk, C8080QgY qgY, int i) {
        qgk.A01(new C8086Qge(qgY), i);
    }

    public C8086Qge(C8080QgY qgY) {
        super(qgY);
        this.A00 = qgY;
    }

    public final boolean A04(SIE sie) {
        boolean A04 = super.A04(sie);
        if (!(sie instanceof C8086Qge) || !A04) {
            return false;
        }
        C8080QgY qgY = this.A00;
        SST sst = qgY.A04;
        C8080QgY qgY2 = ((C8086Qge) sie).A00;
        if (!0qQ.A0K(sst, qgY2.A04) || !0qQ.A0K(qgY.A02, qgY2.A02) || !0qQ.A0K(qgY.A03, qgY2.A03) || !0qQ.A0K(qgY.A01, qgY2.A01) || !0qQ.A0K(qgY.A06, qgY2.A06) || !0qQ.A0K(qgY.A00, qgY2.A00)) {
            return false;
        }
        return C51971G9r.A1Z(qgY.A05, qgY2.A05, false);
    }
}
