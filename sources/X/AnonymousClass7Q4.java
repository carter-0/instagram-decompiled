package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7Q4  reason: invalid class name */
public final class AnonymousClass7Q4 {
    public final 0wc A00;
    public final Integer A01;
    public final List A02;

    public AnonymousClass7Q4(AnonymousClass0iw r2, UserSession userSession, Integer num, List list) {
        0qQ.A0B(num, 3);
        this.A01 = num;
        this.A02 = list;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final void A00(AnonymousClass7Q4 r3, String str, HashMap hashMap) {
        String str2;
        0wc r2 = r3.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_emoji_quick_reply_events");
        if (A002.isSampled()) {
            switch (r3.A01.intValue()) {
                case 0:
                    str2 = "V1";
                    break;
                case 1:
                    str2 = "V2";
                    break;
                default:
                    str2 = "DISABLED";
                    break;
            }
            hashMap.put("ui_type", str2);
            A002.AAJ("action", str);
            A002.A9H("event_data", hashMap);
            A002.AAe(C66579MXk.A00(39), r3.A02);
            A002.Cgf();
        }
    }
}
