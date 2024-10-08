package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;

/* renamed from: X.F4b  reason: case insensitive filesystem */
public abstract class C49736F4b {
    public static final C290815g0 A01(Context context, Uri uri, UserSession userSession, String str, int i) {
        0qQ.A0B(userSession, 1);
        return new C290815g0(new C13151TNj(context, uri, userSession, str, i), 450);
    }

    public static final 1OC A00(UserSession userSession) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/remove_profile_picture/");
        A0a.A04 = new T07(userSession, 3);
        A0a.A0Q(C47328Duv.class, C49737F4c.class);
        return DbW.A0K(A0a);
    }
}
