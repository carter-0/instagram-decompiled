package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.VjV  reason: case insensitive filesystem */
public final class C17993VjV {
    public WFX A00;
    public final W18 A01 = new W18();
    public final List A02 = new LinkedList();
    public final double[] A03 = new double[2];
    public final int A04;

    public final void A00(W2R w2r, AnonymousClass2R4 r27, Collection collection, Map map) {
        Collection collection2;
        float f = (float) this.A04;
        C14723U4m u4m = w2r.A00.A0I;
        double d = (double) (f / (((float) u4m.A0K) * u4m.A0C));
        WFX wfx = this.A00;
        if (wfx != null) {
            wfx.A09.A00(19150949);
        }
        List list = this.A02;
        list.clear();
        W18 w18 = this.A01;
        W18.A00(w18.A00, w18, r27, list);
        double d2 = d * d;
        while (true) {
            collection2 = collection;
            if (list.isEmpty()) {
                break;
            }
            Iterator it = list.iterator();
            C19876Wh5 wh5 = (C19876Wh5) it.next();
            it.remove();
            double[] dArr = this.A03;
            wh5.AmS(dArr);
            double d3 = dArr[0];
            double d4 = dArr[1];
            Map map2 = map;
            String A11 = DbT.A11(wh5.A04, map2);
            C19879Wh8 wh8 = new C19879Wh8();
            wh8.A05(wh5);
            while (it.hasNext()) {
                C19876Wh5 wh52 = (C19876Wh5) it.next();
                Object obj = map2.get(wh52.A04);
                wh52.AmS(dArr);
                double d5 = d3 - dArr[0];
                double d6 = d4 - dArr[1];
                if ((d5 * d5) + (d6 * d6) < d2) {
                    if (A11 == null) {
                        if (obj != null) {
                        }
                    } else if (!A11.equals(obj)) {
                    }
                    wh8.A05(wh52);
                    it.remove();
                }
            }
            collection2.add(wh8);
        }
        if (wfx != null) {
            int size = list.size();
            int size2 = collection2.size();
            C17873VhQ vhQ = wfx.A09;
            QuickPerformanceLogger quickPerformanceLogger = vhQ.A03;
            quickPerformanceLogger.markerAnnotate(19150949, "beforeCount", size);
            quickPerformanceLogger.markerAnnotate(19150949, "afterCount", size2);
            quickPerformanceLogger.markerEnd(19150949, vhQ.A02, 2);
        }
    }

    public final void A01(Collection collection) {
        W18 w18 = this.A01;
        C17651Vbh vbh = w18.A00;
        vbh.A07.clear();
        vbh.A04 = true;
        vbh.A01 = null;
        vbh.A00 = null;
        vbh.A03 = null;
        vbh.A02 = null;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W18.A01(new C19876Wh5((C20944X5n) it.next()), vbh, w18);
        }
    }

    public C17993VjV(WFX wfx, Collection collection, int i) {
        this.A04 = i;
        this.A00 = wfx;
        A01(collection);
    }
}
