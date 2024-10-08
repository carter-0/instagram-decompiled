package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Lcr  reason: case insensitive filesystem */
public final class C64490Lcr implements C66500MUe {
    public final /* synthetic */ K5D A00;

    public final void Cv3(C62947Koz koz) {
        C60287Jij jij;
        C60438JlW jlW;
        K5D k5d = this.A00;
        AnonymousClass86D r4 = k5d.A09;
        if (r4 != null && (jij = k5d.A08) != null && (jlW = k5d.A07) != null) {
            Map map = jij.A08;
            Integer valueOf = Integer.valueOf(koz.A00);
            if (map.containsKey(valueOf)) {
                JTP.A1R(valueOf, map, true);
                if (!map.containsValue(false)) {
                    jij.A03.A00();
                    AnonymousClass86B r1 = jij.A05.A0C;
                    if (!r1.A02.getAndSet(true)) {
                        AtomicLong atomicLong = r1.A03;
                        atomicLong.set(r1.A01.A02(17638221, atomicLong.get()));
                    }
                }
            }
            int i = k5d.A00;
            int i2 = k5d.A01;
            if (i >= 0) {
                List list = jlW.A06;
                if (i < list.size() && i2 >= 0 && i2 < list.size()) {
                    while (i <= i2 && i < list.size()) {
                        if (koz == ((LQR) list.get(i)).A00) {
                            r4.A0C(jij.A07, AnonymousClass7TE.A1I(koz));
                            return;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public C64490Lcr(K5D k5d) {
        this.A00 = k5d;
    }

    public final void DBY(C62947Koz koz, boolean z) {
        AnonymousClass86D r1 = this.A00.A09;
        if (r1 != null) {
            String str = koz.A05;
            0qQ.A07(str);
            r1.A08(str);
        }
    }

    public final void DUO() {
        AnonymousClass86D r0 = this.A00.A09;
        if (r0 != null) {
            r0.A04.A01(AnonymousClass84B.MINI_GALLERY);
        }
    }
}
