package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6iU  reason: invalid class name and case insensitive filesystem */
public final class C314576iU {
    public C316006kx A00;
    public C294975nL A01;
    public final C227862kA A02;
    public final UserSession A03;
    public final C317746nl A04;

    public C314576iU(AnonymousClass07Z r12, AnonymousClass07g r13, AnonymousClass0iw r14, UserSession userSession, C317376nA r16) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = new C317746nl(userSession);
        this.A02 = new C227862kA(new AnonymousClass9LV(r13, 49), new AnonymousClass9MJ(1, r14, r16, this), C317496nM.A00, new 0Yh(C314556iS.class));
        AnonymousClass07Z r6 = r12;
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r12);
        AnonymousClass9KE r5 = new AnonymousClass9KE(r6, r14, this, (AnonymousClass4D7) null, 8);
        19B r4 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r4, r5, A002);
        1Eo.A03(num, r4, new AnonymousClass9K1((Object) r12, (Object) this, (AnonymousClass4D7) null, 25), AnonymousClass07a.A00(r12));
    }

    public final void A00(C316026kz r4, int i) {
        C316006kx r42;
        C252063oV r2;
        C252063oV r22;
        C252063oV r23;
        C252063oV r24;
        if (r4 instanceof C316006kx) {
            r42 = (C316006kx) r4;
        } else {
            r42 = null;
        }
        this.A00 = r42;
        if (!(r42 == null || (r24 = r42.A1e.A1Y) == null)) {
            AnonymousClass6YA.A01(r24, new AnonymousClass9LT(this, 41));
        }
        C316006kx r0 = this.A00;
        if (!(r0 == null || (r23 = r0.A0x) == null)) {
            AnonymousClass6YA.A01(r23, new C377339Ll(this, i, 3));
        }
        C316006kx r02 = this.A00;
        if (!(r02 == null || (r22 = r02.A1e.A1Z) == null)) {
            AnonymousClass6YA.A01(r22, new AnonymousClass9LT(this, 42));
        }
        C316006kx r03 = this.A00;
        if (r03 != null && (r2 = r03.A0z) != null) {
            AnonymousClass6YA.A01(r2, new C377339Ll(this, i, 4));
        }
    }
}
