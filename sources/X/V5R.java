package X;

public abstract class V5R {
    public static final Integer A00(C307896Rx r3, AnonymousClass6Tm r4) {
        C263624Ms r0;
        Integer valueOf;
        C307786Rm r1 = r3.A03;
        if (r1 != null) {
            String A0D = DbY.A0P(r4, 0).A0D();
            if (A0D != null) {
                WKW A00 = C307476Qg.A00(r1, A0D);
                if (A00 == null || (r0 = A00.A03) == null || (valueOf = Integer.valueOf((int) r0.A0I.A08())) == null) {
                    return 0;
                }
                return valueOf;
            }
            throw AnonymousClass7TE.A0y();
        }
        return 0;
    }
}
