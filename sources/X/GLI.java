package X;

import java.util.LinkedHashMap;
import java.util.Map;

public final class GLI implements C228232l0 {
    public final AnonymousClass5CA A00;
    public final AnonymousClass5CE A01;

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        C230472pg r1;
        C267324bN r6 = (C267324bN) obj;
        C51974G9v.A1O(r5, r6, obj2, r4);
        if (r5 == C233162v9.PROFILE_TAP) {
            AnonymousClass5CA r2 = this.A00;
            1Xj r0 = r6.A02;
            if (r0 == null || !r0.CcK()) {
                r1 = C230472pg.ORGANIC;
            } else {
                r1 = C230472pg.SPONSORED;
            }
            String str = r4.A02;
            if (str == null) {
                str = "";
            }
            r2.A00(r1, r6, obj2, str);
            return;
        }
        throw C51973G9u.A0g(r5, "Wrong signal type in ProfileTapRealtimeSignalProviderImpl for Clips: ", AnonymousClass7TE.A1A());
    }

    public GLI(AnonymousClass5CE r1, AnonymousClass5CA r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final Map AUH(String str) {
        LinkedHashMap A0t = C51972G9s.A0t(str);
        A0t.putAll(this.A01.AUJ(str));
        return A0t;
    }
}
