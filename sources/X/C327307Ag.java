package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Ag  reason: invalid class name and case insensitive filesystem */
public final class C327307Ag {
    public final UserSession A00;
    public final List A01 = new ArrayList();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C327317Ah.A00);

    public C327307Ag(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(C13919TlL tlL, LiveLocationSession liveLocationSession) {
        LiveLocationSession liveLocationSession2 = liveLocationSession;
        String str = liveLocationSession.A04;
        0qQ.A07(str);
        Long A0n = 00y.A0n(10, str);
        C13919TlL tlL2 = tlL;
        if (A0n == null) {
            tlL.onError(new Throwable("Existing session ID is invalid"));
            return;
        }
        UserSession userSession = this.A00;
        String str2 = liveLocationSession.A02;
        0qQ.A07(str2);
        long longValue = A0n.longValue();
        1NY r4 = new 1NY(userSession, -2);
        r4.A04();
        r4.A0A("direct_v2/threads/broadcast/end_live_location_session/");
        r4.A0Q(1XP.class, 1XY.class);
        r4.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        r4.A0D("live_location_session_id", longValue);
        1OC A0M = r4.A0M();
        A0M.A00 = new C8752R7q(tlL2, liveLocationSession2, userSession, this, A0n);
        1ES.A03(A0M);
    }
}
