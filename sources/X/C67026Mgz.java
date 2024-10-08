package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;

/* renamed from: X.Mgz  reason: case insensitive filesystem */
public abstract class C67026Mgz {
    public static final C67028Mh1 A00(UserSession userSession, AnonymousClass61K r4) {
        0qQ.A0B(userSession, 0);
        MutedWordsFilterManager A00 = AnonymousClass92E.A00(userSession);
        if (A00 == null) {
            return null;
        }
        return (C67028Mh1) userSession.A01(C67028Mh1.class, new C58195Inz(19, r4, userSession, A00));
    }
}
