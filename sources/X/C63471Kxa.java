package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kxa  reason: case insensitive filesystem */
public abstract class C63471Kxa {
    public static final float A00(UserSession userSession, Float f, float f2) {
        float f3 = 0.8f;
        if (182.A06(DbS.A0J(userSession, 1), userSession, 36325222777303791L)) {
            f3 = 0.75f;
        }
        if (f != null) {
            f3 = Math.max(f.floatValue(), f3);
        }
        return Math.min(1.91f, Math.max(f2, f3));
    }
}
