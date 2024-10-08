package X;

import java.util.List;

/* renamed from: X.QxU  reason: case insensitive filesystem */
public final class C8592QxU extends SRF {
    public /* synthetic */ C8592QxU(RPM rpm) {
    }

    public C8592QxU() {
    }

    public final void A02(Object obj, long j) {
        ((C13984Tna) SUg.A06(obj, j)).FPF();
    }

    public final void A03(Object obj, long j, Object obj2) {
        C13984Tna tna = (C13984Tna) SUg.A06(obj, j);
        List list = (List) SUg.A06(obj2, j);
        int size = tna.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!tna.FPP()) {
                    tna = tna.FPW(size2 + size);
                }
                tna.addAll(list);
            }
            list = tna;
        }
        SUg.A0J(obj, j, list);
    }
}
