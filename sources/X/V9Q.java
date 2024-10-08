package X;

public abstract class V9Q {
    public static final Integer A00(AnonymousClass6Tm r3) {
        C307786Rm A0L = Dbb.A0L(r3);
        Object A02 = r3.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C313376gL A00 = C313366gK.A00((C229382nI) A0L.A02);
        String A0D = ((C276544tV) A02).A0D();
        if (A0D != null) {
            int i = 0;
            C305866Jw A002 = A00.A00(A0D);
            if (A002 != null) {
                Object obj = A00.A03.get(A002);
                if (obj != null) {
                    AnonymousClass4M3 r0 = ((C16386Uu3) obj).A02;
                    if (r0 != null) {
                        i = r0.getCurrentPositionMs();
                    } else {
                        i = 0;
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            return Integer.valueOf(i);
        }
        throw AnonymousClass7TE.A0y();
    }
}
