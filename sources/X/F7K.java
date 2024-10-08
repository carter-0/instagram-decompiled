package X;

import java.io.IOException;
import java.util.HashMap;

public final class F7K {
    public static DwQ parseFromJson(16F r8) {
        FAD fad;
        0qQ.A0B(r8, 0);
        try {
            1XQ r0 = new 1XQ();
            16L A11 = r8.A11();
            16L r3 = 16L.A0D;
            if (A11 != r3) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r7 = 16L.A09;
                if (A1J == r7) {
                    return r0;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("created_user".equals(A17)) {
                    r0.A01 = C41845B3m.A0a(r8, false);
                } else if ("existing_user".equals(A17)) {
                    r0.A05 = r8.A0d();
                } else if ("account_created".equals(A17)) {
                    r0.A04 = r8.A0d();
                } else {
                    HashMap hashMap = null;
                    if ("eligible_login_account_data".equals(A17)) {
                        if (r8.A11() == r3) {
                            hashMap = AnonymousClass7TE.A1E();
                            while (r8.A1J() != r7) {
                                C41847B3o.A1M(r8, hashMap);
                            }
                        }
                        r0.A03 = hashMap;
                    } else if ("errors".equals(A17)) {
                        16L A112 = r8.A11();
                        if (A112 == r3) {
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            StringBuilder A1A2 = AnonymousClass7TE.A1A();
                            while (r8.A1J() != r7) {
                                A1A.append(r8.A0q());
                                A1A.append(',');
                                r8.A1J();
                                while (r8.A1J() != 16L.A08) {
                                    A1A2.append(r8.A1P());
                                    A1A2.append(10);
                                }
                            }
                            if (A1A.length() > 0) {
                                A1A.deleteCharAt(A1A.length() - 1);
                            }
                            if (A1A2.length() > 0) {
                                A1A2.deleteCharAt(A1A2.length() - 1);
                            }
                            fad = new FAD(A1A.toString(), A1A2.toString());
                        } else {
                            if (A112 == 16L.A0C) {
                                r8.A0z();
                            }
                            fad = null;
                        }
                        r0.A00 = fad;
                    } else if ("force_qe_sync".equals(A17)) {
                        r0.A06 = r8.A0d();
                    } else if ("session_flush_nonce".equals(A17)) {
                        r0.A02 = AnonymousClass7TG.A0l(r8);
                    } else {
                        1XY.A01(r8, r0, A17);
                    }
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
