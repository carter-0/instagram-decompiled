package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mfm  reason: case insensitive filesystem */
public abstract class C66953Mfm {
    public static final C72192OyC A01(UserSession userSession) {
        return (C72192OyC) userSession.A00(C72192OyC.class);
    }

    public static final C72192OyC A00(Context context, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, context);
        return (C72192OyC) userSession.A01(C72192OyC.class, new MJ8(48, context, userSession));
    }
}
