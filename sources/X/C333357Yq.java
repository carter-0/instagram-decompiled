package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.7Yq  reason: invalid class name and case insensitive filesystem */
public final class C333357Yq {
    public final UserSession A00;
    public final 0xa A01;
    public final AnonymousClass0r6 A02 = 11M.A00(AnonymousClass05K.A00, AnonymousClass0Zq.A00(new AnonymousClass9KF(this, (AnonymousClass4D7) null, 44)), Integer.MAX_VALUE);

    public C333357Yq(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1Al.A01(userSession).A04(1An.A0y, getClass());
    }

    public static final Map A00(C333357Yq r4) {
        String string = r4.A01.getString("map_of_story_sparkle_seen_timestamps", (String) null);
        if (string == null || string.length() == 0) {
            return 0Yt.A0E();
        }
        return (Map) C250863mB.A03.A00(string, new C258613zM(C255453u9.A01, C258663zR.A00));
    }

    public static final Map A01(C333357Yq r4) {
        String string = r4.A01.getString("map_of_seen_story_reply_sparkles", (String) null);
        if (string == null || string.length() == 0) {
            return 0Yt.A0E();
        }
        return (Map) C250863mB.A03.A00(string, new C258613zM(C255453u9.A01, C360278eK.A00));
    }

    public static final void A02(C333357Yq r4, Map map) {
        0xY AR4 = r4.A01.AR4();
        AR4.E5g("map_of_story_sparkle_seen_timestamps", C250863mB.A03.A02(map, new C258613zM(C255453u9.A01, C258663zR.A00)));
        AR4.apply();
    }

    public static final void A03(C333357Yq r4, Map map) {
        0xY AR4 = r4.A01.AR4();
        AR4.E5g("map_of_seen_story_reply_sparkles", C250863mB.A03.A02(map, new C258613zM(C255453u9.A01, C360278eK.A00)));
        AR4.apply();
    }

    public final void A04() {
        0xa r4 = this.A01;
        for (String str : r4.getAll().keySet()) {
            if (str != null && 00p.A0k(str, "last_time_ms_seen_creator_ai_nux", false)) {
                0xY AR4 = r4.AR4();
                AR4.ED3(str);
                AR4.apply();
            }
        }
    }
}
