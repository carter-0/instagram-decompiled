package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7xV  reason: invalid class name and case insensitive filesystem */
public final class C347867xV extends 0ng {
    public final /* synthetic */ 0rJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C347867xV(0rJ r4) {
        super(408, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        ArrayList arrayList;
        0rJ r6 = this.A00;
        Map map = r6.A04;
        0qQ.A07(map);
        synchronized (map) {
            arrayList = new ArrayList(map.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            0px r4 = (0px) it.next();
            if (r4.A02() > 0) {
                if (182.A06(0Tu.A05, r6.A01, 36327958671080273L)) {
                    r4.A0K();
                }
            }
        }
    }
}
