package X;

/* renamed from: X.Rh3  reason: case insensitive filesystem */
public abstract class C9807Rh3 {
    /* JADX WARNING: type inference failed for: r10v2, types: [X.RR5, X.QQ0, X.QPz] */
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        boolean z;
        Integer num;
        AnonymousClass6Tm r7 = r17;
        Object A03 = r7.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r10 = (C276544tV) A03;
        String A0E = r10.A0E();
        if (A0E == null) {
            A0E = "";
        }
        String str = "0";
        String A0H = r10.A0H();
        if (A0H != null) {
            str = A0H;
        }
        String A0I = r10.A0I();
        if (A0I == null) {
            1Kn.A02("instagram.BKBloksActionShopifysdkPrepareImpl", "payment type is null");
        } else {
            String A0G = r10.A0G();
            C307896Rx r6 = r16;
            C307786Rm r2 = r6.A03;
            if (r2 != null) {
                z = AnonymousClass3HA.A00(r2.A00);
            } else {
                z = false;
            }
            long A04 = r10.A04(43, 0);
            if (JTQ.A1Y(2M7.A0F, A0I)) {
                num = AnonymousClass05K.A00;
            } else if (JTQ.A1Y(2M7.A0H, A0I)) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0N;
            }
            ? qq0 = new QQ0(num, A0G, A0E, str, A04, z);
            qq0.A00 = A0I;
            C277014uI A08 = ((C276544tV) DbT.A0q(r7, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel", 0)).A08();
            if (!(A08 == null || r2 == null)) {
                synchronized (C10071Rm8.A01) {
                    C10071Rm8.A00 = qq0;
                }
                C299275ur.A00(r6, DbY.A0Q(r2), A08);
                return null;
            }
        }
        return null;
    }
}
