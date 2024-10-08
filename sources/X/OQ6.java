package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.HashMap;
import java.util.Map;

public abstract class OQ6 {
    public static void A00(AnonymousClass0iw r1, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        A01(r1, userSession, directThreadKey, str, new HashMap());
    }

    public static final void A01(AnonymousClass0iw r1, UserSession userSession, DirectThreadKey directThreadKey, String str, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "direct_professional_thread_reminder_events");
        if (A0e.isSampled()) {
            String str2 = directThreadKey.A00;
            if (str2 == null) {
                str2 = "null";
            }
            map.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            DbS.A1J(A0e, str);
            A0e.A9H("event_data", map);
            A0e.Cgf();
        }
    }
}
