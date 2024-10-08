package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7T4  reason: invalid class name */
public final class AnonymousClass7T4 {
    public boolean A00;
    public final 02m A01;
    public final UserSession A02;

    public final void A00(HPY hpy) {
        short s;
        02m r2;
        int i;
        if (this.A00) {
            if (hpy instanceof HA6) {
                r2 = this.A01;
                i = 125763585;
                s = 2;
            } else {
                s = 4;
                if ((hpy instanceof HA4) || (hpy instanceof HA5)) {
                    r2 = this.A01;
                    i = 125763585;
                } else {
                    throw new RuntimeException();
                }
            }
            r2.markerEnd(i, s);
            this.A00 = false;
        }
    }

    public AnonymousClass7T4(02m r1, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r1;
    }
}
