package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FhE  reason: case insensitive filesystem */
public final class C50713FhE implements AnonymousClass5IX {
    public final UserSession A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r7) {
        if (AnonymousClass7TF.A1R((new 2Cd(this.A00).A00() > 0 ? 1 : (new 2Cd(this.A00).A00() == 0 ? 0 : -1))) != this.A01) {
            return false;
        }
        return true;
    }

    public C50713FhE(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
