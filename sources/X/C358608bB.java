package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8bB  reason: invalid class name and case insensitive filesystem */
public final class C358608bB implements C358618bC {
    public final /* synthetic */ C358598bA A00;

    public C358608bB(C358598bA r1) {
        this.A00 = r1;
    }

    public final boolean onToggle(boolean z) {
        int i;
        UserSession userSession = this.A00.A00;
        1Au.A00(userSession).A1C(z);
        27r A01 = 27p.A01(userSession);
        if (z) {
            i = 2357;
        } else {
            i = 2358;
        }
        A01.A1Q(C59725JVj.PRE_CAPTURE, AnonymousClass000.A00(i));
        return true;
    }
}
