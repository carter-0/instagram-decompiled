package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CHa  reason: case insensitive filesystem */
public final class C43886CHa extends C66675Mai {
    public final /* synthetic */ C74551Pwk A00;

    public final void A00(AnonymousClass3JD r5, UserSession userSession) {
        Boolean bool;
        C250663lr A0U;
        if (r5 == null || (A0U = C41845B3m.A0U(r5)) == null) {
            bool = null;
        } else {
            bool = C41846B3n.A0d(A0U, "xig_direct_store_sticker_send(data:$data)", 0);
        }
        boolean A1Y = AnonymousClass7TF.A1Y(bool, true);
        C74551Pwk pwk = this.A00;
        if (A1Y) {
            pwk.DTM((C270214gN) null, (String) null);
        } else {
            pwk.DTM(C270214gN.A0T, (String) null);
        }
    }

    public final void A01(UserSession userSession, Throwable th) {
        0qQ.A0B(th, 1);
        this.A00.DTM(C71115Od8.A03(th), (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43886CHa(UserSession userSession, C74551Pwk pwk) {
        super(userSession);
        this.A00 = pwk;
    }
}
