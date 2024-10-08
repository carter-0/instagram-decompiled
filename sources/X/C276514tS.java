package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4tS  reason: invalid class name and case insensitive filesystem */
public abstract class C276514tS {
    public static Object A00(C276424tJ r3) {
        String str;
        if (r3.E2K() == AnonymousClass05K.A0C) {
            return A01(r3);
        }
        Integer E2K = r3.E2K();
        Integer num = AnonymousClass05K.A00;
        if (E2K == num) {
            ArrayList arrayList = new ArrayList();
            if (r3.E2K() != num) {
                return arrayList;
            }
            while (r3.Crg() != AnonymousClass05K.A01) {
                arrayList.add(A00(r3));
            }
            return arrayList;
        } else if (r3.E2K() == AnonymousClass05K.A1I) {
            return null;
        } else {
            if (r3.E2K() == AnonymousClass05K.A1F) {
                return Boolean.valueOf(r3.E2L().ADz());
            }
            if (r3.E2K() == AnonymousClass05K.A15) {
                Number CsM = r3.E2L().CsM();
                if (CsM instanceof Long) {
                    return Long.valueOf(CsM.longValue());
                }
                return Double.valueOf(CsM.doubleValue());
            } else if (r3.E2K() == AnonymousClass05K.A0j) {
                return r3.E2L().Eyf();
            } else {
                Integer E2K2 = r3.E2K();
                if (E2K2 != null) {
                    str = C9817Rhf.A00(E2K2);
                } else {
                    str = "null";
                }
                throw new IllegalStateException(002.A0R("unsupported token type ", str));
            }
        }
    }

    public static HashMap A01(C276424tJ r3) {
        if (r3.E2K() != AnonymousClass05K.A0C) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (r3.Crg() != AnonymousClass05K.A0N) {
            String E2H = r3.E2H();
            r3.Crg();
            hashMap.put(E2H, A00(r3));
        }
        return hashMap;
    }
}
