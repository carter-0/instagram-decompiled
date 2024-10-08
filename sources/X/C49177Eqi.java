package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eqi  reason: case insensitive filesystem */
public abstract class C49177Eqi {
    public static final 1OC A00(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        0qQ.A0B(userSession, 0);
        boolean A1Z = DbW.A1Z(str2);
        if (z) {
            str5 = "mute_media_note";
        } else {
            str5 = "unmute_media_note";
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("friendships/%s/", new Object[]{str5});
        A0a.A9m("container_module", str2);
        A0a.A9m("ranking_info_token", str3);
        DbS.A1P(A0a, str);
        A0a.A9m(C66579MXk.A00(956), str4);
        return DbW.A0L(A0a, C320136rp.class, C320146rq.class, A1Z);
    }
}
