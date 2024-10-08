package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6vU  reason: invalid class name and case insensitive filesystem */
public final class C322246vU implements Runnable {
    public final /* synthetic */ C322236vT A00;

    public C322246vU(C322236vT r1) {
        this.A00 = r1;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        C322236vT r6 = this.A00;
        Map map = r6.A05;
        for (C319776rC r8 : map.values()) {
            C322216vR r2 = r6.A03;
            C322226vS r1 = r2.A09;
            r1.A01 = r2.A04.B6L();
            int BLQ = r2.A04.BLQ();
            r1.A00 = BLQ;
            C322226vS r22 = r8.A02;
            if (Math.max(r1.A01, r22.A01) <= Math.min(BLQ, r22.A00)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object add : r8.A03.values()) {
                    arrayList2.add(add);
                }
                Map map2 = C14021ToN.A00().A00;
                if (map2.get(18284548) != null) {
                    02m.A0p.markerPoint(18284548, "GRID_MEDIA_LOADED");
                    02m.A0p.markerEnd(18284548, 2);
                    map2.remove(18284548);
                }
                arrayList.add(18284548);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
    }
}
