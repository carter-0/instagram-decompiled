package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HVt  reason: case insensitive filesystem */
public abstract class C54862HVt {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        UserSession A0R = DbW.A0R(r6);
        0Tu A0J = DbS.A0J(A0R, 0);
        if (!182.A06(A0J, A0R, 36319772464127610L)) {
            return null;
        }
        boolean A01 = Q0A.A01(r7.A03(0));
        1Av A00 = 1Au.A00(A0R);
        if (A01) {
            DbS.A1a(A00, AnonymousClass3VR.ACTIVE.toString(), A00.A06, 1Av.A8a, 369);
            if (!182.A06(A0J, A0R, 36319772464520830L)) {
                return null;
            }
            1PG A002 = 1PG.A00(A0R);
            AnonymousClass1PA r1 = AnonymousClass1PA.A00;
            if (!A002.A02.containsKey(r1)) {
                return null;
            }
            A002.A06(r1).A04();
            return null;
        }
        DbS.A1a(A00, AnonymousClass3VR.INACTIVE.toString(), A00.A06, 1Av.A8a, 369);
        return null;
    }
}
