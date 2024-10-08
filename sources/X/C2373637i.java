package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.37i  reason: invalid class name and case insensitive filesystem */
public final class C2373637i {
    public static final /* synthetic */ C2373637i A00 = new Object();

    public static final C2373837k A00(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        return (C2373837k) userSession.A01(C2373737j.class, new C377419Lt(44, context, userSession));
    }

    public static final String A01(AnonymousClass3Q2 r1) {
        0qQ.A0B(r1, 0);
        String str = r1.A3O;
        if (str != null) {
            return str;
        }
        String str2 = r1.A3b;
        if (str2 == null) {
            return r1.A3t;
        }
        return str2;
    }
}
