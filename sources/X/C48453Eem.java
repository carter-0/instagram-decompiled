package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eem  reason: case insensitive filesystem */
public abstract class C48453Eem {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        long j;
        int i = 0;
        int A04 = DbW.A04(r7.A03(0), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0Z = DbT.A0Z(r6);
        if (0oI.A09(C308206Td.A04(r6))) {
            if (A04 == 1) {
                i = AnonymousClass7TG.A0A(DbV.A0k(A0Z).C5W()) * 60;
            }
            return Integer.valueOf(i);
        }
        if (A04 == 0) {
            j = new 2Cd(A0Z).A00();
        } else if (A04 != 1) {
            return 0;
        } else {
            j = DbW.A05(A0Z);
        }
        return Long.valueOf(j);
    }
}
