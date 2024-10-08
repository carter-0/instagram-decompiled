package X;

import com.instagram.common.session.UserSession;

public abstract class LTC {
    public static final 1OC A02(UserSession userSession, Integer num, String str) {
        String str2;
        AnonymousClass7TF.A1B(str, 1, num);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("live/%s/mute/audio/", new Object[]{str});
        if (num.intValue() != 0) {
            str2 = "unmuted";
        } else {
            str2 = "muted";
        }
        return JTU.A0H(A0a, "audio_mute", str2, true);
    }

    public static final 1OC A03(UserSession userSession, Integer num, String str) {
        String str2;
        AnonymousClass7TF.A1B(str, 1, num);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("live/%s/mute/video/", new Object[]{str});
        if (num.intValue() != 0) {
            str2 = "unmuted";
        } else {
            str2 = "muted";
        }
        return JTU.A0H(A0a, "video_mute", str2, true);
    }

    public static final 1OC A04(UserSession userSession, Integer num, String str, String str2) {
        String str3;
        AnonymousClass7TF.A1C(str, 0, userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("live/%s/wave/", new Object[]{str});
        A0a.A9m(AnonymousClass000.A00(4208), str2);
        if (num.intValue() != 0) {
            str3 = "wave_back";
        } else {
            str3 = "wave";
        }
        A0a.A9m("wave_type", str3);
        return JTU.A0G(A0a);
    }

    public static final 1OC A05(UserSession userSession, String str) {
        0qQ.A0B(str, 0);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("live/%s/moderator/resign/", new Object[]{str});
        return JTU.A0G(A0a);
    }

    public static final 1OC A06(UserSession userSession, String str, boolean z) {
        0qQ.A0B(str, 1);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0K("live/%s/info/", new Object[]{str});
        A0b.A0H("view_expired_broadcast", z);
        A0b.A9m("include_guests_in_vod", "false");
        return DbT.A0R((15p) null, A0b, C270194gL.class, C45893D9w.class, true);
    }

    public static final 1NY A00(UserSession userSession, String str) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("live/%s/heartbeat_and_get_viewer_count/", new Object[]{str});
        A0a.A0Q(CGE.class, C45720D2t.class);
        return A0a;
    }

    public static final 1OC A01(UserSession userSession) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("users/live_settings/");
        return DbU.A0S(A0M, K1W.class, LHL.class);
    }
}
