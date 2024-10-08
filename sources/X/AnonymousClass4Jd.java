package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Jd  reason: invalid class name */
public final class AnonymousClass4Jd {
    public final UserSession A00;

    public AnonymousClass4Jd(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final AnonymousClass9IB A00(1Xj r10, String str) {
        boolean z;
        0qQ.A0B(r10, 0);
        0qQ.A0B(str, 1);
        boolean CeS = r10.CeS();
        UserSession userSession = this.A00;
        boolean A0T = C231122qu.A0T(userSession, r10);
        if (!0rQ.A02(r10, C231512rn.A00(userSession), str) || (!182.A06(0Tu.A05, userSession, 36329333061140535L) && 0rQ.A00(userSession) != C246543em.CORNER_BUTTON)) {
            z = false;
        } else {
            z = true;
        }
        return new AnonymousClass9IB(CeS, 1, A0T, z, r10.A5f());
    }
}
