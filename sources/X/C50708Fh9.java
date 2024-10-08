package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fh9  reason: case insensitive filesystem */
public final class C50708Fh9 implements AnonymousClass5IX {
    public final C48222Eb3 A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r3) {
        return AnonymousClass7TF.A1S(this.A00.A00 ? 1 : 0, this.A01 ? 1 : 0);
    }

    public C50708Fh9(UserSession userSession, boolean z) {
        this.A00 = (C48222Eb3) userSession.A01(C48222Eb3.class, G2E.A00);
        this.A01 = z;
    }
}
