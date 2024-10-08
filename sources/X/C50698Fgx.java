package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fgx  reason: case insensitive filesystem */
public final class C50698Fgx implements AnonymousClass5IX {
    public final UserSession A00;

    public C50698Fgx(UserSession userSession) {
        this.A00 = userSession;
    }

    public final boolean E1z(AnonymousClass5IY r4) {
        AnonymousClass9B9.A00();
        AnonymousClass9BB A002 = AnonymousClass9BA.A00(this.A00);
        if (A002.A00() != AnonymousClass05K.A0N || DbT.A1a(((AnonymousClass9BC) A002.A02.getValue()).A00, "picker_viewed_after_eligible")) {
            return false;
        }
        return true;
    }
}
