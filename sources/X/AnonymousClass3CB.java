package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3CB  reason: invalid class name */
public abstract class AnonymousClass3CB {
    public static final AnonymousClass2vG A00(UserSession userSession, C233172vA r17, AnonymousClass4DU r18, AnonymousClass3BQ r19, AnonymousClass3C9 r20, C270414gh r21, C228812mN r22, C249763kK r23, String str, String str2, boolean z) {
        String str3 = str2;
        0qQ.A0B(str3, 4);
        UserSession userSession2 = userSession;
        AnonymousClass3CC r9 = new AnonymousClass3CC(userSession2);
        boolean A03 = 1P7.A03(userSession2);
        String sessionId = r23.getSessionId();
        C233192vD r14 = C233192vD.STORIES;
        String str4 = str;
        AnonymousClass3CD r1 = new AnonymousClass3CD(userSession2, r17, r18, r19, r20, r21, r22, r9, str4, str3, z);
        if (A03) {
            return C55154Hd4.A00(userSession2, r9, r14, r1, sessionId, str4, str3);
        }
        AnonymousClass2vG A00 = C233232vL.A00(userSession2, r9, r14, r1, str3);
        0qQ.A0A(A00);
        return A00;
    }
}
