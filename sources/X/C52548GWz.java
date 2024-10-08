package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GWz  reason: case insensitive filesystem */
public final class C52548GWz implements C3252171m {
    public final /* synthetic */ AnonymousClass32L A00;

    public C52548GWz(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final int Bju() {
        AnonymousClass32L r3 = this.A00;
        UserSession A03 = r3.getSession();
        0qQ.A0B(A03, 0);
        GX0 gx0 = (GX0) A03.A01(GX0.class, new C20695WxR(A03, 4));
        C46329Dbx dbx = r3.A00;
        if (dbx == null) {
            0qQ.A0F("navigationPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        return gx0.A00.BNY(!dbx.A01);
    }
}
