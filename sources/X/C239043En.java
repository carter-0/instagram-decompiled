package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.3En  reason: invalid class name and case insensitive filesystem */
public final class C239043En {
    public static C239033Em parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            C239033Em r0 = new C239033Em();
            16L A11 = r9.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r9.A0z();
                return null;
            }
            while (true) {
                16L A1J = r9.A1J();
                16L r6 = 16L.A09;
                if (A1J == r6) {
                    return r0;
                }
                String A0q = r9.A0q();
                r9.A1J();
                if ("badge_payload".equals(A0q)) {
                    HashMap hashMap = null;
                    if (r9.A11() == r7) {
                        HashMap hashMap2 = new HashMap();
                        while (r9.A1J() != r6) {
                            String A1P = r9.A1P();
                            r9.A1J();
                            if (r9.A11() == 16L.A0G) {
                                hashMap2.put(A1P, (Object) null);
                            } else {
                                AnonymousClass3ON parseFromJson = AnonymousClass3OM.parseFromJson(r9);
                                if (parseFromJson != null) {
                                    hashMap2.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    0qQ.A0B(hashMap, 0);
                    r0.A00 = hashMap;
                } else {
                    1XY.A01(r9, r0, A0q);
                }
                r9.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
