package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2m3  reason: invalid class name and case insensitive filesystem */
public final class C228652m3 extends AnonymousClass2m1 {
    public final UserSession A00;

    public final void Dek(AnonymousClass1GU r3) {
        1Ng A002;
        Object obj;
        0qQ.A0B(r3, 0);
        1FS r1 = r3.A00;
        if (!r1.A02()) {
            A002 = AnonymousClass1Nd.A00(this.A00);
            obj = new Object();
        } else {
            1FI r12 = r1.A04;
            if (r12 == 1FI.A0J || r12 == 1FI.A0H) {
                A002 = AnonymousClass1Nd.A00(this.A00);
                obj = new Object();
            } else {
                return;
            }
        }
        A002.A00((AnonymousClass1qK) obj);
    }

    public C228652m3(UserSession userSession) {
        this.A00 = userSession;
    }
}
