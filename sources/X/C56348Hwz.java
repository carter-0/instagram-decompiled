package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hwz  reason: case insensitive filesystem */
public abstract class C56348Hwz {
    public static final N4N A00(N4N n4n) {
        0qQ.A0B(n4n, 0);
        List list = n4n.A0H;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!(next instanceof N3A) || ((N3A) next).A04 != AnonymousClass05K.A0C) {
                A1C.add(next);
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : A1C) {
            DbV.A1U(next2, A1C2, next2 instanceof N62 ? 1 : 0);
        }
        C61041Jvf jvf = n4n.A06;
        String str = jvf.A02;
        String str2 = jvf.A03;
        boolean z = jvf.A06;
        AnonymousClass7TF.A1B(str, 1, str2);
        return N4N.A00((C15051ULh) null, new C61041Jvf((N62) null, str, str2, false, z, true), (N3M) null, (1Xj) null, (OEW) null, (C69628NpA) null, n4n, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, A1C2, (Map) null, (Map) null, 0, 0, 16777214, false, false, false, false, false, false);
    }

    public static final N4N A01(N4N n4n, boolean z) {
        return N4N.A00((C15051ULh) null, (C61041Jvf) null, (N3M) null, (1Xj) null, (OEW) null, (C69628NpA) null, n4n, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Map) null, (Map) null, 0, 0, 18874367, false, false, false, false, true, z);
    }
}
