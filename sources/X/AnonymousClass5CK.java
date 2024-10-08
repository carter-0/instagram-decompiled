package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5CK  reason: invalid class name */
public final class AnonymousClass5CK implements C228232l0 {
    public final AnonymousClass5CA A00;
    public final AnonymousClass5CE A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.A01.AUJ(str));
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r4, C233162v9 r5, Object obj, Object obj2) {
        C230472pg r1;
        1Xj r6 = (1Xj) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(r4, 3);
        if (r5 == C233162v9.PROFILE_TAP) {
            AnonymousClass5CA r2 = this.A00;
            if (r6.CcK()) {
                r1 = C230472pg.SPONSORED;
            } else {
                r1 = C230472pg.ORGANIC;
            }
            String str = r4.A02;
            if (str == null) {
                str = "";
            }
            r2.A00(r1, r6, obj2, str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in ProfileTapRealtimeSignalProviderImpl: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    public AnonymousClass5CK(AnonymousClass5CE r1, AnonymousClass5CA r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
