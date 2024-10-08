package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.3sO  reason: invalid class name and case insensitive filesystem */
public final class C254383sO {
    public static final C254383sO A00 = new Object();

    public final void A01(AnonymousClass9IV r8, AnonymousClass3DW r9) {
        0qQ.A0B(r9, 2);
        AnonymousClass9J4 r0 = (AnonymousClass9J4) r8.A01;
        C376459Ib r6 = new C376459Ib((C230472pg) r0.A01, (C233162v9) r0.A04, (C230432pc) r0.A05);
        HashMap hashMap = r9.A01;
        Set keySet = hashMap.keySet();
        0qQ.A07(keySet);
        if (keySet.contains(r6)) {
            List singletonList = Collections.singletonList(r8);
            0qQ.A07(singletonList);
            List<C233022up> list = (List) hashMap.get(r6);
            if (list != null) {
                for (C233022up r3 : list) {
                    r3.CJE(r6, singletonList);
                    AnonymousClass9IV r2 = (AnonymousClass9IV) 00k.A0J(singletonList);
                    if (r2 != null) {
                        ((1L5) r9.A02.getValue()).EGV(r2, r3.B4s());
                    }
                }
            }
        }
    }

    public static final boolean A00(AnonymousClass9IV r1) {
        C233162v9 r12 = (C233162v9) ((AnonymousClass9J4) r1.A01).A04;
        if (r12 == C233162v9.SEEN_STATE || C254393sP.A01(r12)) {
            return false;
        }
        return true;
    }
}
