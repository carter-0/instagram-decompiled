package X;

import java.util.Map;

/* renamed from: X.IYg  reason: case insensitive filesystem */
public final class C57349IYg implements C228232l0 {
    public final C296085pS A00;
    public final C296115pV A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        return this.A01.AUQ(str);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        1Xj r6 = (1Xj) obj;
        C51974G9v.A1O(r5, r6, obj2, r4);
        if (r5 == C233162v9.IAB_NO_BOUNCE) {
            C376459Ib r2 = r4.A00;
            if (r2 != null) {
                this.A00.A00(r2, C51972G9s.A0e(r6), r6, obj2);
                return;
            }
            return;
        }
        throw C51973G9u.A0g(r5, C273654mx.A00(1420), AnonymousClass7TE.A1A());
    }

    public C57349IYg(C296115pV r1, C296085pS r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
