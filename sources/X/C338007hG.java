package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7hG  reason: invalid class name and case insensitive filesystem */
public abstract class C338007hG {
    public static final boolean A02(1Xj r1) {
        C67231sQ clipsMetadata = r1.A0C.getClipsMetadata();
        if (clipsMetadata != null) {
            return 0qQ.A0K(clipsMetadata.Cbo(), true);
        }
        return false;
    }

    public static final boolean A00(UserSession userSession, 1Xj r3) {
        String str;
        User A2A = r3.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        return 0qQ.A0K(str, userSession.A06);
    }

    public static final boolean A01(1Xj r1) {
        if (r1.A0t() > 0 || r1.A0u() > 0) {
            return true;
        }
        return false;
    }
}
