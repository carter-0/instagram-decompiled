package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class QQ2 extends 14r {
    public static final AtomicBoolean A00 = JTQ.A0k();

    public final void A04() {
        Object obj;
        C13770Tgi tgi = C10122Rmy.A00;
        if (tgi != C12065SmI.A00) {
            if (AnonymousClass0Hh.A00) {
                obj = C10122Rmy.A02[5];
            } else {
                obj = C10122Rmy.A03[5];
            }
            if (obj != null && C10122Rmy.A01.getAndSet(false)) {
                tgi.notAsBadTimeToDoGc();
            }
        }
    }

    public final boolean A05() {
        Object obj;
        C13419Ta0 ta0;
        C13770Tgi tgi = C10122Rmy.A00;
        if (tgi == C12065SmI.A00) {
            return true;
        }
        boolean z = AnonymousClass0Hh.A00;
        if (z) {
            obj = C10122Rmy.A02[5];
        } else {
            obj = C10122Rmy.A03[5];
        }
        if (obj == null || C10122Rmy.A01.getAndSet(true)) {
            return true;
        }
        if (z) {
            ta0 = C10122Rmy.A02[5];
        } else {
            ta0 = C10122Rmy.A03[5];
        }
        if (ta0 == null) {
            return true;
        }
        ta0.toString();
        tgi.badTimeToDoGc(ta0);
        return true;
    }

    public final int Ah6() {
        return 3;
    }
}
