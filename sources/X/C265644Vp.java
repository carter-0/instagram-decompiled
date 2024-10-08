package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.4Vp  reason: invalid class name and case insensitive filesystem */
public final class C265644Vp implements Runnable {
    public final /* synthetic */ C228612lx A00;
    public final /* synthetic */ C233992wo A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C265644Vp(C228612lx r1, C233992wo r2, List list, List list2) {
        this.A01 = r2;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = r1;
    }

    public final void run() {
        C233992wo r5 = this.A01;
        List<1Xg> CsY = r5.CsY(this.A03);
        if (CsY.isEmpty()) {
            List list = this.A02;
            if (!list.isEmpty()) {
                CsY = r5.CsY(list);
            }
        }
        C228612lx r4 = this.A00;
        synchronized (r4.A02) {
            for (1Xg r1 : CsY) {
                Map map = r4.A04;
                String str = r1.A09;
                map.remove(str);
                r4.A03.remove(str);
            }
        }
        r5.DFr(!CsY.isEmpty());
    }
}
