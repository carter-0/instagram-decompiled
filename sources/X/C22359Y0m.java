package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Y0m  reason: case insensitive filesystem */
public final class C22359Y0m implements AnonymousClass5IX {
    public final XTn A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r3) {
        return AnonymousClass7TF.A1S(this.A00.A00 ? 1 : 0, this.A01 ? 1 : 0);
    }

    public C22359Y0m(UserSession userSession, boolean z) {
        this.A01 = z;
        this.A00 = (XTn) userSession.A01(XTn.class, Y6P.A00);
    }
}
