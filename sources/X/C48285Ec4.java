package X;

/* renamed from: X.Ec4  reason: case insensitive filesystem */
public abstract class C48285Ec4 {
    public static final Object A00(AnonymousClass6Tm r10) {
        boolean z = false;
        int A04 = DbW.A04(r10.A03(0), "null cannot be cast to non-null type kotlin.Number");
        Object A02 = r10.A02();
        String A0p = DbS.A0p(A02);
        String str = (String) A02;
        String A0j = DbW.A0j(r10, A0p);
        Object A0j2 = DbU.A0j(r10);
        0qQ.A0C(A0j2, AnonymousClass000.A00(17));
        long A0R = AnonymousClass7TE.A0R(A0j2);
        C276544tV A0M = DbW.A0M(r10, 4);
        long now = C64361Kj.A00().A01.C3g().now();
        if (A0M != null) {
            z = A0M.A0R(35, false);
        }
        0qQ.A0B(A0j, 2);
        G8K A00 = C46591DhX.A00(str, A04);
        if (A00 == null) {
            return null;
        }
        A00.AEs(A0R, A0j, z, now);
        return null;
    }
}
