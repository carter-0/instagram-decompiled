package X;

public abstract class V5S {
    public static final C60340gF A00(C307896Rx r4, AnonymousClass6Tm r5) {
        C307786Rm r42 = r4.A03;
        if (r42 == null) {
            return null;
        }
        int A04 = DbW.A04(r5.A01(), "null cannot be cast to non-null type kotlin.Number");
        Object A02 = r5.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        String A0D = ((C276544tV) A02).A0D();
        if (A0D != null) {
            WKW A00 = C307476Qg.A00(r42, A0D);
            if (A00 == null) {
                return null;
            }
            C263624Ms r0 = A00.A03;
            if (r0 != null) {
                r0.A0I.A0C(A04);
            }
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }
}
