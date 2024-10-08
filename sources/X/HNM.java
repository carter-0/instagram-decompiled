package X;

import com.instagram.common.session.UserSession;

public enum HNM {
    NOTES_NUX,
    NOTES_WITH_LOCATION_NUX,
    CREATE_NOTE_LOCATION_EDUCATION,
    SHARE_LOCATION_EDUCATION,
    MAP_LOCATION_EDUCATION;

    public final void A00(UserSession userSession) {
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        0qQ.A0B(userSession, 0);
        int ordinal = ordinal();
        1Av A002 = 1Au.A00(userSession);
        if (ordinal != 0) {
            r2 = A002.A1N;
            r1 = 1Av.A8a;
            i = 499;
        } else {
            r2 = A002.A1P;
            r1 = 1Av.A8a;
            i = 498;
        }
        DbZ.A1b(A002, r2, r1, i);
    }

    public final boolean A01(UserSession userSession) {
        1Av A002;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        char c;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                0Tu r22 = 0Tu.A05;
                if (!182.A06(r22, userSession, 36321769624053468L) || !AnonymousClass3HF.A03(userSession)) {
                    return false;
                }
                if (!182.A06(r22, userSession, 36321769624708838L)) {
                    A002 = 1Au.A00(userSession);
                    r2 = A002.A1N;
                    r1 = 1Av.A8a;
                    c = 499;
                }
            }
            return true;
        }
        0Tu r23 = 0Tu.A05;
        if (!182.A06(r23, userSession, 36321769624119005L) || AnonymousClass3HF.A03(userSession)) {
            return false;
        }
        if (!182.A06(r23, userSession, 36321769624708838L)) {
            A002 = 1Au.A00(userSession);
            r2 = A002.A1P;
            r1 = 1Av.A8a;
            c = 498;
        }
        return true;
        if (AnonymousClass7TE.A0M(r2.CDM(A002, r1[c])) < 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    static {
        HNM[] hnmArr;
        A00 = 0oU.A00(hnmArr);
    }
}
