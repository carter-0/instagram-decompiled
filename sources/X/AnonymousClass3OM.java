package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3OM  reason: invalid class name */
public abstract class AnonymousClass3OM {
    public static AnonymousClass3ON parseFromJson(16F r9) {
        Object obj;
        int i;
        0qQ.A0B(r9, 0);
        try {
            AnonymousClass3ON r5 = new AnonymousClass3ON();
            16L A11 = r9.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r9.A0z();
                return null;
            }
            while (true) {
                16L A1J = r9.A1J();
                16L r8 = 16L.A09;
                if (A1J == r8) {
                    break;
                }
                String A0q = r9.A0q();
                r9.A1J();
                if ("badge_count_map".equals(A0q)) {
                    HashMap hashMap = null;
                    if (r9.A11() == r7) {
                        HashMap hashMap2 = new HashMap();
                        while (r9.A1J() != r8) {
                            String A1P = r9.A1P();
                            r9.A1J();
                            if (r9.A11() == 16L.A0G) {
                                hashMap2.put(A1P, (Object) null);
                            } else {
                                Integer valueOf = Integer.valueOf(r9.A1D());
                                if (valueOf != null) {
                                    hashMap2.put(A1P, valueOf);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    0qQ.A0B(hashMap, 0);
                    r5.A01 = hashMap;
                } else if ("total_count".equals(A0q)) {
                    r5.A00 = r9.A1D();
                }
                r9.A0z();
            }
            for (Object next : r5.A01.keySet()) {
                0qQ.A07(next);
                String str = (String) next;
                Integer num = (Integer) r5.A01.get(str);
                0qQ.A0B(str, 0);
                Iterator it = 2aD.A04.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (0qQ.A0K(((2aD) obj).A01, str)) {
                        break;
                    }
                }
                Object obj2 = (C71062aE) obj;
                if (obj2 == null) {
                    obj2 = new Ff4(str, str);
                }
                Map map = r5.A02;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                map.put(obj2, Integer.valueOf(i));
            }
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
