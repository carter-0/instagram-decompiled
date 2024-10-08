package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Cz  reason: invalid class name and case insensitive filesystem */
public abstract class C304316Cz {
    public static final AnonymousClass6D0 A00(C299515vK r4, UserSession userSession, Integer num, boolean z, boolean z2) {
        int A00;
        float f;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        if (num != null) {
            A00 = num.intValue();
        } else {
            A00 = (int) 182.A00(0Tu.A05, userSession, 37163583215239461L);
        }
        float width = (float) r4.getWidth();
        float height = (float) r4.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            f = 1.0f;
        } else {
            f = width / height;
        }
        int i = 16;
        float f2 = 12.0f;
        if (z2) {
            f2 = 16.0f;
        }
        if (z) {
            i = 0;
        }
        return new AnonymousClass6D0(new C304826Fj(12.0f, 0.0f, f2, (float) i), f, A00);
    }

    public static final AnonymousClass6D0 A01(UserSession userSession, Integer num, float f, boolean z) {
        int A00;
        0qQ.A0B(userSession, 0);
        if (num != null) {
            A00 = num.intValue();
        } else {
            A00 = (int) 182.A00(0Tu.A05, userSession, 37163583215370534L);
        }
        float f2 = 12.0f;
        if (z) {
            f2 = 16.0f;
        }
        return new AnonymousClass6D0(new C304826Fj(12.0f, 0.0f, f2, 4.0f), f, A00);
    }
}
