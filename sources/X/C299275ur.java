package X;

import java.util.List;

/* renamed from: X.5ur  reason: invalid class name and case insensitive filesystem */
public final class C299275ur {
    public final C307896Rx A00;

    public C299275ur(C307896Rx r1) {
        this.A00 = r1;
    }

    public static Object A00(C307896Rx r4, AnonymousClass6Tm r5, C277014uI r6) {
        C307786Rm r2;
        C307446Qd A02;
        C307446Qd A022;
        C307446Qd A023;
        try {
            C307896Rx A002 = C307896Rx.A00(r6.Bxl(), r4, (List) null);
            1KZ.A01("LispyEvaluation");
            C276614tc.A05.incrementAndGet();
            r2 = A002.A03;
            if (!(r2 == null || (A023 = C307476Qg.A02(r2)) == null || !C245983dn.A03())) {
                A023.A00++;
            }
            Object A003 = AnonymousClass6Tn.A00(A002, r5, r6);
            1KZ.A00();
            if (!(r2 == null || (A022 = C307476Qg.A02(r2)) == null)) {
                A022.A07();
            }
            return A003;
        } catch (AnonymousClass6QV e) {
            1Kn.A00(r4.A03, "BloksInterpreter", "Exception while evaluating Lispy Script", e);
            return null;
        } catch (Throwable th) {
            1KZ.A00();
            if (!(r2 == null || (A02 = C307476Qg.A02(r2)) == null)) {
                A02.A07();
            }
            throw th;
        }
    }
}
