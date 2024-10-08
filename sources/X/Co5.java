package X;

import java.io.IOException;
import java.util.HashMap;

public abstract class Co5 {
    public static CFV parseFromJson(16F r8) {
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
                String A17 = AnonymousClass7TE.A17(r8);
                if ("reels".equals(A17)) {
                    HashMap hashMap = null;
                    if (r8.A11() == r7) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (r8.A1J() != r6) {
                            String A1P = r8.A1P();
                            if (C41845B3m.A0W(r8) == 16L.A0G) {
                                A1E.put(A1P, (Object) null);
                            } else {
                                AnonymousClass3HX parseFromJson = AnonymousClass3HR.parseFromJson(r8);
                                if (parseFromJson != null) {
                                    A1E.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = A1E;
                    }
                    r0.A00 = hashMap;
                } else {
                    1XY.A01(r8, r0, A17);
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
