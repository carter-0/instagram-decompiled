package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6Kj  reason: invalid class name and case insensitive filesystem */
public final class C305996Kj implements C228232l0 {
    public final C296155pZ A00;
    public final C296195pd A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.A01.AUX(str));
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        C230472pg r1;
        C255773uh r6 = (C255773uh) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(r4, 3);
        if (r5 == C233162v9.XOUT) {
            C296155pZ r2 = this.A00;
            1Xj r0 = r6.A0b;
            if (r0 == null || !r0.CcK()) {
                r1 = C230472pg.ORGANIC;
            } else {
                r1 = C230472pg.SPONSORED;
            }
            String str = r4.A03;
            if (str == null) {
                str = "n/a";
            }
            r2.A00(r1, r6, obj2, str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in XoutRealtimeSignalProviderImpl for Stories: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    public C305996Kj(C296195pd r1, C296155pZ r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
