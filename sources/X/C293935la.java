package X;

import java.util.Map;

/* renamed from: X.5la  reason: invalid class name and case insensitive filesystem */
public final class C293935la implements C228232l0 {
    public final C296085pS A00;
    public final C296115pV A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        return this.A01.AUQ(str);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        C230472pg r0;
        1Xj r6 = (1Xj) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(r4, 3);
        if (r5 == C233162v9.IAB_NO_BOUNCE) {
            C376459Ib r2 = r4.A00;
            if (r2 != null) {
                C296085pS r1 = this.A00;
                if (r6.CcK()) {
                    r0 = C230472pg.SPONSORED;
                } else {
                    r0 = C230472pg.ORGANIC;
                }
                r1.A00(r2, r0, r6, obj2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in IABNoBounceSignalRealtimeSignalProviderImpl: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    public C293935la(C296115pV r1, C296085pS r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
