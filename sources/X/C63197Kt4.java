package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Map;

/* renamed from: X.Kt4  reason: case insensitive filesystem */
public abstract class C63197Kt4 {
    public static final void A00(AnonymousClass4DH r12, UserSession userSession, C3499682q r14, Map map, C62320sa r16, 0sP r17) {
        MusicBrowseCategory A01 = C64181LSn.A01("feed_browse");
        new JZH(r12, userSession, A01, new C65515Lud(userSession, r14, A01, map, r16, r17), false).A00(true);
    }
}
