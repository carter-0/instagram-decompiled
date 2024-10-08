package X;

public abstract class V9S {
    public static final Object A00(AnonymousClass6Tm r6) {
        C307786Rm A0L = Dbb.A0L(r6);
        int A04 = DbW.A04(r6.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = r6.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C313376gL A002 = C313366gK.A00((C229382nI) A0L.A02);
        String A0D = ((C276544tV) A00).A0D();
        if (A0D != null) {
            C305866Jw A003 = A002.A00(A0D);
            if (A003 == null) {
                return null;
            }
            Object obj = A002.A03.get(A003);
            if (obj != null) {
                C16386Uu3 uu3 = (C16386Uu3) obj;
                AnonymousClass4M3 r2 = uu3.A02;
                if (r2 == null || uu3.A01 == null) {
                    return null;
                }
                uu3.A02.EKy(0mi.A03(A04, 0, r2.AzN()), true);
                return null;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }
}
