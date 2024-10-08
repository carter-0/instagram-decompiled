package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.I0a  reason: case insensitive filesystem */
public final class C56529I0a {
    public static final C56529I0a A00 = new Object();
    public static final AnonymousClass4D6 A01 = 1ES.A01();

    public final void A00(UserSession userSession, Integer num, Integer num2, String str, List list, List list2) {
        String str2;
        int i;
        String str3;
        AnonymousClass4D6 r2 = A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A02();
        A0a.A0A("api/v1/upsells/async_respond_to_upsell/");
        switch (num.intValue()) {
            case 0:
                str2 = "block";
                break;
            case 1:
                str2 = "ccf";
                break;
            case 2:
                i = 1860;
                break;
            case 3:
                i = 1861;
                break;
            case 4:
                i = 1134;
                break;
            default:
                i = 1416;
                break;
        }
        str2 = AnonymousClass000.A00(i);
        A0a.A9m("upsell_type", str2);
        if (num2.intValue() != 0) {
            str3 = "seen";
        } else {
            str3 = "adopted";
        }
        A0a.A9m(AnonymousClass000.A00(768), str3);
        if (str != null) {
            A0a.A9m("upsell_style", str);
        }
        if (list2 != null) {
            A0a.A9m("suggested_hidden_words", C51970G9q.A0k(list2));
        }
        if (list != null) {
            A0a.A9m("upselled_suggested_hidden_words", C51970G9q.A0k(list));
        }
        r2.schedule(DbU.A0S(A0a, 1XP.class, 1XY.class));
    }
}
