package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8at  reason: invalid class name and case insensitive filesystem */
public abstract class C358428at {
    public static final C358448av A00(AnonymousClass0iw r5, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        return new C14443TwR(r5, userSession, (C14444TwS) null, str, (String) null, (String) null, (String) null);
    }

    public static final C358448av A01(AnonymousClass0iw r4, UserSession userSession, String str, boolean z) {
        Object obj;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        if (z) {
            obj = new C14443TwR(r4, userSession2, (C14444TwS) null, str, (String) null, (String) null, (String) null);
        } else {
            obj = new Object();
        }
        return (C358448av) obj;
    }
}
