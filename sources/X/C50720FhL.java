package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FhL  reason: case insensitive filesystem */
public final class C50720FhL implements AnonymousClass5IX {
    public final UserSession A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r3) {
        return AnonymousClass7TF.A1S(DbT.A1a(AnonymousClass7TE.A0q(this.A00), "has_seen_main_disclosure_sheet") ? 1 : 0, this.A01 ? 1 : 0);
    }

    public C50720FhL(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
