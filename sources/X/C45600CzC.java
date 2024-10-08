package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.CzC  reason: case insensitive filesystem */
public final class C45600CzC {
    public static CDH parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r6 = new 1XQ();
            16L A11 = r8.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r5 = 16L.A09;
                if (A1J != r5) {
                    String A17 = AnonymousClass7TE.A17(r8);
                    if ("product_configs".equals(A17)) {
                        HashMap hashMap = null;
                        if (r8.A11() == r7) {
                            HashMap A1E = AnonymousClass7TE.A1E();
                            while (r8.A1J() != r5) {
                                String A1P = r8.A1P();
                                if (C41845B3m.A0W(r8) == 16L.A0G) {
                                    A1E.put(A1P, (Object) null);
                                } else {
                                    C47209Dsw parseFromJson = C44234Cav.parseFromJson(r8);
                                    if (parseFromJson != null) {
                                        A1E.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1E;
                        }
                        r6.A01 = hashMap;
                    } else {
                        1XY.A01(r8, r6, A17);
                    }
                    r8.A0z();
                } else {
                    r6.A00 = new C47210Dsx(r6.A01);
                    return r6;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
