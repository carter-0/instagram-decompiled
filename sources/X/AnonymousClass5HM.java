package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.5HM  reason: invalid class name */
public abstract class AnonymousClass5HM {
    public static final Set A00 = 0sc.A07(new AnonymousClass5HN[]{AnonymousClass5HN.TEXT_MESSAGE, AnonymousClass5HN.UNSEND_MESSAGE, AnonymousClass5HN.EXPIRE_MESSAGE, AnonymousClass5HN.IG_STORY_REPLY, AnonymousClass5HN.AE_REACTION_ADDED});
    public static final Set A01 = 0sc.A07(new String[]{"direct_v2_text", "direct_v2_reel_share", "direct_v2_delete_item"});

    public static final UserSession A00(String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
            return 09i.A0A.A07(bundle);
        } catch (Exception e) {
            0KC.A0Q("IGSyncPathNotification", "Failed to get intended user session: %s", new Object[]{e.getMessage()});
            return null;
        }
    }

    public static final boolean A01(UserSession userSession) {
        0eE r3 = AnonymousClass0t1.A01;
        if (2Ek.A03(r3.A01(userSession)) && 182.A06(0Tu.A05, userSession, 36314863315716961L)) {
            return true;
        }
        if (!2Ek.A02(r3.A01(userSession)) || !182.A06(0Tu.A05, userSession, 36314863316962150L)) {
            return false;
        }
        return true;
    }
}
