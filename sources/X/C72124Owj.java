package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Owj  reason: case insensitive filesystem */
public final class C72124Owj implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass7Z9 A00;
    public final /* synthetic */ C254793t3 A01;

    public C72124Owj(AnonymousClass7Z9 r1, C254793t3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Eyr(AnonymousClass67Z r7) {
        UserSession userSession = this.A00.A00;
        String A0x = C66580MXl.A0x(this.A01);
        0qQ.A0B(A0x, 1);
        C66665MaY A08 = C66669Mac.A08(userSession, AnonymousClass1hH.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A00 = A0x;
        r0.A01 = false;
        C66580MXl.A1P(userSession, r0);
        C66582MXn.A1F(r7, true);
    }
}
