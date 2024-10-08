package X;

public final class IHG implements AnonymousClass0hF, AnonymousClass07Y {
    public final int A00;
    public final Object A01;

    public IHG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dms(07T r4, AnonymousClass07Z r5) {
        switch (this.A00) {
            case 0:
                AnonymousClass54O r1 = (AnonymousClass54O) this.A01;
                if (r4 == 07T.ON_DESTROY) {
                    r1.A04();
                    return;
                }
                return;
            case 1:
                ((C249523jv) this.A01).FIG(r4);
                return;
            case 2:
                0qQ.A0B(r4, 1);
                if (r4 == 07T.ON_RESUME) {
                    C55980Hql hql = (C55980Hql) this.A01;
                    if (C56190HuJ.A00(hql.A03, hql.A04) != 0) {
                        hql.A00();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                0qQ.A0B(r4, 1);
                return;
            default:
                0qQ.A0B(r4, 1);
                if (r4 == 07T.ON_PAUSE) {
                    DbS.A1U(this.A01);
                    return;
                }
                return;
        }
    }
}
