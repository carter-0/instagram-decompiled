package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.46O  reason: invalid class name */
public abstract class AnonymousClass46O {
    public static final boolean A00(Context context, UserSession userSession, boolean z) {
        boolean A0G;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        if (z) {
            A0G = C61970qY.A0D();
        } else {
            A0G = C61970qY.A0G(context);
        }
        if (A0G) {
            return true;
        }
        if (C238173Av.A00(userSession)) {
            return false;
        }
        if (!1Q3.A00(userSession).A01()) {
            return true;
        }
        Context context2 = C60960kU.A00;
        0qQ.A07(context2);
        if (!C61970qY.A0G(context2)) {
            return false;
        }
        return true;
    }
}
