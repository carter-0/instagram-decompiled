package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5FI  reason: invalid class name */
public abstract class AnonymousClass5FI {
    public static final 1GP A00(UserSession userSession, AnonymousClass3BU r13, String str, Map map, Set set, boolean z) {
        UserSession userSession2 = userSession;
        1FZ r5 = new 1FZ(userSession, 433402163, 1, false);
        r5.A08(AnonymousClass05K.A01);
        r5.A0A("feed/reels_media_stream/");
        r5.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), AnonymousClass49F.class, true, false);
        r5.A0R = true;
        r5.A0C("batch_size", (int) 182.A01(0Tu.A05, userSession2, 36595204421126226L));
        r5.A9m("reason", r13.toString());
        AnonymousClass5FJ.A00.A00(r5, userSession2, str, map, set, z);
        return r5.A0M();
    }
}
