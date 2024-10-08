package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.KtY  reason: case insensitive filesystem */
public abstract class C63227KtY {
    public static final boolean A00(UserSession userSession, DirectThreadKey directThreadKey) {
        0qQ.A0B(userSession, 0);
        if (directThreadKey == null || (directThreadKey.A01 == null && directThreadKey.A00 == null)) {
            return true;
        }
        return AnonymousClass796.A03(userSession, directThreadKey, AnonymousClass05K.A09).A00();
    }
}
