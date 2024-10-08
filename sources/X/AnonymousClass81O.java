package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.81O  reason: invalid class name */
public abstract class AnonymousClass81O {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.81P] */
    public static final AnonymousClass81P A00(UserSession userSession) {
        Class<AnonymousClass81P> cls = AnonymousClass81P.class;
        AnonymousClass81P r0 = (AnonymousClass81P) userSession.A00(cls);
        if (r0 != null) {
            return r0;
        }
        ? obj = new Object();
        userSession.A04(cls, obj);
        return obj;
    }
}
