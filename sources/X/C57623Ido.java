package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.Ido  reason: case insensitive filesystem */
public final class C57623Ido implements MTG {
    public final UserSession A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public C57623Ido(2Wa r2, UserSession userSession, AnonymousClass3W1 r4) {
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
        this.A02 = C51965G9l.A0v(r2);
        this.A01 = C51965G9l.A0v(r4);
    }

    public final void CvD() {
        2Wa r0 = (2Wa) this.A02.get();
        if (r0 != null) {
            r0.A01((Object) null);
        }
        AnonymousClass3W1 r1 = (AnonymousClass3W1) this.A01.get();
        if (r1 != null) {
            r1.A1Y = null;
            AnonymousClass3W1.A00(r1, 42);
        }
    }
}
