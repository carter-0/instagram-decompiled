package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Em6  reason: case insensitive filesystem */
public abstract class C48906Em6 {
    public static final void A00(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        0qQ.A0B(str6, 7);
        0xI A00 = 0xI.A00(r2, str);
        A00.A0C("entity_type", str2);
        A00.A0C("entity_id", str3);
        if (str4 != null) {
            A00.A0C("based_on_id", str4);
        }
        A00.A0C("based_on_type", str5);
        A00.A0C(C273654mx.A00(275), str6);
        A00.A08(Integer.valueOf(i), "entity_ix");
        A00.A0F(map);
        DbU.A1R(A00, userSession);
    }
}
