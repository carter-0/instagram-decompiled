package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jho  reason: case insensitive filesystem */
public final class C60231Jho extends 2YL {
    public final 05G A00;
    public final AnonymousClass0Ud A01;
    public final boolean A02;
    public final UserSession A03;

    public C60231Jho(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = z;
        02z A10 = DbS.A10(new C61039Jvd(AnonymousClass05K.A00, false, z, z, z, false));
        this.A00 = A10;
        this.A01 = A10;
    }

    public final boolean A00() {
        UserSession userSession = this.A03;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328590031338949L) || 182.A06(r2, userSession, 36328590031535560L)) {
            return true;
        }
        return false;
    }
}
