package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5lX  reason: invalid class name and case insensitive filesystem */
public final class C293905lX implements C228232l0 {
    public final C296295pp A00;
    public final C296325ps A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.A01.ATx(C233162v9.TAG_CLICK, str));
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C230472pg r0;
        1Xj r5 = (1Xj) obj;
        AnonymousClass3W1 r6 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        if (r4 == C233162v9.TAG_CLICK) {
            AnonymousClass3KX r02 = AnonymousClass3KW.A00;
            if (AnonymousClass3KX.A00(r6)) {
                C296295pp r1 = this.A00;
                if (r5.CcK()) {
                    r0 = C230472pg.SPONSORED;
                } else {
                    r0 = C230472pg.ORGANIC;
                }
                r1.A00(r0, r4, r5, r6);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in GeneralRealtimeSignalProviderImpl: ");
        sb.append(r4);
        throw new IllegalArgumentException(sb.toString());
    }

    public C293905lX(C296325ps r1, C296295pp r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
