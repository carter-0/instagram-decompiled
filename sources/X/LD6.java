package X;

import com.instagram.common.session.UserSession;

public final class LD6 {
    public boolean A00;
    public final 02m A01;
    public final UserSession A02;

    public final void A00(C62798Kma kma) {
        02m r2;
        int i;
        short s;
        if (this.A00) {
            if (kma instanceof KQC) {
                r2 = this.A01;
                i = 1064965959;
                s = 3;
            } else if (kma instanceof NTG) {
                r2 = this.A01;
                i = 1064965959;
                s = 4;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            r2.markerEnd(i, s);
            this.A00 = false;
        }
    }

    public LD6(02m r1, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A02 = userSession;
        this.A01 = r1;
    }
}
