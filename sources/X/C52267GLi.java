package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GLi  reason: case insensitive filesystem */
public final class C52267GLi implements AnonymousClass0lh {
    public I75 A00;
    public final Object A01 = new Object();
    public final UserSession A02;
    public volatile HashMap A03 = AnonymousClass7TE.A1E();

    public C52267GLi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final HashMap A00() {
        HashMap hashMap;
        synchronized (this.A01) {
            hashMap = this.A03;
        }
        return hashMap;
    }

    public final void A01(C53332GmI gmI) {
        synchronized (this.A01) {
            HashMap hashMap = this.A03;
            Integer valueOf = Integer.valueOf(gmI.A01);
            if (hashMap.containsKey(valueOf)) {
                DbT.A1Q(0wj.A01, "ClipsMidcardCache: Trying to cache duplicated midcard at the same position", 817892914);
            }
            this.A03.put(valueOf, gmI);
        }
    }

    public final void onSessionWillEnd() {
        this.A03 = AnonymousClass7TE.A1E();
    }
}
