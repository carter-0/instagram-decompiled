package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FhQ  reason: case insensitive filesystem */
public final class C50725FhQ implements AnonymousClass5IX {
    public final int A00;
    public final UserSession A01;

    public final boolean E1z(AnonymousClass5IY r7) {
        if (2Aq.A03(this.A01).A0O() >= ((long) this.A00)) {
            return true;
        }
        return false;
    }

    public C50725FhQ(UserSession userSession, int i) {
        this.A01 = userSession;
        this.A00 = i;
    }
}
