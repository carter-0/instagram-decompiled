package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.93M  reason: invalid class name */
public final class AnonymousClass93M implements 1UV {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String A2n;
        1Xj r5 = (1Xj) obj;
        if (r5 != null && !r5.A5z()) {
            UserSession userSession = this.A00;
            if (1UX.A00(userSession.A03.A06(), userSession).A03(r5.getId()) || ((A2n = r5.A2n()) != null && AnonymousClass2fL.A00(userSession).A0P(A2n))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass93M(UserSession userSession) {
        this.A00 = userSession;
    }
}
