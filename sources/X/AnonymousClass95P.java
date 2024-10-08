package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.95P  reason: invalid class name */
public final class AnonymousClass95P extends AnonymousClass95Q {
    public final 0xa A00;

    public final int A01() {
        String A002 = AnonymousClass000.A00(957);
        try {
            int i = this.A00.getInt(AnonymousClass000.A00(3310), 0);
            if (i >= 0) {
                return i;
            }
            0KC.A0E(A002, "OverflowError - Fetching negative timestamp values");
            return 0;
        } catch (ClassCastException e) {
            0KC.A0K(A002, "ClassCastException while trying to get last lookup timestamp", e);
            return 0;
        }
    }

    public AnonymousClass95P(UserSession userSession) {
        this.A00 = 1Al.A01(userSession).A03(1An.A2W);
    }
}
