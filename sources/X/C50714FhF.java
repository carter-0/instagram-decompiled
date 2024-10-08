package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FhF  reason: case insensitive filesystem */
public final class C50714FhF implements AnonymousClass5IX {
    public final UserSession A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r7) {
        if (AnonymousClass7TF.A1R((DbW.A05(this.A00) > 0 ? 1 : (DbW.A05(this.A00) == 0 ? 0 : -1))) != this.A01) {
            return false;
        }
        return true;
    }

    public C50714FhF(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
