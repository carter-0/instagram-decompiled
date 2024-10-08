package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.GXc  reason: case insensitive filesystem */
public final class C52551GXc implements AnonymousClass0lh {
    public final Map A00;
    public final ConcurrentMap A01;
    public final ConcurrentMap A02;

    public final void A00() {
        this.A02.clear();
        this.A01.clear();
        Map map = this.A00;
        synchronized (map) {
            map.clear();
        }
    }

    public final void A01(String str, String str2, String str3, List list) {
        if (str2 != null) {
            this.A02.put(str, str2);
        }
        if (str3 != null) {
            this.A01.put(str, str3);
        }
        if (list != null && !list.isEmpty()) {
            Map map = this.A00;
            synchronized (map) {
                if (map.containsKey(str)) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    0sn r0 = (List) map.get(str);
                    if (r0 == null) {
                        r0 = 0sn.A00;
                    }
                    A1C.addAll(r0);
                    A1C.addAll(list);
                    map.put(str, A1C);
                } else {
                    map.put(str, list);
                }
            }
        }
    }

    public C52551GXc() {
        17j r0 = new 17j();
        r0.A03(64);
        this.A02 = r0.A00();
        17j r02 = new 17j();
        r02.A03(64);
        this.A01 = r02.A00();
        17j r03 = new 17j();
        r03.A03(64);
        this.A00 = r03.A00();
    }

    public final void onSessionWillEnd() {
        A00();
    }
}
