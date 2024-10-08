package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HkC  reason: case insensitive filesystem */
public final class C55592HkC {
    public final C54332H8e A00;
    public final 2el A01;

    public C55592HkC(AnonymousClass4DJ r3, UserSession userSession, 2el r5, AnonymousClass4DU r6, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = r5;
        C54332H8e h8e = new C54332H8e(userSession, r6, str);
        this.A00 = h8e;
        r3.registerLifecycleListener(new H5E(h8e));
    }
}
