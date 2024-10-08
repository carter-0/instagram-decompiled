package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.LIw  reason: case insensitive filesystem */
public abstract class C64009LIw {
    public static void A00(0xF r1, UserSession userSession, C74551Pwk pwk, 1OS r4, C65661fY r5, DirectThreadKey directThreadKey, PendingMediaStore pendingMediaStore, PendingMediaStoreSerializer pendingMediaStoreSerializer, String str) {
        11Z.A02(new MAJ(r1, userSession, pwk, r4, r5, directThreadKey, pendingMediaStore, pendingMediaStoreSerializer, str));
    }

    public static boolean A01(AnonymousClass3Q2 r1) {
        if ((!r1.A4w || r1.A5Q) && !r1.A0n() && !r1.A13()) {
            return false;
        }
        return true;
    }
}
