package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TtU  reason: case insensitive filesystem */
public final class C14296TtU implements AnonymousClass3PN {
    public final /* synthetic */ C250973mM A00;
    public final /* synthetic */ C316006kx A01;
    public final /* synthetic */ C311266cP A02;

    public C14296TtU(C250973mM r1, C316006kx r2, C311266cP r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DOJ(String str) {
        C311266cP r5 = this.A02;
        r5.A0A.remove(this);
        C316006kx r4 = this.A01;
        C250973mM r0 = r4.A09;
        C250973mM r3 = this.A00;
        if (r0 == r3) {
            UserSession userSession = r5.A02;
            AnonymousClass6VB.A00(userSession).A06(r3.A08(userSession));
            r5.A08.ADe(r3.A08(userSession), r3, r4);
        }
    }

    public final void DOW(String str, boolean z) {
        C311266cP r5 = this.A02;
        r5.A0A.remove(this);
        C250973mM r4 = this.A00;
        UserSession userSession = r5.A02;
        r4.A0B(userSession);
        C316006kx r3 = this.A01;
        if (r3.A09 != r4) {
            return;
        }
        if (!r4.A0E(userSession)) {
            r5.A05.A02(r4.A0H, r4.A09(userSession), z);
            AnonymousClass6VB.A00(userSession).A07(r4.A08(userSession));
            r5.A08.ADe(r4.A09(userSession), r4, r3);
            return;
        }
        AnonymousClass6VB.A00(userSession).A06(r4.A08(userSession));
        r5.A08.ADe(r4.A08(userSession), r4, r3);
        if (str != null && !str.equals(r5.A00)) {
            r5.A00 = str;
            LS4.A02(userSession, str, "reel_empty", r5.A04.A00);
        }
    }
}
