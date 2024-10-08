package X;

import java.io.IOException;
import java.util.HashMap;

public final class LGy {
    public static C61284K0v parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            16L A11 = r8.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r7 = 16L.A09;
                if (A1J != r7) {
                    String A17 = AnonymousClass7TE.A17(r8);
                    if ("cxp_deep_deletion_global_response".equals(A17)) {
                        HashMap hashMap = null;
                        if (r8.A11() == r2) {
                            HashMap A1E = AnonymousClass7TE.A1E();
                            while (r8.A1J() != r7) {
                                String A1P = r8.A1P();
                                r8.A1J();
                                if (r8.A11() == 16L.A0G) {
                                    A1E.put(A1P, (Object) null);
                                } else {
                                    Boolean A0S = AnonymousClass7TF.A0S(r8);
                                    if (A0S != null) {
                                        A1E.put(A1P, A0S);
                                    }
                                }
                            }
                            hashMap = A1E;
                        }
                        r1.A05 = hashMap;
                    } else if (AnonymousClass000.A00(3000).equals(A17)) {
                        r1.A02 = AnonymousClass7TF.A0S(r8);
                    } else if (AnonymousClass000.A00(3109).equals(A17)) {
                        r1.A03 = AnonymousClass7TF.A0S(r8);
                    } else if (AnonymousClass000.A00(3110).equals(A17)) {
                        r1.A04 = AnonymousClass7TF.A0S(r8);
                    } else if (AnonymousClass000.A00(5358).equals(A17)) {
                        r1.A01 = 1Xj.A00(r8);
                    } else {
                        1XY.A01(r8, r1, A17);
                    }
                    r8.A0z();
                } else {
                    HashMap hashMap2 = r1.A05;
                    boolean A14 = C41845B3m.A14(r1.A02);
                    r1.A00 = new C47154DrV(r1.A01, r1.A03, r1.A04, hashMap2, A14);
                    return r1;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
