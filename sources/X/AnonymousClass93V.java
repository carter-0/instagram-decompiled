package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.93V  reason: invalid class name */
public abstract class AnonymousClass93V {
    public static final 1NY A00(UserSession userSession) {
        1NY r3 = new 1NY(userSession, -2);
        r3.A02 = new 1NS(new 0bH(userSession), AnonymousClass93W.class);
        return r3;
    }

    public static final 1FZ A02(UserSession userSession, int i) {
        1FZ r0 = new 1FZ(userSession, i, 1, false);
        r0.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), AnonymousClass93W.class, true, true);
        return r0;
    }

    public static final 1OC A03(AnonymousClass1O9 r5, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0O((15p) null, C298815u5.class, AnonymousClass93W.class, false);
        r2.A0A(AnonymousClass000.A00(2794));
        r2.A0G(AnonymousClass000.A00(2804), str);
        if (r5 != null) {
            r2.A00 = r5;
        }
        return r2.A0M();
    }

    public static final 1OC A04(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0O((15p) null, C54057Gyg.class, GNU.class, false);
        r2.A0A("clips/item/");
        r2.A0G("clips_media_id", str);
        r2.A0G("clips_media_shortcode", str2);
        r2.A0G("selected_clips_spin_id", str3);
        return r2.A0M();
    }

    public static final 1FZ A01(UserSession userSession) {
        1FZ r0 = new 1FZ(userSession, 1617547344, 1, false);
        r0.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), C45656D0g.class, true, true);
        return r0;
    }
}
