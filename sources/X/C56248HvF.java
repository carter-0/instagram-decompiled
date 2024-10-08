package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.HvF  reason: case insensitive filesystem */
public abstract class C56248HvF {
    public static final 1OC A00(UserSession userSession, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/effect/");
        A0a.A0G("effect_id", str);
        C51968G9o.A1J(A0a, C54193H2n.class, I2J.class, str2);
        A0a.A0H("should_show_friends_media_at_top", z4);
        if (num != null && !z && z2) {
            A0a.A0A = 002.A0R("effect_page_cache_", str);
            if (!z3) {
                A0a.A01 = 900000;
            }
            A0a.A07 = num;
        }
        return A0a.A0M();
    }

    public static final 1OC A01(UserSession userSession, String str) {
        String str2;
        String str3;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
            0qQ.A07(forName);
            byte[] bytes = "STELLA".getBytes(forName);
            0qQ.A07(bytes);
            str2 = AnonymousClass7TF.A0j(C56478HzA.A00(instance.digest(bytes)));
        } catch (NoSuchAlgorithmException e) {
            0wb.A07("ray_ban_stories_pivot_page_sha_256", e);
            str2 = "2c432622994e30bbfd56e291ae9f9619c621ca92148c81450ee8f90b9659c6b8";
        }
        try {
            MessageDigest instance2 = MessageDigest.getInstance("SHA-256");
            Charset forName2 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
            0qQ.A07(forName2);
            byte[] bytes2 = "HAMMERHEAD".getBytes(forName2);
            0qQ.A07(bytes2);
            str3 = AnonymousClass7TF.A0j(C56478HzA.A00(instance2.digest(bytes2)));
        } catch (NoSuchAlgorithmException e2) {
            0wb.A07("ray_ban_stories_pivot_page_sha_256", e2);
            str3 = "2c432622994e30bbfd56e291ae9f9619c621ca92148c81450ee8f90b9659c6b8&6b5be410af4f029362a280f0d63fb1aceb8d6667c46d3a6201d882e0c1b116be";
        }
        String A0T = 002.A0T(str2, str3, '&');
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("metaverse_bridges/attribution_pivot_page/");
        A0b.A0Q(C43879CGt.class, C45650D0a.class);
        G9w.A1I(A0b, "capture_source_hash", A0T, str);
        A0b.A9m("expanded_media", "true");
        return A0b.A0M();
    }
}
