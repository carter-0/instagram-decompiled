package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.DiL  reason: case insensitive filesystem */
public abstract class C46640DiL {
    public static final Object A00(AnonymousClass6Tm r5) {
        int A04 = DbW.A04(r5.A01(), "null cannot be cast to non-null type kotlin.Number");
        Object A02 = r5.A02();
        String A0j = DbW.A0j(r5, DbS.A0p(A02));
        int A042 = DbW.A04(DbU.A0j(r5), "null cannot be cast to non-null type kotlin.Number");
        0qQ.A0B(A0j, 2);
        G8K A00 = C46591DhX.A00((String) A02, A04);
        if (A00 == null) {
            return null;
        }
        A00.A9w(A0j, TimeUnit.SECONDS, (long) A042);
        return null;
    }
}
