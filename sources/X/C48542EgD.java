package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EgD  reason: case insensitive filesystem */
public abstract class C48542EgD {
    public static final Boolean A00(C307896Rx r2, AnonymousClass6Tm r3) {
        UserSession A0W = DbX.A0W(r2);
        boolean z = false;
        Object A0p = DbT.A0p(r3, 0);
        if (2DZ.A00(A0W).A05.A00() && 0qQ.A0K(A0p, "instagram_direct")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
