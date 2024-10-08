package X;

import com.instagram.common.session.UserSession;

public final class P3M implements C51902G6w {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public P3M(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void DBE(int i) {
        C254793t3 r0;
        int i2 = this.A00;
        UserSession userSession = (UserSession) this.A03;
        if (i2 != 0) {
            r0 = (C254793t3) this.A02;
        } else {
            r0 = ((N4P) this.A02).A0L;
        }
        C66671Mae.A02((AnonymousClass0iw) this.A01, userSession, C66580MXl.A0x(r0), i);
    }

    public final void onCancel() {
    }
}
