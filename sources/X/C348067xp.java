package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.7xp  reason: invalid class name and case insensitive filesystem */
public abstract class C348067xp {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.7xq, java.lang.Object] */
    public static C348077xq parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            16L A11 = r8.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r6 = 16L.A09;
                if (A1J == r6) {
                    return obj;
                }
                String A0q = r8.A0q();
                r8.A1J();
                if ("vocab".equals(A0q)) {
                    HashMap hashMap = null;
                    if (r8.A11() == r7) {
                        HashMap hashMap2 = new HashMap();
                        while (r8.A1J() != r6) {
                            String A1P = r8.A1P();
                            r8.A1J();
                            if (r8.A11() == 16L.A0G) {
                                hashMap2.put(A1P, (Object) null);
                            } else {
                                Integer valueOf = Integer.valueOf(r8.A1D());
                                if (valueOf != null) {
                                    hashMap2.put(A1P, valueOf);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    obj.A00 = hashMap;
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
