package X;

/* renamed from: X.RSf  reason: case insensitive filesystem */
public abstract class C9179RSf {
    public static final Integer A00(C307896Rx r4, AnonymousClass6Tm r5) {
        int A00;
        Object A0e = DbW.A0e(r5);
        0qQ.A0C(A0e, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r2 = (C276544tV) A0e;
        String A02 = Q3L.A02(r5.A02());
        C307786Rm A002 = C276734to.A00(r4, r5, 2);
        if (r2.A0C() == null) {
            1Kn.A02("index_of_child_without_id", "bk.action.bloks.IndexOfChild called on a container without an ID");
        } else {
            C307446Qd A022 = C307476Qg.A02(A002);
            if (r2.A0C() != null) {
                C276544tV A003 = C7299Q2y.A00(A022.A06(), new C7296Q2v(r2.A0C()));
                if (A003 != null) {
                    A00 = Q44.A00(new C7296Q2v(A02), A003.A0L());
                    return Integer.valueOf(A00);
                }
            }
        }
        A00 = -1;
        return Integer.valueOf(A00);
    }
}
