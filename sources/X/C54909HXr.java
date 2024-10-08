package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.HXr  reason: case insensitive filesystem */
public abstract class C54909HXr {
    public static final C54167H1m A00(UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, str);
        C54167H1m h1m = new C54167H1m();
        Bundle A0a = AnonymousClass7TE.A0a();
        AnonymousClass0Dg.A00(A0a, userSession);
        A0a.putString("args_media_id", str);
        h1m.setArguments(A0a);
        return h1m;
    }
}
