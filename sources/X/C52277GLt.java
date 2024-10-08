package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GLt  reason: case insensitive filesystem */
public final class C52277GLt extends C270664h6 {
    public boolean A00;
    public final C320446sO A01;
    public final UserSession A02;

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        Integer num = gJt.A00;
        Integer num2 = AnonymousClass05K.A01;
        this.A00 = AnonymousClass7TF.A1W(num, num2);
        C320446sO r1 = this.A01;
        C320446sO.A01(r1, AnonymousClass05K.A00);
        if (this.A00) {
            C320446sO.A02(r1, num2);
        }
    }

    public final void D3u(C52263GLe gLe) {
        Integer num;
        0qQ.A0B(gLe, 0);
        if (!1KU.A03(this.A02) || gLe.A0C) {
            boolean z = this.A00;
            C320446sO r1 = this.A01;
            if (z) {
                C320446sO.A01(r1, AnonymousClass05K.A01);
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0C;
            }
            C320446sO.A00(r1, num);
        }
    }

    public final void D3r(H3D h3d) {
        C320446sO r3 = this.A01;
        if (r3.A00) {
            r3.A01.markerEnd(749812461, 3);
            r3.A00 = false;
        }
    }

    public final void D3s() {
        if (!this.A00) {
            C320446sO.A00(this.A01, AnonymousClass05K.A0C);
        }
    }

    public C52277GLt(C320446sO r1, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r1;
    }
}
