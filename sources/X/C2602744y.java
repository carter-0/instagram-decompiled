package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager$PresenceMsysAppStateChangeObserver;

/* renamed from: X.44y  reason: invalid class name and case insensitive filesystem */
public final class C2602744y implements RealtimeClientManager$PresenceMsysAppStateChangeObserver {
    public final /* synthetic */ UserSession A00;

    public C2602744y(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onAppBackgrounded() {
        UserSession userSession = this.A00;
        0qQ.A0A(userSession);
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36313403026835371L)) {
            0qQ.A0A(userSession);
            OTU otu = C70111NxR.A00(userSession).A00;
            if (otu != null) {
                OTU.A00(otu, new J73(14, otu, false));
            }
        }
    }

    public final void onAppForegrounded() {
        UserSession userSession = this.A00;
        0qQ.A0A(userSession);
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36313403026900908L)) {
            0qQ.A0A(userSession);
            OTU otu = C70111NxR.A00(userSession).A00;
            if (otu != null) {
                OTU.A00(otu, new J73(14, otu, true));
            }
        }
    }
}
