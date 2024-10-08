package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.62C  reason: invalid class name */
public final class AnonymousClass62C {
    public final C67671vk A00;

    public AnonymousClass62C(C67671vk r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final XFT A00(String str) {
        0qQ.A0B(str, 1);
        AnonymousClass625 r2 = AnonymousClass624.A03;
        C67671vk r1 = this.A00;
        UserSession userSession = r1.A00;
        if (userSession != null) {
            AnonymousClass624 A002 = r2.A00(userSession);
            AnonymousClass6OC r22 = AnonymousClass6OB.A01;
            UserSession userSession2 = r1.A00;
            if (userSession2 != null) {
                return new XFT(A002.A01(), r22.A01(AnonymousClass6OC.A00(userSession2, str), userSession2, str), AnonymousClass6OG.A01);
            }
            throw new RuntimeException("Trying to access showreel without session init");
        }
        throw new RuntimeException("Trying to access showreel without session init");
    }
}
