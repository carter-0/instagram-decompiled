package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GEz  reason: case insensitive filesystem */
public final class C52105GEz implements JQU {
    public 0sP A00;
    public final UserSession A01;
    public final C273004lm A02;

    public C52105GEz(UserSession userSession, C273004lm r3) {
        0qQ.A0B(r3, 2);
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void DH6(GER ger) {
        0qQ.A0B(ger, 0);
        C272994ll.A00(this.A01).A09(ger.A00, AnonymousClass05K.A08, ger.A01);
    }

    public final void Do7(GER ger) {
        0qQ.A0B(ger, 0);
        0sP r4 = this.A00;
        if (r4 != null) {
            C273004lm r3 = this.A02;
            Integer num = AnonymousClass05K.A08;
            String str = ger.A00;
            r3.A08(str, num, ger.A01);
            r4.invoke(str);
        }
    }

    public final void EbL(0sP r1) {
        this.A00 = r1;
    }
}
