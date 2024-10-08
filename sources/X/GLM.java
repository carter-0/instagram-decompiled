package X;

import java.util.Map;

public final class GLM implements C228232l0 {
    public final C298145sx A00;
    public final C298175t0 A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        return this.A01.AUQ(str);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        C267324bN r6 = (C267324bN) obj;
        C51974G9v.A1O(r5, r6, obj2, r4);
        if (r5 == C233162v9.AD_CLICK) {
            C376459Ib r2 = r4.A00;
            if (r2 != null) {
                this.A00.A00(r2, C51974G9v.A0R(r6), r6, obj2);
                return;
            }
            return;
        }
        throw C51973G9u.A0g(r5, C273654mx.A00(1419), AnonymousClass7TE.A1A());
    }

    public GLM(C298175t0 r1, C298145sx r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
