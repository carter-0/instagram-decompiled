package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gwr  reason: case insensitive filesystem */
public final class C53947Gwr extends C243963aQ {
    public final int A00;
    public final int A01;
    public final C337197fs A02;
    public final UserSession A03;
    public final 2WX A04;

    public C53947Gwr(2WX r2, C337197fs r3, UserSession userSession, int i, int i2) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r2;
    }

    public final C244523bK A0X(C244463bE r8) {
        0qQ.A0B(r8, 0);
        C337197fs r6 = this.A02;
        Object A002 = AnonymousClass3Zw.A00(r8, new C58177Inh(this, 40), new Object[]{r6});
        UserSession userSession = this.A03;
        int i = this.A01;
        Object A003 = AnonymousClass3Zw.A00(r8, new C41567AwZ(3, A002, this, r8), new Object[]{userSession, A002, r6, Integer.valueOf(i)});
        return C51965G9l.A0W(this.A04, new IKD(r6, i), C51969G9p.A0f(r8, C51971G9r.A0d(IJK.A00, 3), C58309Ipq.A00, new C59101J6j(37, (Object) this, A003)));
    }
}
