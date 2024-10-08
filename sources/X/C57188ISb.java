package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ISb  reason: case insensitive filesystem */
public final class C57188ISb implements X48 {
    public boolean A00;
    public final UserSession A01;
    public final C52557GXi A02;
    public final 0sP A03;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.9FX, java.lang.Object] */
    public final void D9h(int i) {
        C52557GXi gXi = this.A02;
        if (i <= gXi.A00 && !this.A00) {
            this.A00 = true;
            C55490HiY hiY = new C55490HiY(this);
            AnonymousClass93F r3 = gXi.A04;
            AnonymousClass93C r2 = AnonymousClass93C.A05;
            r3.B5y(new Object(), new GLS(0, gXi, hiY), r2);
        }
    }

    public /* synthetic */ C57188ISb(0sP r2, UserSession userSession) {
        C52557GXi A002 = C52531GWi.A00(userSession);
        AnonymousClass7TG.A1P(userSession, A002);
        this.A01 = userSession;
        this.A03 = r2;
        this.A02 = A002;
    }
}
