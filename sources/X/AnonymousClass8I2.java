package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8I2  reason: invalid class name */
public final class AnonymousClass8I2 extends 2YL {
    public AnonymousClass80D A00;
    public final UserSession A01;
    public final AnonymousClass8IA A02;
    public final AnonymousClass8I6 A03;
    public final 05G A04 = 106.A01(AnonymousClass8I3.A00);
    public final AnonymousClass07g A05;

    public AnonymousClass8I2(AnonymousClass07g r7, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        this.A01 = userSession;
        this.A05 = r7;
        this.A03 = new 2YN(new AnonymousClass8I5(userSession), r7).A00(AnonymousClass8I6.class);
        this.A02 = new 2YN(new AnonymousClass8I9(userSession), r7).A00(AnonymousClass8IA.class);
        C318136oS A002 = C318116oQ.A00(this);
        C376889Js r0 = new C376889Js(this, (AnonymousClass4D7) null, 44);
        19B r4 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r4, r0, A002);
        1Eo.A03(num, r4, new C376889Js(this, (AnonymousClass4D7) null, 45), C318116oQ.A00(this));
    }

    public final void A00() {
        05G r2 = this.A04;
        if (!0qQ.A0K(r2.getValue(), AnonymousClass8I3.A00)) {
            r2.Epw(C378569Qi.A00);
        }
    }
}
