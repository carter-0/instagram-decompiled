package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F7i  reason: case insensitive filesystem */
public abstract class C49797F7i {
    public static final C49887FBn A01(UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        if (i > 0) {
            return new C49887FBn(02m.A0p, userSession, i);
        }
        return null;
    }

    public static final C49887FBn A00(UserSession userSession) {
        return new C49887FBn(02m.A0p, userSession, C49887FBn.A03.getAndIncrement());
    }
}
