package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2xv  reason: invalid class name and case insensitive filesystem */
public abstract class C234472xv {
    public static final C234502xy A00(Context context, UserSession userSession, AnonymousClass4DU r8, C234462xu r9, String str, boolean z) {
        return A01(context, userSession, r8, r9, str, false, z, false, false);
    }

    public static final C234502xy A01(Context context, UserSession userSession, AnonymousClass4DU r9, C234462xu r10, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 3);
        AnonymousClass4DU r3 = r9;
        C234462xu r4 = r10;
        boolean z5 = z3;
        if (z2) {
            return new C234492xx(context2, userSession2, r3, r4, new C234482xw(r9, userSession2, "MusicPlayerV2", str, z), z5, z4);
        }
        return new C318006oC(context2, userSession2, r3, r4, new C234482xw(r9, userSession2, "MusicPlayer", str, z), z5);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36325192712073907L);
    }
}
