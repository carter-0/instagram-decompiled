package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PIs  reason: case insensitive filesystem */
public final class C72756PIs implements AnonymousClass5IX {
    public final 0BQ A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r3) {
        return AnonymousClass7TF.A1S(this.A00.CKD() ? 1 : 0, this.A01 ? 1 : 0);
    }

    public C72756PIs(UserSession userSession, boolean z) {
        this.A01 = z;
        this.A00 = AnonymousClass0BO.A00(userSession);
    }
}
