package X;

/* renamed from: X.Sc6  reason: case insensitive filesystem */
public final class C11545Sc6 implements 1MD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C11545Sc6(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr r1;
        2Fk r4;
        C7645QRm A0E;
        if (this.A00 != 0) {
            QXJ qxj = (QXJ) obj;
            if (qxj == null || (A0E = qxj.A0E()) == null) {
                r1 = null;
            } else {
                r1 = A0E.getOptionalTreeField(3, "non_auth_step_up_error", C7644QRl.class, -2119733934);
            }
            1MD r0 = (1MD) this.A01;
            if (r1 == null || (r4 = (2Fk) r0.apply(r1)) == null) {
                return null;
            }
            Object obj2 = this.A03;
            Object obj3 = this.A02;
            SUj.A0H(r4, new C11650Sds(8, obj2, (Object) qxj, obj3));
            return obj3;
        }
        S4g s4g = (S4g) obj;
        0qQ.A0B(s4g, 0);
        return ((SIP) this.A03).A01.A00(s4g, (S1I) this.A01, (SJK) this.A02);
    }
}
