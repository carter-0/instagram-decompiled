package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.IYe  reason: case insensitive filesystem */
public final class C57347IYe implements C228232l0 {
    public final C55971Hqc A00;
    public final C59644JRm A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        IYT iyt = (IYT) this.A01;
        1Kv r2 = iyt.A01;
        List ELB = r2.ELB(iyt.A02);
        r2.EEd(ELB);
        return iyt.A00.A00(str, ELB);
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        1Xj r6 = (1Xj) obj;
        C51974G9v.A1O(r5, r6, obj2, r4);
        if (r5 == C233162v9.AFI) {
            C53251Gkz gkz = r4.A01;
            if (gkz != null) {
                this.A00.A00(gkz, C51972G9s.A0e(r6), r6, obj2);
                return;
            }
            return;
        }
        throw C51973G9u.A0g(r5, "Wrong signal type in AFIRealtimeSignalProviderImpl: ", AnonymousClass7TE.A1A());
    }

    public C57347IYe(C59644JRm jRm, C55971Hqc hqc) {
        this.A00 = hqc;
        this.A01 = jRm;
    }
}
