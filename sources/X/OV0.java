package X;

import com.instagram.common.session.UserSession;

public final class OV0 {
    public final 0xa A00;

    public final Boolean A01(C254783t2 r6, int i) {
        String A002 = A00(r6, i);
        if (A002 == null) {
            return null;
        }
        0xa r1 = this.A00;
        if (r1.contains(A002)) {
            return Boolean.valueOf(r1.getBoolean(A002, false));
        }
        return null;
    }

    public static final String A00(C254783t2 r3, int i) {
        if (r3 instanceof C254763t0) {
            return 002.A07(i, "thread:", ((C254763t0) r3).A00, "_capability:");
        }
        return null;
    }

    public OV0(UserSession userSession) {
        0xa A04 = 1Al.A01(userSession).A04(1An.A1i, OV0.class);
        0qQ.A0B(A04, 1);
        this.A00 = A04;
    }
}
