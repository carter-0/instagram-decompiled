package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.B6j  reason: case insensitive filesystem */
public final class C41911B6j {
    public static CFK parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r0 = new 1XQ();
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
                    return r0;
                }
                String A0q = r8.A0q();
                r8.A1J();
                if ("comment_infos".equals(A0q)) {
                    HashMap hashMap = null;
                    if (r8.A11() == r7) {
                        HashMap hashMap2 = new HashMap();
                        while (r8.A1J() != r6) {
                            String A1P = r8.A1P();
                            r8.A1J();
                            if (r8.A11() == 16L.A0G) {
                                hashMap2.put(A1P, (Object) null);
                            } else {
                                C45285Cto parseFromJson = C41910B6i.parseFromJson(r8);
                                if (parseFromJson != null) {
                                    hashMap2.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    r0.A00 = hashMap;
                } else {
                    1XY.A01(r8, r0, A0q);
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
