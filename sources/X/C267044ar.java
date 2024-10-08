package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4ar  reason: invalid class name and case insensitive filesystem */
public abstract class C267044ar {
    public static final boolean A00(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        if (A01(context, userSession)) {
            return false;
        }
        0xa r3 = 1Au.A00(userSession).A01;
        if (!r3.getBoolean("has_partially_imported_contacts", false)) {
            return true;
        }
        if (System.currentTimeMillis() - r3.getLong(AnonymousClass000.A00(3490), 0) < 182.A01(0Tu.A06, userSession, 36603802945655763L) * 86400000) {
            return false;
        }
        return true;
    }

    public static final boolean A01(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        if (!1DL.A07(context, "android.permission.READ_CONTACTS") || !1Au.A00(userSession).A01.getBoolean("allow_contacts_sync", false)) {
            return false;
        }
        return true;
    }
}
