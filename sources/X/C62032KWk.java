package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KWk  reason: case insensitive filesystem */
public final class C62032KWk extends C252733pa {
    public final AnonymousClass4HW A00;
    public final UserSession A01;
    public final 1Av A02;
    public final Integer A03;
    public final String A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62032KWk(UserSession userSession, Integer num, String str) {
        super("Direct", AnonymousClass43D.A00(994363717));
        boolean z;
        02z A10;
        int A022 = DbW.A02(1, userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = num;
        KR4 kr4 = KR4.A00;
        02z A012 = 106.A01(kr4);
        this.A05 = A012;
        this.A07 = 10b.A03(A012);
        1Av A002 = 1Au.A00(userSession);
        this.A02 = A002;
        int A032 = DbY.A03(A002, A002.A6j, 1Av.A8a, 477);
        if (A032 == 1) {
            z = true;
            A10 = DbS.A10(new NW5(z));
        } else if (A032 != A022) {
            A10 = 106.A01(kr4);
        } else {
            z = false;
            A10 = DbS.A10(new NW5(z));
        }
        this.A06 = A10;
        this.A08 = 10b.A03(A10);
        this.A00 = C335967dq.A00(AnonymousClass4HU.A00);
    }

    public final Object A00(AnonymousClass4D7 r5) {
        this.A06.Epw(new NW5(true));
        this.A02.A0Y(1);
        AnonymousClass4HW r3 = this.A00;
        C59675JTg jTg = new C59675JTg(this, (AnonymousClass4D7) null, 7);
        C60340gF r2 = C60340gF.A00;
        Object A002 = r3.A00(r2, r5, jTg);
        if (A002 != 1Hj.A02) {
            return r2;
        }
        return A002;
    }
}
