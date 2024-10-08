package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.AYh  reason: case insensitive filesystem */
public final class C40268AYh implements AnonymousClass0lh {
    public String A00;
    public final ReelStore A01;

    public final void onSessionWillEnd() {
        this.A00 = null;
    }

    public C40268AYh(UserSession userSession) {
        this.A01 = 1OP.A05(userSession);
    }
}
