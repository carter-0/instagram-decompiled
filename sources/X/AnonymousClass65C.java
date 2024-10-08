package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.65C  reason: invalid class name */
public final class AnonymousClass65C {
    public final String A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        NB0 A00 = A00(userSession);
        if (A00 != null && A00.mResultSet.getCount() > 0) {
            return String.valueOf(A00.mResultSet.getNullableLong(0, 0));
        }
        if (182.A06(0Tu.A05, userSession, 2342161901214702258L)) {
            return "0";
        }
        return null;
    }

    public static final AnonymousClass65B A01(UserSession userSession) {
        synchronized (XYJ.class) {
            if (!XYJ.A00) {
                0dV.A0C("instagramencryptedbackup_jni");
                XYJ.A00 = true;
            }
        }
        return (AnonymousClass65B) userSession.A01(AnonymousClass65B.class, new AnonymousClass9L0(userSession, 15));
    }

    public static final NB0 A00(UserSession userSession) {
        NB0 nb0;
        if (!AnonymousClass65D.A00(userSession).A00()) {
            return null;
        }
        AnonymousClass65B A01 = A01(userSession);
        synchronized (A01) {
            AnonymousClass65C r0 = AnonymousClass65B.A03;
            nb0 = A01.A00;
        }
        return nb0;
    }
}
