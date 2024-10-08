package X;

import java.util.Map;

/* renamed from: X.5By  reason: invalid class name */
public final class AnonymousClass5By implements C228232l0 {
    public final C282105Br A00;
    public final C282155Bw A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        return this.A01.AUQ(str);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C230472pg r0;
        1Xj r5 = (1Xj) obj;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(obj2, 2);
        if (r4 == C233162v9.CTA_CLICK) {
            C282105Br r1 = this.A00;
            if (r5.CcK()) {
                r0 = C230472pg.SPONSORED;
            } else {
                r0 = C230472pg.ORGANIC;
            }
            r1.A00(r0, r5, obj2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in CtaRealtimeSignalProviderImpl: ");
        sb.append(r4);
        throw new IllegalArgumentException(sb.toString());
    }

    public AnonymousClass5By(C282155Bw r1, C282105Br r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
