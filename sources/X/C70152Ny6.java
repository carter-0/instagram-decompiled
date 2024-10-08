package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ny6  reason: case insensitive filesystem */
public abstract class C70152Ny6 {
    public static 1OC A00(UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        1NY r2 = new 1NY(userSession);
        r2.A0R = true;
        r2.A04();
        r2.A0R(CFG.class, D17.class);
        r2.A0K("direct_v2/visual_threads/%s/item_seen/", new Object[]{str2});
        r2.A9m("item_ids", 002.A0g("[", str3, "]"));
        r2.A0G("original_message_client_context", str4);
        if (str.equals("voice_item_seen")) {
            str5 = "voice_media";
        } else if (str.equals("visual_item_seen")) {
            str5 = AnonymousClass000.A00(3832);
        } else {
            throw AnonymousClass7TF.A0W(C273654mx.A00(489), str);
        }
        r2.A9m("target_item_type", str5);
        r2.A0I("is_shh_mode", z2);
        if (z) {
            r2.A9m("sampled", "true");
        }
        return r2.A0M();
    }
}
