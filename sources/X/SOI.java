package X;

import android.util.Log;
import java.util.Map;

public final class SOI {
    public static final boolean A07 = Log.isLoggable("Engine", 2);
    public final S2H A00;
    public final C10526Rtf A01;
    public final C10789RyB A02;
    public final S10 A03;
    public final C10363Rr0 A04;
    public final C10364Rr1 A05;
    public final QHU A06;

    public SOI(C10171Rnm rnm, QHU qhu, TO7 to7, TO7 to72, TO7 to73, TO7 to74) {
        this.A06 = qhu;
        S10 s10 = new S10(rnm);
        this.A03 = s10;
        S2H s2h = new S2H();
        this.A00 = s2h;
        synchronized (this) {
            synchronized (s2h) {
                s2h.A00 = this;
            }
        }
        this.A04 = new C10363Rr0();
        this.A02 = new C10789RyB(this, this, to7, to72, to73, to74);
        this.A01 = new C10526Rtf(s10);
        this.A05 = new C10364Rr1();
        qhu.A00 = this;
    }

    public final synchronized void A01(C13892TjF tjF, C12005SkO skO, C11909Sii sii) {
        Map map;
        if (sii != null) {
            if (sii.A03) {
                this.A00.A00(tjF, sii);
            }
        }
        C10363Rr0 rr0 = this.A04;
        if (skO.A0A) {
            map = rr0.A01;
        } else {
            map = rr0.A00;
        }
        if (skO.equals(map.get(tjF))) {
            map.remove(tjF);
        }
    }

    public static final void A00(C13796ThF thF) {
        if (thF instanceof C11909Sii) {
            ((C11909Sii) thF).A00();
            return;
        }
        throw AnonymousClass7TE.A0w("Cannot release anything but an EngineResource");
    }
}
