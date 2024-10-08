package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.79Z  reason: invalid class name */
public final class AnonymousClass79Z {
    public final UserSession A00;

    public AnonymousClass79Z(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00(AnonymousClass5FV r6) {
        long j;
        0qQ.A0B(r6, 0);
        if (!r6.A01) {
            return false;
        }
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A05;
        if (!182.A06(r3, userSession, 36320060226412452L)) {
            return false;
        }
        C69858NtM ntM = C69858NtM.$redex_init_class;
        int ordinal = r6.ordinal();
        if (ordinal == 5) {
            j = 36320060226346915L;
        } else if (ordinal == 8) {
            j = 36320060226215841L;
        } else if (ordinal == 6) {
            j = 36320060226150304L;
        } else if (ordinal != 7) {
            return false;
        } else {
            j = 36320060226281378L;
        }
        return 182.A06(r3, userSession, j);
    }
}
