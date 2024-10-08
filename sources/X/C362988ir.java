package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8ir  reason: invalid class name and case insensitive filesystem */
public abstract class C362988ir {
    public static final boolean A01(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (1pd.A06 == null || !C362998is.A00(context, userSession)) {
            return false;
        }
        return true;
    }

    public static final 1pd A00() {
        1pd r0 = 1pd.A06;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("plugin");
        throw AnonymousClass00P.createAndThrow();
    }
}
