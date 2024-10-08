package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ek  reason: invalid class name and case insensitive filesystem */
public abstract class C239013Ek {
    public static final 1OC A00(UserSession userSession, String str) {
        String A02 = C239023El.A00(',').A02(AnonymousClass0BO.A00(userSession).BNy((String) null));
        String A022 = 0jh.A04.A01(userSession).A02(19f.A1L);
        if (A022 == null) {
            A022 = "";
        }
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("notifications/badge/");
        r3.A9m("user_ids", A02);
        r3.A9m("phone_id", A022);
        r3.A9m(Dbg.A02(0, 9, 56), str);
        r3.A0O((15p) null, C239033Em.class, C239043En.class, false);
        return r3.A0M();
    }
}
