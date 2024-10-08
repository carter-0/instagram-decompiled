package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EcW  reason: case insensitive filesystem */
public abstract class C48313EcW {
    public static final 1OC A00(UserSession userSession, int i, int i2, int i3, int i4) {
        1NY A0L = DbZ.A0L(userSession);
        A0L.A9m("day", Dbc.A0D(A0L, "age_platform/age_verification/start/", i, i2, i3));
        DbX.A1M(A0L, Pxd.A00(100), String.valueOf(i4));
        return DbW.A0K(A0L);
    }
}
