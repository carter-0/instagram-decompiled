package X;

public abstract class V5P {
    public static final Boolean A00(C307896Rx r3, AnonymousClass6Tm r4) {
        WKW A00;
        Float f;
        String A0D = DbY.A0P(r4, 0).A0D();
        if (A0D != null) {
            C307786Rm r0 = r3.A03;
            if (r0 == null || (A00 = C307476Qg.A00(r0, A0D)) == null) {
                return false;
            }
            C263624Ms r02 = A00.A03;
            if (r02 != null) {
                f = Float.valueOf(r02.A0I.A0Q);
            } else {
                f = null;
            }
            return Boolean.valueOf(0qQ.A0I(f, 0.0f));
        }
        throw AnonymousClass7TE.A0y();
    }
}
