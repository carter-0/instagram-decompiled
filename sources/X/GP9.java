package X;

import java.util.Map;

public final class GP9 implements C228232l0 {
    public final C282105Br A00;
    public final C282155Bw A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        return this.A01.AUQ(str);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C267324bN r5 = (C267324bN) obj;
        AnonymousClass7TG.A1T(r4, r5, obj2);
        if (r4 == C233162v9.CTA_CLICK) {
            this.A00.A00(C51974G9v.A0R(r5), r5, obj2);
            return;
        }
        throw C51973G9u.A0g(r4, "Wrong signal type in CtaClickRealtimeSignalProviderImpl for Clips: ", AnonymousClass7TE.A1A());
    }

    public GP9(C282155Bw r1, C282105Br r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
