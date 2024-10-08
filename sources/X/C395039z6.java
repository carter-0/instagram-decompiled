package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.9z6  reason: invalid class name and case insensitive filesystem */
public abstract class C395039z6 {
    public static final void A00(UserSession userSession, C254703su r5, Integer num, String str) {
        String str2;
        String str3;
        boolean z;
        0qQ.A0B(str, 1);
        if (!r5.A1S()) {
            if (182.A06(0Tu.A05, userSession, 36314889085782901L)) {
                synchronized (r5) {
                    z = r5.A2I;
                }
                if (!z) {
                    synchronized (r5) {
                        r5.A2I = true;
                    }
                } else {
                    return;
                }
            }
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("direct_v2/message_delivered_trigger/");
            A0a.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0a.A9m("item_id", r5.A0h());
            A0a.A9m("sender_id", r5.A1u);
            A0a.A9m("timestamp", String.valueOf(r5.C7c()));
            if (num.intValue() != 0) {
                str2 = "load_thread";
            } else {
                str2 = "new_message_delta";
            }
            A0a.A9m("delivery_source", str2);
            A0a.A0G("client_context", r5.A0f());
            Object obj = r5.A1T;
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            A0a.A0G(AnonymousClass000.A00(3591), str3);
            A0a.A0Q(1XP.class, 1XY.class);
            1ES.A03(A0a.A0M());
        }
    }
}
