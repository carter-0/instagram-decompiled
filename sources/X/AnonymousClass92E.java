package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;

/* renamed from: X.92E  reason: invalid class name */
public abstract class AnonymousClass92E {
    public static final MutedWordsFilterManager A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass1p0.A00 == null) {
            return null;
        }
        return (MutedWordsFilterManager) userSession.A01(MutedWordsFilterManager.class, new AnonymousClass9LI(userSession, 22));
    }
}
