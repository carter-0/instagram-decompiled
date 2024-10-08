package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.51b  reason: invalid class name and case insensitive filesystem */
public final class C2802851b extends 0vM {
    public final /* synthetic */ 2Dn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2802851b(2Dn r7) {
        super("prefetchPresence", 1001645790, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A02;
        if (1Au.A00(userSession).A21()) {
            C2615449z.A00(userSession).A05(AnonymousClass05K.A0C);
        }
    }
}
