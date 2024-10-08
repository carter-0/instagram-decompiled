package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7os  reason: invalid class name and case insensitive filesystem */
public final class C342607os implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C339297jN A01;
    public final /* synthetic */ AnonymousClass3NV A02;
    public final /* synthetic */ Boolean A03;

    public C342607os(UserSession userSession, C339297jN r2, AnonymousClass3NV r3, Boolean bool) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = r2;
        this.A03 = bool;
    }

    public final void run() {
        AnonymousClass3NV r3 = this.A02;
        if (r3 != null && r3 != AnonymousClass3NV.A08 && C342557on.A00(this.A00).A00().contains(r3)) {
            C339297jN r2 = this.A01;
            if (r2.A04 != r3) {
                r2.A04 = r3;
                r2.A0J.CwQ(r3);
                if (0qQ.A0K(this.A03, true)) {
                    r2.A0H.A0C(r2.A0B.requireView(), r3);
                }
            }
        }
    }
}
