package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Epy  reason: case insensitive filesystem */
public abstract class C49135Epy {
    public static final C50989Fmc A00(Activity activity, UserSession userSession, String str, String str2, int i) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("sessionId", str2);
        Activity activity2 = activity;
        return C50989Fmc.A00(activity2, new FOC(activity2, A0a, userSession, str, i, 3), i);
    }
}
