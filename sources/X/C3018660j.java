package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.60j  reason: invalid class name and case insensitive filesystem */
public abstract class C3018660j {
    public static final C3018760k A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C3018760k) userSession.A01(C3018760k.class, new AnonymousClass9LO(userSession, 20));
    }

    public static final GT1 A00(NoteAudience noteAudience) {
        int ordinal = noteAudience.ordinal();
        if (ordinal == 2) {
            return GT1.CLOSE_FRIENDS;
        }
        if (ordinal == 4) {
            return GT1.ALL_FOLLOWERS;
        }
        if (ordinal == 1) {
            return GT1.MUTUAL_FOLLOWERS;
        }
        return null;
    }
}
