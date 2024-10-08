package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.RgJ  reason: case insensitive filesystem */
public abstract class C9761RgJ {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(userSession, "fb_story_to_ig_story_mentions"), "xav_navigable_mentions");
        if (A0e.isSampled()) {
            A0e.AAJ("event", str);
            A0e.A9F("ig_userid", AnonymousClass7TE.A10(str2));
            A0e.AAJ("mentioned_type", str3);
            A0e.AAJ("ig_story_id", str4);
            A0e.A9H("extra", map);
            A0e.Cgf();
        }
    }
}
