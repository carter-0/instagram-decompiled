package X;

import com.instagram.common.session.UserSession;

public abstract class HWJ {
    public static final 1OC A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/get_blend_medias/");
        A0a.A9m("blend_id", str);
        A0a.A0H(AnonymousClass000.A00(3147), z);
        A0a.A0G("target_media_ids", str2);
        C51968G9o.A1M(A0a, C273654mx.A00(914), str3, str4);
        A0a.A0G("seen_reels", str5);
        return DbU.A0S(A0a, C43876CGq.class, C45651D0b.class);
    }
}
