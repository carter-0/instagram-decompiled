package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GJv  reason: case insensitive filesystem */
public final class C52230GJv extends C270664h6 {
    public final UserSession A00;
    public final AnonymousClass2mA A01;

    public final void D3r(H3D h3d) {
        AnonymousClass2mA r0;
        0qQ.A0B(h3d, 0);
        if (!h3d.A02 && (r0 = this.A01) != null) {
            r0.A00();
        }
    }

    public final void D3t(C52228GJt gJt) {
        AnonymousClass2mA r0;
        0qQ.A0B(gJt, 0);
        if (!gJt.A02 && (r0 = this.A01) != null) {
            r0.A01();
        }
    }

    public final void D3u(C52263GLe gLe) {
        AnonymousClass2mA r0;
        0qQ.A0B(gLe, 0);
        boolean A03 = 1KU.A03(this.A00);
        if (gLe.A0D) {
            return;
        }
        if ((!A03 || gLe.A0C) && (r0 = this.A01) != null) {
            r0.A02();
        }
    }

    public C52230GJv(UserSession userSession, AnonymousClass2mA r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
