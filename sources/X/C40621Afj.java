package X;

/* renamed from: X.Afj  reason: case insensitive filesystem */
public final class C40621Afj implements X59 {
    public final /* synthetic */ C353438Hq A00;
    public final /* synthetic */ boolean A01;

    public C40621Afj(C353438Hq r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void Dba(C18078Vl7 vl7) {
        Boolean bool;
        0qQ.A0B(vl7, 0);
        C353438Hq r2 = this.A00;
        if (r2.A03()) {
            vl7.A06(C391639tP.STREAM_ENDS);
        }
        W2Q w2q = vl7.A09;
        if (w2q != null) {
            bool = Boolean.valueOf(w2q.A0C);
        } else {
            bool = null;
        }
        C353438Hq.A01(vl7, r2, bool, false, this.A01);
    }
}
