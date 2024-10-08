package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Locale;

public abstract class FCW {
    public static void A00(Context context, 1P0 r12, UserSession userSession, User user, String str, String str2, boolean z, boolean z2, boolean z3) {
        User user2 = user;
        String id = user.getId();
        UserSession userSession2 = userSession;
        String str3 = str2;
        AnonymousClass7TF.A1E(userSession, 0, str3);
        String str4 = null;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("friendships/mute_posts_or_story_from_follow/");
        A0a.A9m("container_module", str3);
        boolean z4 = z;
        if (z) {
            A0a.A9m("target_posts_author_id", id);
        }
        boolean z5 = z2;
        if (z2) {
            A0a.A9m("target_reel_author_id", id);
        }
        if (!(str == null || str.length() == 0)) {
            A0a.A9m("media_id", str);
            1Xj A02 = 1E8.A03.A02(userSession, "MuteUserApi", str);
            if (A02 != null) {
                str4 = DbT.A0x(A02);
            }
            A0a.A0G("ranking_info_token", str4);
        }
        A0a.A0O((15p) null, DwR.class, C49810F7x.class, false);
        1OC A0K = DbW.A0K(A0a);
        A0K.A00 = new C47670ECe(context, r12, AnonymousClass1Nd.A00(userSession), userSession2, user2, z4, z5, z3);
        1ES.A03(A0K);
    }

    public static void A01(Context context, 1P0 r9, UserSession userSession, User user, String str, boolean z) {
        String str2;
        User user2 = user;
        String id = user.getId();
        0qQ.A0B(userSession, 0);
        boolean A1Z = DbW.A1Z(str);
        boolean z2 = z;
        if (z) {
            str2 = "mute_note";
        } else {
            str2 = "unmute_note";
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        String format = String.format(Locale.getDefault(), "friendships/%s/", Arrays.copyOf(new Object[]{str2}, A1Z ? 1 : 0));
        0qQ.A07(format);
        A0a.A0E = format;
        A0a.A9m("container_module", str);
        DbS.A1P(A0a, id);
        1OC A0L = DbW.A0L(A0a, DwR.class, C49810F7x.class, A1Z);
        A0L.A00 = new C8763R8o(2, AnonymousClass1Nd.A00(userSession), r9, context, user2, z2);
        1ES.A03(A0L);
    }

    public static void A02(1P0 r8, UserSession userSession, User user, String str) {
        String id = user.getId();
        AnonymousClass7TF.A1D(userSession, 0, str);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("friendships/unmute_posts_or_story_from_follow/");
        A0a.A9m("container_module", str);
        A0a.A9m("target_reel_author_id", id);
        1OC A0L = DbW.A0L(A0a, DwR.class, C49810F7x.class, true);
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        1P0 r2 = r8;
        A0L.A00 = new C47668ECc(r2, A00, userSession, user, false, true);
        1ES.A03(A0L);
    }
}
