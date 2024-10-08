package X;

import java.io.IOException;
import java.util.HashMap;

public abstract class A1K {
    public static 1NL parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1NL r0 = new 1NL();
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
                if ("reel_tray_impressions".equals(AnonymousClass7TE.A17(r8))) {
                    HashMap hashMap = null;
                    if (r8.A11() == r7) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (r8.A1J() != r6) {
                            String A1P = r8.A1P();
                            r8.A1J();
                            if (r8.A11() == 16L.A0G) {
                                A1E.put(A1P, (Object) null);
                            } else {
                                Long A0Z = AnonymousClass7TF.A0Z(r8);
                                if (A0Z != null) {
                                    A1E.put(A1P, A0Z);
                                }
                            }
                        }
                        hashMap = A1E;
                    }
                    r0.A00 = hashMap;
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
