package X;

/* renamed from: X.RSo  reason: case insensitive filesystem */
public abstract class C9185RSo {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        String A00 = Q3L.A00(r5);
        C307786Rm r0 = r4.A03;
        if (r0 != null) {
            C307446Qd A02 = C307476Qg.A02(r0);
            C299275ur r1 = new C299275ur(r4);
            if (C245983dn.A03()) {
                1KZ.A01("Bloks Reflow");
                C276544tV A06 = A02.A06();
                if (A06 == C7288Q2n.A00((C276634te) null, new R9L(r1, A00), A06)) {
                    1KZ.A00();
                    return null;
                }
                throw AnonymousClass7TE.A0z("Reflow traversal produced an updated component");
            }
            throw AnonymousClass7TE.A15("Accessing state is only supported from the UI Thread");
        }
        throw AnonymousClass7TE.A0y();
    }
}
