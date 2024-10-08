package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.On8  reason: case insensitive filesystem */
public final class C71571On8 implements AnonymousClass2Kv {
    public final /* synthetic */ C74408PuO A00;
    public final /* synthetic */ C70745OJr A01;

    public C71571On8(C74408PuO puO, C70745OJr oJr) {
        this.A01 = oJr;
        this.A00 = puO;
    }

    public final void invoke(AnonymousClass3JD r9) {
        C250663lr A0U;
        C250663lr A03;
        C250663lr A012;
        if (r9 != null && (A0U = C41845B3m.A0U(r9)) != null && (A03 = A0U.A03(C7774QWl.class, C273654mx.A00(910), -1121181168)) != null && (A012 = A03.A01(C7777QWo.class, -223507593)) != null) {
            C70745OJr oJr = this.A01;
            C74408PuO puO = this.A00;
            AnonymousClass6EV r0 = AnonymousClass6EU.A05;
            UserSession userSession = oJr.A00;
            C71619Onz A013 = r0.A00(userSession).A01();
            if (A013 != null) {
                1a8 A0P = C66581MXm.A0P();
                C70984OUy oUy = new C70984OUy(A013);
                boolean A06 = 182.A06(0Tu.A05, userSession, 36327537764219383L);
                1aU A002 = C70984OUy.A00(oUy);
                int i = 37;
                if (A06) {
                    i = 36;
                }
                A0P.A02(A002.A0M(new C72012Oum(new C74185PqR(i, (Object) A012, (Object) oUy))), new PU9(15, puO, A0P));
            }
            puO.onSuccess();
        }
    }
}
