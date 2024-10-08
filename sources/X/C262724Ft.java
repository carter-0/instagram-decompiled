package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4Ft  reason: invalid class name and case insensitive filesystem */
public abstract class C262724Ft {
    public static final AnonymousClass9J0 A00(UserSession userSession, 1Xj r11, AnonymousClass4DU r12, AnonymousClass3W1 r13) {
        0qQ.A0B(r11, 0);
        AnonymousClass3W1 r9 = r13;
        0qQ.A0B(r13, 1);
        0qQ.A0B(r12, 3);
        boolean A4u = r11.A4u();
        ImageUrl A1Q = r11.A1Q();
        String id = r11.getId();
        if (id != null) {
            return new AnonymousClass9J0(new C376459Ib((C62320sa) new AnonymousClass9MR(28, r9, userSession, r11, r12), (0sP) new C377439Lv(6, r11, r13), (0sP) new C377439Lv(7, r11, r13), 11), A1Q, id, A4u);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
