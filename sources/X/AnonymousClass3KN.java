package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3KN  reason: invalid class name */
public class AnonymousClass3KN implements AnonymousClass3KO {
    public UserSession A00;
    public C252223ol A01;
    public 1GI A02;
    public AnonymousClass4DU A03;
    public AnonymousClass3KP A04;

    public void DhB(long j) {
        C252223ol r0 = this.A01;
        Integer BQo = r0.BQo();
        String BjP = r0.BjP();
        if (BQo.equals(AnonymousClass05K.A00)) {
            1Au.A00(this.A00).A0e(System.currentTimeMillis());
        }
        11Z.A02(new C57903IiK(this, BQo, BjP));
    }

    public AnonymousClass3KN(UserSession userSession, C252223ol r5, AnonymousClass4DU r6, String str) {
        this.A01 = r5;
        this.A00 = userSession;
        this.A03 = r6;
        this.A02 = 1GH.A00(userSession);
        this.A04 = new AnonymousClass3KP(this.A00, this.A03, str);
    }
}
