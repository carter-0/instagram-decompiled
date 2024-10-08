package X;

import java.util.Map;

/* renamed from: X.GWt  reason: case insensitive filesystem */
public final class C52542GWt implements C228232l0 {
    public final C296085pS A00;
    public final C296115pV A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        return this.A01.AUQ(str);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        C230472pg r0;
        1Xj r02;
        C296935qt r6 = (C296935qt) obj;
        C51974G9v.A1O(r5, r6, obj2, r4);
        if (r5 == C233162v9.IAB_NO_BOUNCE) {
            C376459Ib r2 = r4.A00;
            if (r2 != null) {
                C296085pS r1 = this.A00;
                C295795ov r03 = r6.A03;
                if (r03 == null || (r02 = r03.A0A) == null || r02.CcK()) {
                    r0 = C230472pg.SPONSORED;
                } else {
                    r0 = C230472pg.ORGANIC;
                }
                r1.A00(r2, r0, r6, obj2);
                return;
            }
            return;
        }
        throw C51973G9u.A0g(r5, C273654mx.A00(225), AnonymousClass7TE.A1A());
    }

    public C52542GWt(C296115pV r1, C296085pS r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
