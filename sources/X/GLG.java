package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class GLG implements C228232l0 {
    public final AnonymousClass5C1 A00;
    public final AnonymousClass5C3 A01;

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C267324bN r5 = (C267324bN) obj;
        AnonymousClass7TG.A1T(r4, r5, obj2);
        if (r4 == C233162v9.LIKE_CLICK) {
            this.A00.A00(C51974G9v.A0R(r5), r5, obj2);
            return;
        }
        throw C51973G9u.A0g(r4, "Wrong signal type in LikeUnlikeRealtimeSignalProviderImpl for Clips: ", AnonymousClass7TE.A1A());
    }

    public GLG(AnonymousClass5C3 r1, AnonymousClass5C1 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final Map AUH(String str) {
        LinkedHashMap A0t = C51972G9s.A0t(str);
        AnonymousClass5C2 r3 = (AnonymousClass5C2) this.A01;
        1Kv r2 = r3.A02;
        List ELB = r2.ELB(r3.A03);
        r2.EEd(ELB);
        A0t.putAll(r3.A00.A00(str, ELB));
        return A0t;
    }
}
