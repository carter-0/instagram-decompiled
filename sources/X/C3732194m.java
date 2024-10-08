package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.94m  reason: invalid class name and case insensitive filesystem */
public final class C3732194m implements AnonymousClass94T {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C3732294n.A00);
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final void CN8() {
        this.A04.getValue();
        0KC.A02(C3732194m.class, "prediction disabled");
        cleanup();
    }

    public final void cleanup() {
        AnonymousClass0eM r3 = this.A07;
        for (String A032 : ((C2604745u) r3.getValue()).A02()) {
            ((C2604745u) r3.getValue()).A03(A032);
        }
    }

    public C3732194m(UserSession userSession) {
        this.A04 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 4));
        this.A07 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 7));
        this.A06 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 6));
        this.A05 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 5));
        this.A03 = AnonymousClass0eN.A01(new C377419Lt(39, userSession, this));
        this.A02 = AnonymousClass0eN.A01(new C377419Lt(38, userSession, this));
        this.A01 = AnonymousClass0eN.A01(new C377419Lt(37, userSession, this));
    }
}
