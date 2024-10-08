package X;

import java.util.Map;

/* renamed from: X.2oi  reason: invalid class name and case insensitive filesystem */
public final class C229972oi {
    public final /* synthetic */ C228062kj A00;

    public C229972oi(C228062kj r1) {
        this.A00 = r1;
    }

    public final void A00(String str, int i) {
        C228392lb r0 = this.A00.A0M;
        if (r0 == null) {
            0qQ.A0F("_mainFeedStateStore");
            throw AnonymousClass00P.createAndThrow();
        }
        Map map = r0.A0G;
        C266934aa r1 = (C266934aa) map.get(str);
        if (r1 != null) {
            r1.A03 = i;
            map.put(str, r1);
            r1.A07 = false;
        }
    }
}
