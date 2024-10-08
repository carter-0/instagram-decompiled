package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.LIv  reason: case insensitive filesystem */
public abstract class C64008LIv {
    public static final void A00(UserSession userSession, DirectThreadKey directThreadKey, AnonymousClass3Q2 r3, 1ua r4) {
        0qQ.A0B(r4, 3);
        if (A01(userSession, directThreadKey)) {
            PendingMediaStore A00 = 28K.A00(userSession);
            A00.A07.add(r3.A35);
            return;
        }
        r4.A0B(r3);
    }

    public static final boolean A01(UserSession userSession, DirectThreadKey directThreadKey) {
        boolean z = false;
        if (!182.A06(0Tu.A05, userSession, 2342164482484348324L)) {
            return false;
        }
        AnonymousClass3U9 A03 = 2Dr.A03(1bJ.A00(userSession), directThreadKey);
        if (A03 != null && A03.BMT() == AnonymousClass05K.A0N) {
            z = true;
        }
        return !z;
    }
}
