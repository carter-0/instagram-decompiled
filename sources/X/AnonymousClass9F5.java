package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9F5  reason: invalid class name */
public final class AnonymousClass9F5 {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C377119Kp(this, 16));
    public final Integer A02;

    public AnonymousClass9F5(UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = num;
    }

    public final void A00(AnonymousClass9JK r3, AnonymousClass9F2 r4) {
        AH0.A01(r3, (AH0) this.A01.getValue(), r4, this.A02);
    }

    public final void A01(AnonymousClass9F2 r3, String str) {
        Integer num = this.A02;
        if (num != null) {
            ((AH0) this.A01.getValue()).A02(r3, num, str);
        }
    }
}
