package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.Ei5  reason: case insensitive filesystem */
public abstract class C48658Ei5 {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Object A0f = DbW.A0f(r7);
        int A04 = DbW.A04(r7.A02(), "null cannot be cast to non-null type kotlin.Number");
        boolean A01 = Q0A.A01(r7.A00());
        AnonymousClass3M3 A0H = DbU.A0H(r6);
        if (!(A0H instanceof AnonymousClass3M3)) {
            return null;
        }
        if ("start".equals(A0f)) {
            AnonymousClass3M3 r4 = A0H;
            IgBloksScreenConfig igBloksScreenConfig = r4.A0A;
            HashMap hashMap = igBloksScreenConfig.A0V;
            if (hashMap == null) {
                hashMap = AnonymousClass7TE.A1E();
                igBloksScreenConfig.A0V = hashMap;
            }
            DbU.A1Y(Integer.valueOf(A04), hashMap, A01);
            DbT.A0K(r4.A03).ARS(A04, A01);
            return null;
        } else if (!"end".equals(A0f)) {
            return null;
        } else {
            AnonymousClass3M3 r42 = A0H;
            IgBloksScreenConfig igBloksScreenConfig2 = r42.A0A;
            HashMap hashMap2 = igBloksScreenConfig2.A0W;
            if (hashMap2 == null) {
                hashMap2 = AnonymousClass7TE.A1E();
                igBloksScreenConfig2.A0W = hashMap2;
            }
            DbU.A1Y(Integer.valueOf(A04), hashMap2, A01);
            DbT.A0K(r42.A03).ARb(A04, A01);
            return null;
        }
    }
}
