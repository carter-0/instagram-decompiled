package X;

import java.util.ArrayList;

/* renamed from: X.Q3j  reason: case insensitive filesystem */
public abstract class C7307Q3j {
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.Q3k] */
    public static C7308Q3k A00(C276424tJ r6) {
        ? obj = new Object();
        if (r6.E2K() != AnonymousClass05K.A0C) {
            r6.Evn();
            return null;
        }
        while (r6.Crg() != AnonymousClass05K.A0N) {
            String E2H = r6.E2H();
            boolean z = false;
            if (C276474tO.A00(E2H) >= 32) {
                z = true;
            }
            r6.Crg();
            if (!z && "components".equals(E2H)) {
                ArrayList arrayList = null;
                if (r6.E2K() == AnonymousClass05K.A00) {
                    arrayList = new ArrayList();
                    while (r6.Crg() != AnonymousClass05K.A01) {
                        AnonymousClass9G2 A00 = AnonymousClass9G1.A00((C276484tP) null, r6, (String) null);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                }
                obj.A00 = arrayList;
            }
            r6.Evn();
        }
        return obj;
    }
}
