package X;

import com.instagram.android.R;
import java.util.AbstractMap;
import java.util.ArrayList;

/* renamed from: X.RSd  reason: case insensitive filesystem */
public abstract class C9177RSd {
    public static final ArrayList A00(C307896Rx r5, AnonymousClass6Tm r6) {
        String A00 = Q3L.A00(r6);
        C307786Rm r3 = r5.A03;
        if (r3 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (C245983dn.A03()) {
            ArrayList arrayList = (ArrayList) ((AbstractMap) r3.A00(R.id.bk_context_key_states)).get(A00);
            if (arrayList == null) {
                C307446Qd A02 = C307476Qg.A02(r3);
                C12780T6p t6p = new C12780T6p(A00);
                A02.A06().A0S(t6p);
                C277014uI r1 = t6p.A00;
                if (r1 == null || (arrayList = (ArrayList) C299275ur.A00(r5, AnonymousClass6Tm.A01, r1)) == null) {
                    throw DbW.A0c("No state initializer available for id: ", A00);
                } else if (C245983dn.A03()) {
                    ((AbstractMap) r3.A00(R.id.bk_context_key_states)).put(A00, arrayList);
                } else {
                    throw AnonymousClass7TE.A15("Accessing state is only supported from the UI Thread");
                }
            }
            return arrayList;
        } else {
            throw AnonymousClass7TE.A15("Accessing state is only supported from the UI Thread");
        }
    }
}
