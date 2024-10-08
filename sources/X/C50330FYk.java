package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYk  reason: case insensitive filesystem */
public final class C50330FYk implements AnonymousClass0lh {
    public 1OC A00;
    public 1OC A01;
    public E3B A02;
    public Boolean A03;
    public String A04 = "";
    public String A05 = "";
    public final C47697EDg A06 = C47697EDg.A00(this, 43);
    public final C47697EDg A07 = C47697EDg.A00(this, 44);
    public final UserSession A08;
    public final C49857F9x A09;
    public final AnonymousClass4kA A0A;
    public final AnonymousClass0iw A0B;

    public final void A00() {
        synchronized (this) {
            1NY A0b = AnonymousClass7TG.A0b(this.A08);
            A0b.A0A("direct_v2/welcome_message/get/");
            1OC A0S = DbU.A0S(A0b, CED.class, C45575Cyn.class);
            this.A01 = A0S;
            A0S.A00 = this.A07;
            1ES.A03(A0S);
        }
    }

    public final void onSessionWillEnd() {
        this.A08.A03(C50330FYk.class);
    }

    public C50330FYk(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A08 = userSession;
        this.A0B = r2;
        this.A0A = AnonymousClass4k9.A00(userSession);
        this.A09 = new C49857F9x(r2, userSession);
    }
}
