package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5Ea  reason: invalid class name */
public abstract class AnonymousClass5Ea {
    public static final Integer A00(UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        String string = 1Au.A00(userSession).A01.getString("gallery_suggestions_setting", "auto_created_reels");
        0qQ.A07(string);
        for (Integer num : AnonymousClass05K.A00(2)) {
            if (1 - num.intValue() != 0) {
                str = "off";
            } else {
                str = "auto_created_reels";
            }
            if (str.equals(string)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }
}
